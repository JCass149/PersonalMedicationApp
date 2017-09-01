package swingPackage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class Home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnProfile;
	private JButton btnAddMedication;
	private JLabel label;
	private JLabel lblClickHereTo;
	private JLabel lblAndForAn;
	private JLabel lblNewLabel;


	/**
	 * Create the frame.
	 */
	public Home() {
		System.out.println("Building home page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		btnProfile = new JButton("Profile");
		btnProfile.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				Main.runProfile();
				}
		});
		btnProfile.setBounds(371, 127, 130, 48);
		contentPane.add(btnProfile);
		
		btnAddMedication = new JButton("Add Medication");
		btnAddMedication.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		btnAddMedication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg2) {
				Main.runInput();
			}
		});
		btnAddMedication.setBounds(371, 268, 130, 48);
		contentPane.add(btnAddMedication);
		
		JLabel lblPersonalMedicationAdvisor = new JLabel("Personal Medication Advisor");
		lblPersonalMedicationAdvisor.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 34));
		lblPersonalMedicationAdvisor.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonalMedicationAdvisor.setBounds(110, 25, 664, 48);
		contentPane.add(lblPersonalMedicationAdvisor);
		
		
		label = new JLabel("Click here to add more medication to your current profile");
		label.setLabelFor(btnAddMedication);
		label.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		label.setBounds(371, 304, 331, 48);
		contentPane.add(label);

		try {
			lblNewLabel = new JLabel(new ImageIcon(ImageIO.read(new File("Resources/ProfilePic.png"))));
			lblNewLabel.setBounds(257, 115, 104, 91);
			contentPane.add(lblNewLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			lblNewLabel = new JLabel(new ImageIcon(ImageIO.read(new File("Resources/Add.png"))));
			lblNewLabel.setBounds(257, 250, 104, 91);
			contentPane.add(lblNewLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lblClickHereTo = new JLabel("Click here to view a list of your current medication ");
		lblClickHereTo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblClickHereTo.setBounds(371, 174, 403, 26);
		contentPane.add(lblClickHereTo);
		
		lblAndForAn = new JLabel("and for an evaluation on whether they are safe to consume");
		lblAndForAn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblAndForAn.setBounds(371, 192, 403, 26);
		contentPane.add(lblAndForAn);
		
		try {
			lblNewLabel = new JLabel(new ImageIcon(ImageIO.read(new File("Resources/Home.png"))));
			lblNewLabel.setBounds(0, 0, 784, 411);
			contentPane.add(lblNewLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		

		

	}
}
