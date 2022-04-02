

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class bill extends JFrame {

	private JPanel contentPane;
	public JLabel d,e,f;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill frame = new bill();
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
	public bill() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 596);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INVOICE");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblNewLabel.setBounds(120, 55, 203, 45);
		contentPane.add(lblNewLabel);
		
		 d = new JLabel("New label");
		 d.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		d.setBounds(154, 272, 150, 32);
		contentPane.add(d);
		
		 e = new JLabel("New label");
		 e.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		e.setBounds(154, 315, 150, 32);
		contentPane.add(e);
		
		 f = new JLabel("New label");
		 f.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		f.setBounds(154, 358, 150, 32);
		contentPane.add(f);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(85, 140, 265, 318);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Payment Mode - Cash on Delivery");
		lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblNewLabel_3.setBounds(20, 277, 245, 30);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(((new ImageIcon(bill.class.getResource("/image/images (2).jpeg"))).getImage()).getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_1.setBounds(64, -17, 150, 150);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		btnNewButton.setBounds(129, 469, 175, 45);
		contentPane.add(btnNewButton);
	}
}
