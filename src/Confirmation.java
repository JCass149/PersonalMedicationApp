package swingPackage;


import javax.swing.JFrame;




import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Font;
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

public class Confirmation extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblProfile;
	private JLabel lblTableOfMedication;
	private JLabel lblNewLabel_1;
	private JLabel lblClickHereTo_1;


	/**
	 * Create the frame.
	 */
	public Confirmation() {
		System.out.println("Building confirmation page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();

		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DefaultTableModel model = new DefaultTableModel();

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
		
		lblProfile = new JLabel("Confirmation");
		lblProfile.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 17));
		lblProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfile.setBounds(10, 11, 764, 35);
		contentPane.add(lblProfile);
		
		lblTableOfMedication = new JLabel("Your medication was successfully added to your profile");
		lblTableOfMedication.setHorizontalAlignment(SwingConstants.CENTER);
		lblTableOfMedication.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		lblTableOfMedication.setBounds(10, 95, 764, 17);
		contentPane.add(lblTableOfMedication);
		
		JLabel lblClickHereTo = new JLabel("Click here to add further medication");
		lblClickHereTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblClickHereTo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblClickHereTo.setBounds(10, 175, 764, 17);
		contentPane.add(lblClickHereTo);
		
		lblClickHereTo_1 = new JLabel("Click here to view your current profile");
		lblClickHereTo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblClickHereTo_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblClickHereTo_1.setBounds(10, 297, 764, 17);
		contentPane.add(lblClickHereTo_1);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.runProfile();
			}
		});
		
		JButton btnHome = new JButton("Add medication");
		btnHome.setIcon(new ImageIcon(Confirmation.class.getResource("/javax/swing/plaf/metal/icons/ocean/upFolder.gif")));
		btnHome.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.runInput();
			}
		});
		btnHome.setBounds(307, 203, 178, 48);
		contentPane.add(btnHome);
		btnProfile.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnProfile.setBounds(333, 325, 130, 48);
		contentPane.add(btnProfile);
		try {
			lblNewLabel_1 = new JLabel(new ImageIcon(ImageIO.read(new File("Resources/Success.png"))));
			lblNewLabel_1.setBounds(0, 0, 784, 411);
			contentPane.add(lblNewLabel_1);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
				
	}
}
