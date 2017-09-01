package swingPackage;


import java.io.FileReader;
import java.util.ArrayList;

import com.opencsv.CSVReader;


public class Main {

	private static ArrayList<String> headers = new ArrayList<String>();
	private static ArrayList<String> pharmaceuticalCompany = new ArrayList<String>();
	private static ArrayList<String> medication = new ArrayList<String>();
	private static ArrayList<Double> strengthMG = new ArrayList<Double>();
	private static ArrayList<Long> barCode = new ArrayList<Long>();
	private static ArrayList<Integer> tabletsPerPackage = new ArrayList<Integer>();
	private static Home frame1 = new Home();
	private static Profile frame2 = new Profile();
	private static Input frame3 = new Input();
	private static Confirmation frame4 = new Confirmation();
	private static Calculations frame5 = new Calculations();
	//public static Home2 = new Home2;
	
	public static void main(String[] args) throws Exception
	{

		//CSV: http://opencsv.sourceforge.net/
		//READ FILE AND STORE DATA
		CSVReader reader = new CSVReader(new FileReader("MedicineInformation.csv"));
		String [] nextLine;
		// nextLine[] is an array of values from the line
		boolean header = false;
	    while ((nextLine = reader.readNext()) != null) {
	    	if (header == false)
	    	{
	    		for (int i=0; i<nextLine.length; i++)
	    		{
	    			//Create array for headers
	    			headers.add(nextLine[i]);
	    			header = true;
	    		}
	    	}
	    	
    		else
    		{
    			

		    	pharmaceuticalCompany.add(nextLine[0]);
		    	
		    	medication.add(nextLine[1]);

		    	double d = Double.valueOf( (String) nextLine[2] );
		    	Double num = null;
		        num = (Double) d;
		        strengthMG.add(num);
		        
		        Double d2 = Double.valueOf( (String) nextLine[3] );
		        Long barCodeValue = d2.longValue(); 
		        barCode.add(barCodeValue);
		        
		        Double d3 = Double.valueOf( (String) nextLine[4] );
		        Integer tabletsPerPackageValue = d3.intValue(); 
		        tabletsPerPackage.add(tabletsPerPackageValue);

		    }
	      }
	    System.out.println("Data: ");
	    System.out.println(headers);
	    System.out.println(pharmaceuticalCompany); 
	    System.out.println(medication);
	    System.out.println(strengthMG);
	    System.out.println(barCode);
	    System.out.println(tabletsPerPackage);

		//RUN GUI
	    frame1.setVisible(true);
		//runHome();
		
	    reader.close(); 
	}
	
	public static void runHome() {
		try {
			frame1 = new Home();
			frame1.setVisible(true);
			frame2.dispose();
			frame3.dispose();
			frame4.dispose();
			frame5.dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void runProfile() {
		try {
			frame2 = new Profile();
			frame1.dispose();
			frame2.setVisible(true);
			frame3.dispose();
			frame4.dispose();
			frame5.dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void runInput() {
		try {
			frame3 = new Input();
			frame1.dispose();
			frame2.dispose();
			frame3.setVisible(true);
			frame4.dispose();
			frame5.dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void runConfirmation()
	{
		try {
			frame4 = new Confirmation();
			frame1.dispose();
			frame2.dispose();
			frame3.dispose();
			frame4.setVisible(true);
			frame5.dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void runTest()
	{
		try {
			frame5 = new Calculations();
			frame1.dispose();
			frame2.dispose();
			frame3.dispose();
			frame4.dispose();
			frame5.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//GetArrays
   public static ArrayList<String> getHeaders() {
       return headers;
   }
   public static ArrayList<String> getPharmaceuticalCompany() {
       return pharmaceuticalCompany;
   }
   public static ArrayList<String> getMedication() {
       return medication;
   }
   public static ArrayList<Double> getStrengthMG() {
       return strengthMG;
   }
   public static ArrayList<Long> getBarCode() {
       return barCode;
   }
   public static ArrayList<Integer> getTabletsPerPackage() {
       return tabletsPerPackage;
   }

   //AddToArrays
   public static boolean addNewEntry(String toAdd1, String toAdd2, Double toAdd3, Long toAdd4, Integer toAdd5) {
	   pharmaceuticalCompany.add(toAdd1);
	   medication.add(toAdd2);
	   strengthMG.add(toAdd3);
	   barCode.add(toAdd4);
	   tabletsPerPackage.add(toAdd5);
	   return true;
   }
   public static boolean addPharmaceuticalCompany(String toAdd) {
       pharmaceuticalCompany.add(toAdd);
       return true;
   }
   public static boolean addMedication(String toAdd) {
       medication.add(toAdd);
       return true;
   }
   public static boolean addStrengthMG(Double toAdd) {
       strengthMG.add(toAdd);
       return true;
   }
   public static boolean addBarCode(Long toAdd) {
       barCode.add(toAdd);
       return true;
   }
   public static boolean addTabletsPerPackage(Integer toAdd) {
       tabletsPerPackage.add(toAdd);
       return true;
   }
   
   //input number of medicines in profile
   public static int totalTablets(int totalMeds)
   {
	   int total = totalMeds*4*7;
	   return total;
   }
	   
}
