

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class seeds extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					seeds frame = new seeds();
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
	public seeds() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 841);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(); 
		getContentPane().add(scrollPane);
	    scrollPane.setBounds(10, 80, 688, 722);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 686, 177);
		panel_1.setBackground(Color.GRAY);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(((new ImageIcon(seeds.class.getResource("/image/images (2).jpeg"))).getImage()).getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH)));
		
		lblNewLabel_1.setBounds(10, 11, 150, 150);
		panel_1.add(lblNewLabel_1);
		
		JLabel a = new JLabel("Corn");
		a.setFont(new Font("Segoe UI Black", Font.BOLD, 35));
		a.setBounds(170, 11, 136, 35);
		panel_1.add(a);
		
		JLabel b = new JLabel("Quantity : 60kg");
		b.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		b.setBounds(170, 54, 167, 21);
		panel_1.add(b);
		
		JLabel lblNewLabel_4 = new JLabel("Description :");
		lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_4.setBounds(170, 79, 109, 30);
		panel_1.add(lblNewLabel_4);
		
		JLabel c = new JLabel("Price : 1000RS");
		c.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		c.setBounds(302, 52, 187, 21);
		panel_1.add(c);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton.setBounds(489, 75, 187, 35);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buy Now");
		btnNewButton_1.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bill bc=new bill();
				bc.d.setText(a.getText());
				bc.e.setText(b.getText());
				bc.f.setText(c.getText());
				bc.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(489, 126, 187, 35);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 199, 686, 177);
		panel_2.setBackground(Color.GRAY);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(((new ImageIcon(seeds.class.getResource("/image/images (3).jpeg"))).getImage()).getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH)));
		
		lblNewLabel_6.setBounds(10, 11, 150, 150);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Rice");
		lblNewLabel_7.setFont(new Font("Segoe UI Black", Font.BOLD, 35));
		lblNewLabel_7.setBounds(170, 11, 123, 41);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Quantity :80kg");
		lblNewLabel_8.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_8.setBounds(170, 53, 138, 27);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Description :");
		lblNewLabel_9.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_9.setBounds(170, 84, 150, 27);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Price :1500RS");
		lblNewLabel_10.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_10.setBounds(303, 39, 170, 41);
		panel_2.add(lblNewLabel_10);
		
		JButton btnNewButton_2 = new JButton("Add to Cart");
		btnNewButton_2.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton_2.setBounds(492, 62, 184, 41);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Buy Now");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton_3.setBounds(492, 120, 184, 41);
		panel_2.add(btnNewButton_3);
		
		
		JPanel panel_21 = new JPanel();
		panel_21.setBounds(10, 387, 686, 177);
		panel_21.setBackground(Color.GRAY);
		panel.add(panel_21);
		panel_21.setLayout(null);
		
		JLabel lblNewLabel_61 = new JLabel("");
		lblNewLabel_61.setIcon(new ImageIcon(((new ImageIcon(seeds.class.getResource("/image/images (4).jpeg"))).getImage()).getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_61.setBounds(10, 11, 150, 150);
		panel_21.add(lblNewLabel_61);
		
		JLabel lblNewLabel_71 = new JLabel("Ground Nut");
		lblNewLabel_71.setFont(new Font("Segoe UI Black", Font.BOLD, 35));
		lblNewLabel_71.setBounds(170, 11, 227, 41);
		panel_21.add(lblNewLabel_71);
		
		JLabel lblNewLabel_81 = new JLabel("Quantity :20kg");
		lblNewLabel_81.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_81.setBounds(170, 53, 138, 27);
		panel_21.add(lblNewLabel_81);
		
		JLabel lblNewLabel_91 = new JLabel("Description :");
		lblNewLabel_91.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_91.setBounds(170, 84, 150, 27);
		panel_21.add(lblNewLabel_91);
		
		JLabel lblNewLabel_101 = new JLabel("Price :1000RS");
		lblNewLabel_101.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_101.setBounds(312, 44, 170, 41);
		panel_21.add(lblNewLabel_101);
		
		JButton btnNewButton_21 = new JButton("Add to Cart");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_21.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton_21.setBounds(492, 75, 184, 41);
		panel_21.add(btnNewButton_21);
		
		JButton btnNewButton_31 = new JButton("Buy Now");
		btnNewButton_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_31.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton_31.setBounds(492, 120, 184, 41);
		panel_21.add(btnNewButton_31);
		
		////////////////////////////////////////////////////
		JPanel panel_211 = new JPanel();
		panel_211.setBounds(10, 575, 686, 177);
		panel_211.setBackground(Color.GRAY);
		panel.add(panel_211);
		panel_211.setLayout(null);
		
		JLabel lblNewLabel_611 = new JLabel("");
		lblNewLabel_611.setIcon(new ImageIcon(((new ImageIcon(seeds.class.getResource("/image/hybrid-pearl-millet-seed-500x500.jpg"))).getImage()).getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH)));

		lblNewLabel_611.setBounds(10, 11, 150, 150);
		panel_211.add(lblNewLabel_611);
		
		JLabel lblNewLabel_711 = new JLabel("Millet");
		lblNewLabel_711.setFont(new Font("Segoe UI Black", Font.BOLD, 35));
		lblNewLabel_711.setBounds(170, 11, 123, 41);
		panel_211.add(lblNewLabel_711);
		
		JLabel lblNewLabel_811 = new JLabel("Quantity :1kg");
		lblNewLabel_811.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_811.setBounds(170, 53, 138, 27);
		panel_211.add(lblNewLabel_811);
		
		JLabel lblNewLabel_911 = new JLabel("Description :");
		lblNewLabel_911.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_911.setBounds(170, 84, 150, 27);
		panel_211.add(lblNewLabel_911);
		
		JLabel lblNewLabel_1011 = new JLabel("Price :27RS");
		lblNewLabel_1011.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_1011.setBounds(303, 11, 170, 41);
		panel_211.add(lblNewLabel_1011);
		
		JButton btnNewButton_211 = new JButton("Add to Cart");
		btnNewButton_211.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton_211.setBounds(492, 11, 184, 41);
		panel_211.add(btnNewButton_211);
		
		JButton btnNewButton_311 = new JButton("Buy Now");
		btnNewButton_311.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton_311.setBounds(492, 57, 184, 41);
		panel_211.add(btnNewButton_311);
		
////////////////////////////////////////////////////
JPanel panel_2111 = new JPanel();
panel_2111.setBounds(10, 763, 686, 177);
panel_2111.setBackground(Color.LIGHT_GRAY);
panel.add(panel_2111);
panel_2111.setLayout(null);

JLabel lblNewLabel_6111 = new JLabel("New label");
lblNewLabel_6111.setBounds(10, 11, 150, 150);
panel_2111.add(lblNewLabel_6111);

JLabel lblNewLabel_7111 = new JLabel("Palak Seed");
lblNewLabel_7111.setFont(new Font("Segoe UI Black", Font.BOLD, 35));
lblNewLabel_7111.setBounds(170, 11, 123, 41);
panel_2111.add(lblNewLabel_7111);

JLabel lblNewLabel_8111 = new JLabel("Quantity :1kg");
lblNewLabel_8111.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
lblNewLabel_8111.setBounds(170, 53, 138, 27);
panel_2111.add(lblNewLabel_8111);

JLabel lblNewLabel_9111 = new JLabel("Description :");
lblNewLabel_9111.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
lblNewLabel_9111.setBounds(170, 84, 150, 27);
panel_2111.add(lblNewLabel_9111);

JLabel lblNewLabel_10111 = new JLabel("Price :65RS");
lblNewLabel_10111.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
lblNewLabel_10111.setBounds(303, 11, 170, 41);
panel_2111.add(lblNewLabel_10111);

JButton btnNewButton_2111 = new JButton("Add to Cart");
btnNewButton_2111.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
btnNewButton_2111.setBounds(492, 11, 184, 41);
panel_2111.add(btnNewButton_2111);

JButton btnNewButton_3111 = new JButton("Buy Now");
btnNewButton_3111.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
btnNewButton_3111.setBounds(492, 57, 184, 41);
panel_2111.add(btnNewButton_3111);

////////////////////////////////////////////////////
JPanel panel_21111 = new JPanel();
panel_21111.setBounds(10, 951, 686, 177);
panel_21111.setBackground(Color.LIGHT_GRAY);
panel.add(panel_21111);
panel_21111.setLayout(null);

JLabel lblNewLabel_61111 = new JLabel("New label");
lblNewLabel_61111.setBounds(10, 11, 150, 150);
panel_21111.add(lblNewLabel_61111);

JLabel lblNewLabel_71111 = new JLabel("Sun Flower");
lblNewLabel_71111.setFont(new Font("Segoe UI Black", Font.BOLD, 35));
lblNewLabel_71111.setBounds(170, 11, 123, 41);
panel_21111.add(lblNewLabel_71111);

JLabel lblNewLabel_81111 = new JLabel("Quantity :200grams");
lblNewLabel_81111.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
lblNewLabel_81111.setBounds(170, 53, 138, 27);
panel_21111.add(lblNewLabel_81111);

JLabel lblNewLabel_91111 = new JLabel("Description :");
lblNewLabel_91111.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
lblNewLabel_91111.setBounds(170, 84, 150, 27);
panel_21111.add(lblNewLabel_91111);

JLabel lblNewLabel_101111 = new JLabel("Price :100RS");
lblNewLabel_101111.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
lblNewLabel_101111.setBounds(303, 11, 170, 41);
panel_21111.add(lblNewLabel_101111);

JButton btnNewButton_21111 = new JButton("Add to Cart");
btnNewButton_21111.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
btnNewButton_21111.setBounds(492, 11, 184, 41);
panel_21111.add(btnNewButton_21111);

JButton btnNewButton_31111 = new JButton("Buy Now");
btnNewButton_31111.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
btnNewButton_31111.setBounds(492, 57, 184, 41);
panel_21111.add(btnNewButton_31111);


////////////////////////////////////////////////////
JPanel panel_211111 = new JPanel();
panel_211111.setBounds(10, 1139, 686, 177);
panel_211111.setBackground(Color.LIGHT_GRAY);
panel.add(panel_211111);
panel_211111.setLayout(null);

JLabel lblNewLabel_611111 = new JLabel("New label");
lblNewLabel_611111.setBounds(10, 11, 150, 150);
panel_211111.add(lblNewLabel_611111);

JLabel lblNewLabel_711111 = new JLabel("Beans");
lblNewLabel_711111.setFont(new Font("Segoe UI Black", Font.BOLD, 35));
lblNewLabel_711111.setBounds(170, 11, 123, 41);
panel_211111.add(lblNewLabel_711111);

JLabel lblNewLabel_811111 = new JLabel("Quantity :1kg");
lblNewLabel_811111.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
lblNewLabel_811111.setBounds(170, 53, 138, 27);
panel_211111.add(lblNewLabel_811111);

JLabel lblNewLabel_911111 = new JLabel("Description :");
lblNewLabel_911111.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
lblNewLabel_911111.setBounds(170, 84, 150, 27);
panel_211111.add(lblNewLabel_911111);

JLabel lblNewLabel_1011111 = new JLabel("Price :40RS");
lblNewLabel_1011111.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
lblNewLabel_1011111.setBounds(303, 11, 170, 41);
panel_211111.add(lblNewLabel_1011111);

JButton btnNewButton_211111 = new JButton("Add to Cart");
btnNewButton_211111.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
btnNewButton_211111.setBounds(492, 11, 184, 41);
panel_211111.add(btnNewButton_211111);

JButton btnNewButton_311111 = new JButton("Buy Now");
btnNewButton_311111.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
btnNewButton_311111.setBounds(492, 57, 184, 41);
panel_211111.add(btnNewButton_311111);

////////////////////////////////////////////////////
JPanel panel_2111111 = new JPanel();
panel_2111111.setBounds(10, 1139, 686, 177);
panel_2111111.setBackground(Color.LIGHT_GRAY);
panel.add(panel_2111111);
panel_2111111.setLayout(null);

JLabel lblNewLabel_6111111 = new JLabel("New label");
lblNewLabel_6111111.setBounds(10, 11, 150, 150);
panel_2111111.add(lblNewLabel_6111111);

JLabel lblNewLabel_7111111 = new JLabel("Beans");
lblNewLabel_7111111.setFont(new Font("Segoe UI Black", Font.BOLD, 35));
lblNewLabel_7111111.setBounds(170, 11, 123, 41);
panel_2111111.add(lblNewLabel_7111111);

JLabel lblNewLabel_8111111 = new JLabel("Quantity :1kg");
lblNewLabel_8111111.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
lblNewLabel_8111111.setBounds(170, 53, 138, 27);
panel_2111111.add(lblNewLabel_8111111);

JLabel lblNewLabel_9111111 = new JLabel("Description :");
lblNewLabel_9111111.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
lblNewLabel_9111111.setBounds(170, 84, 150, 27);
panel_2111111.add(lblNewLabel_9111111);

JLabel lblNewLabel_10111111 = new JLabel("Price :40RS");
lblNewLabel_10111111.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
lblNewLabel_10111111.setBounds(303, 11, 170, 41);
panel_2111111.add(lblNewLabel_10111111);

JButton btnNewButton_2111111 = new JButton("Add to Cart");
btnNewButton_2111111.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
btnNewButton_2111111.setBounds(492, 11, 184, 41);
panel_2111111.add(btnNewButton_2111111);

JButton btnNewButton_3111111 = new JButton("Buy Now");
btnNewButton_3111111.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
btnNewButton_3111111.setBounds(492, 57, 184, 41);
panel_2111111.add(btnNewButton_3111111);
		
		
		
		JLabel lblNewLabel = new JLabel("SEEDS");
		lblNewLabel.setBounds(10, 11, 688, 58);
		contentPane.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
	}
}
