package swingPackage;


import javax.swing.JFrame;




import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class Profile extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JLabel lblProfile;
	private JLabel lblCompatabilty;
	private JLabel lblSafe;
	private JLabel lblTableOfMedication;
	private JLabel lblNewLabel_1;
	private JButton btnCalculate;
	private JLabel lblClickHereTo;


	/**
	 * Create the frame.
	 */
	public Profile() {
		System.out.println("Building profile page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();

		contentPane.setBackground(UIManager.getColor("menu"));
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHome = new JButton("Home");
		btnHome.setIcon(new ImageIcon(Profile.class.getResource("/javax/swing/plaf/metal/icons/ocean/homeFolder.gif")));
		btnHome.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.runHome();
			}
		});
		btnHome.setBounds(644, 11, 130, 48);
		contentPane.add(btnHome);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 101, 764, 212);
		contentPane.add(scrollPane);
		
		DefaultTableModel model = new DefaultTableModel(); 
		JTable table = new JTable(model); 
		table.setBorder(new BevelBorder(BevelBorder.RAISED, SystemColor.textHighlight, null, null, null));

		// Create columns 
		for (int i=0; i < Main.getHeaders().size(); i++)
		{
			model.addColumn((Main.getHeaders().get(i)));
		}
 

		// Append rows 
		for (int i=0; i < Main.getPharmaceuticalCompany().size(); i++)
		{
		model.addRow(new Object[]{
				   Main.getPharmaceuticalCompany().get(i),
				   Main.getMedication().get(i),
				   Main.getStrengthMG().get(i),
				   Main.getBarCode().get(i),
				   Main.getTabletsPerPackage().get(i),
				});
		}
		
		table.setBounds(10, 104, 414, 112);
		scrollPane.setViewportView(table);
		
		lblProfile = new JLabel("Profile");
		lblProfile.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 17));
		lblProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfile.setBounds(10, 11, 764, 35);
		contentPane.add(lblProfile);
		
		lblCompatabilty = new JLabel("Compatabilty:");
		lblCompatabilty.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		lblCompatabilty.setBounds(170, 45, 110, 17);
		contentPane.add(lblCompatabilty);
		
		lblTableOfMedication = new JLabel("Table of medication");
		lblTableOfMedication.setHorizontalAlignment(SwingConstants.CENTER);
		lblTableOfMedication.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblTableOfMedication.setBounds(10, 83, 764, 17);
		contentPane.add(lblTableOfMedication);
		
		//Show safety of product
		lblSafe = new JLabel();
		lblSafe.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		lblSafe.setBounds(295, 45, 322, 17);
		contentPane.add(lblSafe);
		int numberOfTablets = Main.getMedication().size();
		
		
		
//		if (unsafe == false)
		if(numberOfTablets <= 5)
		{
			lblSafe.setForeground(new Color(0, 100, 0));
			lblSafe.setText("safe");
			try {
				lblNewLabel_1 = new JLabel(new ImageIcon(ImageIO.read(new File("Resources/Green.png"))));
				lblNewLabel_1.setBounds(120, 30, 40, 35);
				contentPane.add(lblNewLabel_1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
//		else if (unsafe == true && veryUnsafe == false)
		else if (numberOfTablets <=8)
		{
			lblSafe.setText("avoid- consume with caution");
			lblSafe.setForeground(new Color(255, 165, 0));
			try {
				lblNewLabel_1 = new JLabel(new ImageIcon(ImageIO.read(new File("Resources/Orange.png"))));
				lblNewLabel_1.setBounds(120, 30, 40, 35);
				contentPane.add(lblNewLabel_1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		else if (unsafe == true && veryUnsafe == true)
		else
		{
			lblSafe.setText("unsafe- do not consume");
			lblSafe.setForeground(new Color(255, 0, 0));
			try {
				lblNewLabel_1 = new JLabel(new ImageIcon(ImageIO.read(new File("Resources/Red.png"))));
				lblNewLabel_1.setBounds(120, 30, 40, 35);
				contentPane.add(lblNewLabel_1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

		
		btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.runTest();
			}
		});
		btnCalculate.setIcon(new ImageIcon(Profile.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		btnCalculate.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnCalculate.setBounds(26, 343, 130, 48);
		contentPane.add(btnCalculate);
		
		lblClickHereTo = new JLabel("Click here to calculate your weekly dosage");
		lblClickHereTo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblClickHereTo.setBounds(170, 359, 253, 17);
		contentPane.add(lblClickHereTo);
		try {
			lblNewLabel_1 = new JLabel(new ImageIcon(ImageIO.read(new File("Resources/Profile.png"))));
			lblNewLabel_1.setBounds(0, 0, 784, 411);
			contentPane.add(lblNewLabel_1);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
				
	}
}
