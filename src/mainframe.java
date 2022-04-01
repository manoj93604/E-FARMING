

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class mainframe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainframe frame = new mainframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainframe() {
		

		try {
			for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if("Windows".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}catch (Exception ex) {
			ex.getMessage();
		}
		initComponents();
	}
		
		
		
		
		
		
		
		
		
		
		private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1461, 840);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 263, 801);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Agriculture & Horticulture ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 11, 243, 45);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Corner");
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblNewLabel_1.setBounds(99, 39, 74, 36);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("__________________________________________");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 67, 263, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Input");
		lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 86, 103, 24);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Seeds");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//Desktop.getDesktop().browse(new URL("http://google.com").toURI());
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 121, 243, 29);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Fertiliser");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(10, 161, 243, 29);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Pesticide");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.setBounds(10, 201, 243, 29);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Storage");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.setBounds(10, 241, 243, 29);
		panel.add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("Market Price");
		lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 281, 163, 24);
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton_4 = new JButton("View Price");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.setBounds(10, 316, 243, 29);
		panel.add(btnNewButton_4);
		
		JLabel lblNewLabel_5 = new JLabel("Health Cards");
		lblNewLabel_5.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_5.setBounds(10, 356, 163, 24);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton_5 = new JButton("Soil Health Card");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_5.setBounds(10, 391, 243, 29);
		panel.add(btnNewButton_5);
		
		JLabel lblNewLabel_6 = new JLabel("Animal Husbandary Corner");
		lblNewLabel_6.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblNewLabel_6.setBounds(10, 431, 243, 45);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("________________________________________");
		lblNewLabel_7.setBounds(10, 462, 243, 14);
		panel.add(lblNewLabel_7);
		
		JButton btnNewButton_6 = new JButton("Veterinary Center");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_6.setBounds(10, 487, 243, 29);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Vaccine Schedule");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_7.setBounds(10, 527, 243, 29);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Veterinary Doctor");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_8.setBounds(10, 567, 243, 29);
		panel.add(btnNewButton_8);
		
		JLabel lblNewLabel_8 = new JLabel("Gov Sites");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblNewLabel_8.setBounds(10, 607, 243, 45);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("_______________________________________");
		lblNewLabel_9.setBounds(10, 638, 243, 14);
		panel.add(lblNewLabel_9);
		
		JButton btnNewButton_9 = new JButton("Patta/Chitta");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_9.setBounds(10, 663, 243, 29);
		panel.add(btnNewButton_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(264, 0, 1181, 60);
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_10 = new JButton("Home");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-home-30.png")));
		btnNewButton_10.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton_10.setBounds(435, 11, 125, 38);
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Profile");
		btnNewButton_11.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-male-user-30.png")));
		btnNewButton_11.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton_11.setBounds(570, 11, 125, 38);
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("About Us");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_12.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-more-info-30.png")));
		btnNewButton_12.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton_12.setBounds(705, 11, 140, 38);
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Register");
		btnNewButton_13.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-add-user-male-30.png")));
		btnNewButton_13.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton_13.setBounds(855, 11, 125, 38);
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("LogOut");
		btnNewButton_14.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-logout-30.png")));
		btnNewButton_14.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton_14.setBounds(990, 11, 120, 38);
		panel_1.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("");
		btnNewButton_15.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-bulleted-list-30.png")));
		btnNewButton_15.setBounds(1120, 11, 51, 38);
		panel_1.add(btnNewButton_15);
	}
}
