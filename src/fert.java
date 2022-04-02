import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class fert extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fert frame = new fert();
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
	public fert() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 799);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 120, 776, 629);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		layeredPane.add(panel, "name_1102453667294000");
		panel.setLayout(null);
		///////////////////////////////////////////////////////////////////////
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setBounds(10, 11, 756, 189);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(((new ImageIcon(fert.class.getResource("/image/download.jpg"))).getImage()).getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH)));

		
		lblNewLabel_1.setBounds(10, 11, 134, 167);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nitrogen Fertilizer");
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_2.setBounds(151, 11, 225, 49);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Quantity: 1kg");
		lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_3.setBounds(154, 64, 164, 27);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("price: 200Rs");
		lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_4.setBounds(328, 53, 128, 49);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Description");
		lblNewLabel_5.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_5.setBounds(154, 99, 255, 79);
		panel_2.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton.setBounds(497, 23, 224, 57);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buy Now");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton_1.setBounds(497, 99, 225, 57);
		panel_2.add(btnNewButton_1);
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(Color.GRAY);
		panel_21.setBounds(10, 211, 756, 198);
		panel.add(panel_21);
		panel_21.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(((new ImageIcon(fert.class.getResource("/image/71nbS2P3lgL._SY879_.jpg"))).getImage()).getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_11.setBounds(10, 11, 134, 167);
		panel_21.add(lblNewLabel_11);
		
		JLabel lblNewLabel_21 = new JLabel("Potassium Fertilizer");
		lblNewLabel_21.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_21.setBounds(151, 11, 225, 49);
		panel_21.add(lblNewLabel_21);
		
		JLabel lblNewLabel_31 = new JLabel("Quantity: 50kg");
		lblNewLabel_31.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_31.setBounds(154, 64, 164, 27);
		panel_21.add(lblNewLabel_31);
		
		JLabel lblNewLabel_41 = new JLabel("price: 1000Rs");
		lblNewLabel_41.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_41.setBounds(328, 53, 146, 49);
		panel_21.add(lblNewLabel_41);
		
		JLabel lblNewLabel_51 = new JLabel("Description");
		lblNewLabel_51.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_51.setBounds(154, 99, 255, 79);
		panel_21.add(lblNewLabel_51);
		
		JButton btnNewButton1 = new JButton("Add to Cart");
		btnNewButton1.setBackground(Color.DARK_GRAY);
		btnNewButton1.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton1.setBounds(497, 23, 224, 57);
		panel_21.add(btnNewButton1);
		
		JButton btnNewButton_11 = new JButton("Buy Now");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_11.setBackground(Color.DARK_GRAY);
		btnNewButton_11.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton_11.setBounds(497, 99, 225, 57);
		panel_21.add(btnNewButton_11);
		///////////////////////////////////////////////////////////////////////////////////
		JPanel panel_211 = new JPanel();
		panel_211.setBackground(Color.GRAY);
		panel_211.setBounds(10, 420, 756, 198);
		panel.add(panel_211);
		panel_211.setLayout(null);
		
		JLabel lblNewLabel_111 = new JLabel("");
		lblNewLabel_111.setIcon(new ImageIcon(((new ImageIcon(fert.class.getResource("/image/organic-phosphorus-liquid-fertilizers-228174.jpg"))).getImage()).getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH)));

		
		lblNewLabel_111.setBounds(10, 11, 134, 167);
		panel_211.add(lblNewLabel_111);
		
		JLabel lblNewLabel_211 = new JLabel("Phosphorous Fertilizer");
		lblNewLabel_211.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_211.setBounds(151, 11, 258, 49);
		panel_211.add(lblNewLabel_211);
		
		JLabel lblNewLabel_311 = new JLabel("Quantity: 50kg");
		lblNewLabel_311.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_311.setBounds(154, 64, 164, 27);
		panel_211.add(lblNewLabel_311);
		
		JLabel lblNewLabel_411 = new JLabel("price: 800Rs");
		lblNewLabel_411.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_411.setBounds(328, 53, 128, 49);
		panel_211.add(lblNewLabel_411);
		
		JLabel lblNewLabel_511 = new JLabel("Description");
		lblNewLabel_511.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_511.setBounds(154, 99, 255, 79);
		panel_211.add(lblNewLabel_511);
		
		JButton btnNewButton11 = new JButton("Add to Cart");
		btnNewButton11.setBackground(Color.DARK_GRAY);
		btnNewButton11.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton11.setBounds(497, 23, 224, 57);
		panel_211.add(btnNewButton11);
		
		JButton btnNewButton_111 = new JButton("Buy Now");
		btnNewButton_111.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_111.setBackground(Color.DARK_GRAY);
		btnNewButton_111.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton_111.setBounds(497, 99, 225, 57);
		panel_211.add(btnNewButton_111);
		///////////////////////////////////////////////////////////////////////////////////////////
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		layeredPane.add(panel_1, "name_1102453684620000");
		
		JLabel lblNewLabel = new JLabel("FERTILIZERS");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblNewLabel.setBounds(256, 29, 277, 55);
		contentPane.add(lblNewLabel);
	}
}
