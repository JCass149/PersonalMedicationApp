package swingPackage;


import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JSpinner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.SpinnerNumberModel;


public class Input extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JSpinner spinner;
	private JTextPane txtpnDataValidation;
	private JTextPane txtpnDataValidation2;
	private JTextPane txtpnDataValidation3;
	private JTextPane txtpnDataValidation4;
	private JTextPane txtpnDataValidation5;
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public Input() {
		System.out.println("Building input page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInputMedication = new JLabel("Input Medication");
		lblInputMedication.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 17));
		lblInputMedication.setBackground(SystemColor.activeCaption);
		lblInputMedication.setHorizontalAlignment(SwingConstants.CENTER);
		lblInputMedication.setBounds(10, 11, 764, 35);
		contentPane.add(lblInputMedication);
		
		JLabel lblPleaseInputThe = new JLabel("Please input the required details:");
		lblPleaseInputThe.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		lblPleaseInputThe.setBounds(124, 61, 265, 14);
		contentPane.add(lblPleaseInputThe);
		
		JLabel lblPharmaceuticalCompany = new JLabel("Pharmaceutical company");
		lblPharmaceuticalCompany.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPharmaceuticalCompany.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblPharmaceuticalCompany.setBounds(136, 100, 181, 14);
		contentPane.add(lblPharmaceuticalCompany);
		
		JLabel lblMedication = new JLabel("Medication");
		lblMedication.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMedication.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMedication.setBounds(194, 137, 122, 14);
		contentPane.add(lblMedication);
		
		JLabel lblStrength = new JLabel("Strength (mg)");
		lblStrength.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStrength.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblStrength.setBounds(293, 176, 122, 14);
		contentPane.add(lblStrength);
		
		JLabel lblBarCode = new JLabel("Bar Code");
		lblBarCode.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBarCode.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblBarCode.setBounds(193, 216, 122, 14);
		contentPane.add(lblBarCode);
		
		JLabel lblTabletsPerPackage = new JLabel("Tablets per package");
		lblTabletsPerPackage.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTabletsPerPackage.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblTabletsPerPackage.setBounds(266, 254, 181, 14);
		contentPane.add(lblTabletsPerPackage);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(28, 1, 50, 1));
		spinner.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		spinner.setBounds(449, 252, 67, 20);
		contentPane.add(spinner);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		textField.setBounds(320, 97, 196, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(320, 134, 196, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(419, 172, 97, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(320, 213, 196, 20);
		contentPane.add(textField_3);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setIcon(new ImageIcon(Input.class.getResource("/com/sun/java/swing/plaf/windows/icons/UpFolder.gif")));
		btnAdd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNewEntry();
			}
		});
		btnAdd.setBounds(332, 352, 130, 48);
		contentPane.add(btnAdd);
		
		JButton btnHome = new JButton("Home");
		btnHome.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnHome.setIcon(new ImageIcon(Input.class.getResource("/javax/swing/plaf/metal/icons/ocean/homeFolder.gif")));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.runHome();
			}
		});
		btnHome.setBounds(644, 11, 130, 48);
		contentPane.add(btnHome);
		

		
		txtpnDataValidation2 = new JTextPane();
		txtpnDataValidation2.setEditable(false);
		txtpnDataValidation2.setBackground(SystemColor.info);
		txtpnDataValidation2.setBounds(530, 134, 247, 36);
		txtpnDataValidation2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		txtpnDataValidation2.setVisible(false);
		contentPane.add(txtpnDataValidation2);
		
		txtpnDataValidation3 = new JTextPane();
		txtpnDataValidation3.setEditable(false);
		txtpnDataValidation3.setBackground(SystemColor.info);
		txtpnDataValidation3.setBounds(530, 175, 247, 36);
		txtpnDataValidation3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		txtpnDataValidation3.setVisible(false);
		contentPane.add(txtpnDataValidation3);
		
		txtpnDataValidation4 = new JTextPane();
		txtpnDataValidation4.setEditable(false);
		txtpnDataValidation4.setBackground(SystemColor.info);
		txtpnDataValidation4.setBounds(531, 215, 247, 36);
		txtpnDataValidation4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		txtpnDataValidation4.setVisible(false);
		contentPane.add(txtpnDataValidation4);
		
		txtpnDataValidation5 = new JTextPane();
		txtpnDataValidation5.setEditable(false);
		txtpnDataValidation5.setBackground(SystemColor.info);
		txtpnDataValidation5.setBounds(530, 255, 247, 36);
		txtpnDataValidation5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		txtpnDataValidation5.setVisible(false);
		contentPane.add(txtpnDataValidation5);
		
		txtpnDataValidation = new JTextPane();
		txtpnDataValidation.setBounds(530, 94, 247, 36);
		txtpnDataValidation.setEditable(false);
		txtpnDataValidation.setBackground(SystemColor.info);
		txtpnDataValidation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));	
		txtpnDataValidation.setVisible(false);
		contentPane.add(txtpnDataValidation);
		

		try {
			lblNewLabel = new JLabel(new ImageIcon(ImageIO.read(new File("Resources/Input.png"))));
			lblNewLabel.setBounds(0, 0, 784, 411);
			contentPane.add(lblNewLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public void addNewEntry()
	{
		//create data validation boxes
		boolean noErrors = true;
		txtpnDataValidation.setVisible(false);
		txtpnDataValidation2.setVisible(false);
		txtpnDataValidation3.setVisible(false);
		txtpnDataValidation4.setVisible(false);
		txtpnDataValidation5.setVisible(false);
		//
		//type checks
		boolean isMedDouble = true;
		try
	    {
		double d1 = Double.parseDouble(textField_2.getText());
	      if (d1 <=0)
	      {
	    	  isMedDouble = false;
	      }
	    }
	    catch(NumberFormatException nfe)
	    {
	    	isMedDouble = false;
	    }
		
		boolean isBCLong = true;
		try
	    {
	      @SuppressWarnings("unused")
		long d2 = Long.parseLong(textField_3.getText());
	    }
	    catch(NumberFormatException nfe)
	    {
	    	isBCLong = false;
	    }
		
//		boolean isTPPInt = true;
//		try
//	    {
//	      @SuppressWarnings("unused")
//		int d3 = Integer.parseInt((String) spinner.getValue());
//	    }
//	    catch(NumberFormatException nfe)
//	    {
//	    	isTPPInt = false;
//	    }
		//presence check- check length > 0
		//length check- less than x length
		//type check 
		
		
		if (textField.getText().length()<5)
		{
			txtpnDataValidation.setText("The 'Pharmaceutical company' field must be at least 5 characters long");
			txtpnDataValidation.repaint();
			txtpnDataValidation.setVisible(true);
			noErrors = false;	 
		}
		else if (textField.getText().length()>20)
		{
			txtpnDataValidation.setText("The 'Pharmaceutical company' field must be no longer than 20 characters long");
			txtpnDataValidation.repaint();
			txtpnDataValidation.setVisible(true);
			noErrors = false;	
		}
		
		if (textField_1.getText().length()<=3)
		{
			txtpnDataValidation2.setText("The 'Medicine' field must be at least 3 characters long");
			txtpnDataValidation2.repaint();
			txtpnDataValidation2.setVisible(true);
			
			noErrors = false;
		}
		else if (textField_1.getText().length()>20)
		{
			txtpnDataValidation2.setText("The 'Medicine' field must be no longer than 20 characters long");
			txtpnDataValidation2.repaint();
			txtpnDataValidation2.setVisible(true);
			
			noErrors = false;
		}
		
		if (textField_2.getText().length()==0)
		{
			txtpnDataValidation3.setText("The 'Strength (mg)' field cannot be left empty");
			txtpnDataValidation3.repaint();
			txtpnDataValidation3.setVisible(true);
			noErrors = false;
		}
		else if (isMedDouble == false)
		{
			txtpnDataValidation3.setText("The 'Strength (mg)' field must be of type double and greater than 0 e.g 3.5");
			txtpnDataValidation3.repaint();
			txtpnDataValidation3.setVisible(true);
			noErrors = false;
		}
		else if (textField_2.getText().length()>6)
		{
			txtpnDataValidation3.setText("The 'Strength (mg)' field be longer than 6 digits");
			txtpnDataValidation3.repaint();
			txtpnDataValidation3.setVisible(true);
			noErrors = false;
		}
		
		if (textField_3.getText().length()==0)
		{
			txtpnDataValidation4.setText("The 'Barcode' field cannot be left empty");
			txtpnDataValidation4.repaint();
			txtpnDataValidation4.setVisible(true);
			noErrors = false;
		}
		else if (isBCLong == false){
			txtpnDataValidation4.setText("The 'Barcode' field must only contain numbers");
			txtpnDataValidation4.repaint();
			txtpnDataValidation4.setVisible(true);
			noErrors = false;
		}
		else if (8 > textField_3.getText().length() || textField_3.getText().length() > 20)
		{
			txtpnDataValidation4.setText("The 'Barcode' field must at least 8 digits long but no longer than 20");
			txtpnDataValidation4.repaint();
			txtpnDataValidation4.setVisible(true);
			noErrors = false;
		}
		
		if ((Integer) spinner.getValue()<=0)
		{
			txtpnDataValidation5.setText("The 'Tablets per package' field must be an integer greater than 0");
			txtpnDataValidation5.repaint();
			txtpnDataValidation5.setVisible(true);
			noErrors = false;
		}
//		else if(isTPPInt)
//		{
//			txtpnDataValidation5.setText("The 'Number of tablets per package' field must be an integer");
//			txtpnDataValidation5.repaint();
//			txtpnDataValidation5.setVisible(true);
//			noErrors = false;
//		}
		
		contentPane.repaint();
		
		if (noErrors == true)
		{

		String pC = textField.getText();
		String med = textField_1.getText();
		Double strength = Double.valueOf(textField_2.getText());
		Long bC = Long.valueOf(textField_3.getText()).longValue();
		Integer tPP = (Integer) spinner.getValue();
		Main.addNewEntry(pC, med, strength, bC,  tPP);
		Main.runConfirmation();
		}
		
	}
}
