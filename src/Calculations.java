package swingPackage;

import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextPane;

public class Calculations extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblProfile;
	private JLabel lblTableOfMedication;
	private JLabel lblNewLabel_1;
	private JScrollPane scrollPane;
	private JLabel lblClickHereTo_1;
	private JButton btnProfile;
	private DefaultTableModel testModel;
	private JTable table_1;
	private JLabel lblNumberOfTablets;
	private JLabel label;
	private JLabel lblMgOfDrugs;
	private JLabel label_1;
	private JButton btnRunJunitTest;
	private JScrollPane scrollPane_1;
	private JTextPane txtpnClickHereTo;

	private static DosageUnitTest test = new DosageUnitTest();

	/**
	 * Create the frame.
	 */
	public Calculations() {
		System.out.println("Building calculations page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();

		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblProfile = new JLabel("Weekly Dosage");
		lblProfile.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 17));
		lblProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfile.setBounds(10, 11, 764, 35);
		contentPane.add(lblProfile);
		
		lblTableOfMedication = new JLabel("Here is an evaluation of your weekly dosage");
		lblTableOfMedication.setHorizontalAlignment(SwingConstants.CENTER);
		lblTableOfMedication.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		lblTableOfMedication.setBounds(10, 45, 764, 27);
		contentPane.add(lblTableOfMedication);
		
		lblClickHereTo_1 = new JLabel("Click here to go back to your profile");
		lblClickHereTo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblClickHereTo_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblClickHereTo_1.setBounds(10, 297, 548, 17);
		contentPane.add(lblClickHereTo_1);
		
		btnProfile = new JButton("Profile");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.runProfile();
			}
		});
		btnProfile.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnProfile.setBounds(223, 325, 130, 48);
		contentPane.add(btnProfile);
		
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(20, 83, 538, 192);
		contentPane.add(scrollPane);
		
		testModel = new DefaultTableModel(); 
		table_1 = new JTable(testModel); 
		table_1.setBorder(new BevelBorder(BevelBorder.RAISED, SystemColor.textHighlight, null, null, null));
		
		
		// Create columns 
		testModel.addColumn("Medicine");
		testModel.addColumn("Strength (mg)");
		testModel.addColumn("Tablets per day");
		testModel.addColumn("Tablets per week");
		testModel.addColumn("mg per week"); 

		// Append rows 
		for (int i=0; i < Main.getMedication().size(); i++)
			{
			testModel.addRow(new Object[]{
					   Main.getMedication().get(i),
					   Main.getStrengthMG().get(i),
					   4,
					   4*7,
					   Main.getStrengthMG().get(i)*4*7
					});
			}
		table_1.setBounds(0, 0, 784, 411);
		scrollPane.setViewportView(table_1);
		
		lblNumberOfTablets = new JLabel("Number of tablets per week");
		lblNumberOfTablets.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumberOfTablets.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNumberOfTablets.setBounds(559, 94, 225, 17);
		contentPane.add(lblNumberOfTablets);
		
		int totalMeds = Main.getMedication().size();
		int totalTablets = Main.totalTablets(totalMeds);
		//int totalTablets = Main.getMedication().size()*4*7;
		String toAdd = String.valueOf(totalTablets);
		label = new JLabel();
		label.setText(toAdd);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		label.setBounds(558, 122, 226, 17);
		contentPane.add(label);
		
		lblMgOfDrugs = new JLabel("mg of drugs consumed per week");
		lblMgOfDrugs.setHorizontalAlignment(SwingConstants.CENTER);
		lblMgOfDrugs.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblMgOfDrugs.setBounds(559, 192, 225, 17);
		contentPane.add(lblMgOfDrugs);
		
		
		
		double totalMG = 0;
		for (int i=0; i < Main.getMedication().size(); i++)
		{
				totalMG = totalMG + Main.getStrengthMG().get(i)*4*7;

		}
		
		String toAdd2 = String.valueOf(totalMG);
		label_1 = new JLabel();
		label_1.setText(toAdd2);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		label_1.setBounds(559, 220, 225, 17);
		contentPane.add(label_1);
		
		btnRunJunitTest = new JButton("Run Junit Test");
		btnRunJunitTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				test.testDosage();
			}
		});
		btnRunJunitTest.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnRunJunitTest.setBounds(610, 282, 130, 48);
		contentPane.add(btnRunJunitTest);


		try {
			
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane_1.setToolTipText("");
			scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane_1.setBounds(582, 343, 192, 57);
			contentPane.add(scrollPane_1);
			
			txtpnClickHereTo = new JTextPane();
			txtpnClickHereTo.setText("Click here to run a Junit test for the total number of tablets for a week for the initial data input of 5 medicines. The output will be printed via a System.out.prinln(). ");
			scrollPane_1.setViewportView(txtpnClickHereTo);
			
			lblNewLabel_1 = new JLabel(new ImageIcon(ImageIO.read(new File("Resources/Test.png"))));
			lblNewLabel_1.setBounds(0, 0, 784, 411);
			contentPane.add(lblNewLabel_1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
				
	}
}
