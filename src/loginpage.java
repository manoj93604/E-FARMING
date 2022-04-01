import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class loginpage extends JFrame {

	private JPanel contentPane;
	private JTextField txtusername;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage frame = new loginpage();
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
	public loginpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1461, 840);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(636, 76, 150, 150);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon(loginpage.class.getResource("/image/icons8-farmer-100 (1).png")));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBackground(new Color(0.2f,0.2f,0.2f,0.5f));
		panel.setBounds(498, 161, 412, 430);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("User Login");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBounds(0, 36, 412, 62);
		panel.add(lblNewLabel_1);
		
		txtusername = new JTextField();
		txtusername.setCaretColor(Color.WHITE);
		txtusername.setForeground(new Color(255, 255, 255));
		txtusername.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtusername.setBackground(Color.GRAY);
		txtusername.setBounds(30, 146, 348, 43);
		panel.add(txtusername);
		txtusername.setColumns(10);
		
		txtpassword = new JPasswordField();
		txtpassword.setCaretColor(Color.WHITE);
		txtpassword.setForeground(new Color(255, 255, 255));
		txtpassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtpassword.setBackground(Color.GRAY);
		txtpassword.setBounds(30, 236, 348, 43);
		panel.add(txtpassword);
		
		JButton signinbutton = new JButton("Login");
		signinbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/efarming","root","Manoj123#");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("select * from efarming.profile where emailid='"+txtusername.getText()+"' and password='"+txtpassword.getText().toString()+"'");
					if(rs.next()) {
						String uname=rs.getString("emailid");
						String pass=rs.getString("password");
					if(uname.equals(txtusername.getText())&&pass.equals(txtpassword.getText())) {
						mainframe fm=new mainframe();
						fm.setVisible(true);
						
					}else {
						JOptionPane.showMessageDialog(null,"invalid");
					}
					
					}
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		signinbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				signinbutton.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				signinbutton.setBackground(Color.DARK_GRAY);
			}
		});
		signinbutton.setForeground(Color.WHITE);
		signinbutton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		signinbutton.setBackground(Color.DARK_GRAY);
		signinbutton.setBounds(121, 302, 176, 43);
		panel.add(signinbutton);
		
		JLabel lblNewLabel = new JLabel("User Name:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(30, 122, 116, 24);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setBounds(30, 211, 137, 24);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Forget Password?");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Segoe UI Black", Font.ITALIC, 12));
		lblNewLabel_5.setBounds(30, 279, 116, 16);
		panel.add(lblNewLabel_5);
		
		JButton Registerbutton = new JButton("Register");
		Registerbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regframe rf=new regframe();
				rf.setVisible(true);
				dispose();
			}
		});
		Registerbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Registerbutton.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Registerbutton.setBackground(Color.DARK_GRAY);
			}
		});
		Registerbutton.setBackground(Color.DARK_GRAY);
		Registerbutton.setForeground(Color.WHITE);
		Registerbutton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Registerbutton.setBounds(121, 356, 176, 43);
		panel.add(Registerbutton);
		
		
		
		
		
		JLabel lblNewLabel_2 = new JLabel((String) null);
		lblNewLabel_2.setIcon(new ImageIcon(((new ImageIcon(loginpage.class.getResource("/image/pexels-pixabay-158827.jpg"))).getImage()).getScaledInstance(1445, 801, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel_2.setBounds(0, 0, 1445, 801);
		contentPane.add(lblNewLabel_2);
	}
}
