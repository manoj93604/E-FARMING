import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class regframe extends JFrame {

	private JPanel contentPane;
	private JTextField txtname;
	private JTextField txtpin;
	private JTextField txtstate;
	private JTextField txtdis;
	private JTextField txtphno;
	private JTextField txtemail;
	private JTextField txtpass;
	private JPasswordField txtrepass;
	private JTextField vctxt;
	public JLabel vc ;
	public JButton submitbutton;
	private JTextField txtarea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regframe frame = new regframe();
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
	public regframe() {
		
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
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(regframe.class.getResource("/image/icons8-farmer-100 (2).png")));
		lblNewLabel_1.setBounds(733, 11, 100, 100);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(458, 64, 637, 726);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		scrollPane.setViewportView(panel);
		
		panel.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("USER REGISTER");
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_11.setBounds(0, 36, 637, 62);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_2 = new JLabel("Registration Type :");
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 139, 153, 28);
		panel.add(lblNewLabel_2);
		
		JComboBox rcombo = new JComboBox();
		rcombo.setForeground(Color.WHITE);
		rcombo.setBackground(Color.GRAY);
		rcombo.setBorder(null);
		rcombo.setModel(new DefaultComboBoxModel(new String[] {"-select-", "seller", "buyer", "dealer", "agri officer", "veterinary doctor"}));
		rcombo.setBounds(173, 141, 183, 28);
		panel.add(rcombo);
		
		JLabel lblNewLabel_3 = new JLabel("Full Name:");
		lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(10, 180, 153, 28);
		panel.add(lblNewLabel_3);
		
		txtname = new JTextField();
		txtname.setForeground(Color.WHITE);
		txtname.setCaretColor(Color.WHITE);
		txtname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtname.setBackground(Color.GRAY);
		txtname.setBounds(173, 180, 183, 28);
		panel.add(txtname);
		txtname.setColumns(10);
		
		JLabel glable = new JLabel("Gender :");
		glable.setBorder(null);
		glable.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		glable.setForeground(Color.WHITE);
		glable.setBounds(366, 183, 101, 23);
		panel.add(glable);
		
		JComboBox gcombo = new JComboBox();
		gcombo.setForeground(Color.WHITE);
		gcombo.setBorder(null);
		gcombo.setBackground(Color.GRAY);
		gcombo.setModel(new DefaultComboBoxModel(new String[] {"-select-", "male", "female", "others"}));
		gcombo.setBounds(437, 180, 175, 28);
		panel.add(gcombo);
		
		JLabel lblNewLabel_5 = new JLabel("Address (street):");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_5.setBounds(10, 268, 164, 14);
		panel.add(lblNewLabel_5);
		
		JTextArea txtadd = new JTextArea();
		txtadd.setForeground(Color.WHITE);
		txtadd.setCaretColor(Color.WHITE);
		txtadd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtadd.setBackground(Color.GRAY);
		txtadd.setBounds(173, 265, 439, 71);
		panel.add(txtadd);
		
		JLabel lblNewLabel_6 = new JLabel("Date Of Birth:");
		lblNewLabel_6.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 219, 153, 23);
		panel.add(lblNewLabel_6);
		
		JComboBox ycombo = new JComboBox();
		ycombo.setForeground(Color.WHITE);
		ycombo.setBorder(null);
		ycombo.setBackground(Color.GRAY);
		ycombo.setModel(new DefaultComboBoxModel(new String[] {"-year-", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022"}));
		ycombo.setBounds(173, 218, 68, 28);
		panel.add(ycombo);
		
		JComboBox mcombo = new JComboBox();
		mcombo.setForeground(Color.WHITE);
		mcombo.setBorder(null);
		mcombo.setBackground(Color.GRAY);
		mcombo.setModel(new DefaultComboBoxModel(new String[] {"-month-", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		mcombo.setBounds(251, 218, 68, 28);
		panel.add(mcombo);
		
		JComboBox dcombo = new JComboBox();
		dcombo.setForeground(Color.WHITE);
		dcombo.setBorder(null);
		dcombo.setBackground(Color.GRAY);
		dcombo.setModel(new DefaultComboBoxModel(new String[] {"-Day-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		dcombo.setBounds(327, 217, 53, 30);
		panel.add(dcombo);
		
		JLabel lblNewLabel_7 = new JLabel("Pincode :");
		lblNewLabel_7.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(10, 347, 153, 28);
		panel.add(lblNewLabel_7);
		
		txtpin = new JTextField();
		txtpin.setForeground(Color.WHITE);
		txtpin.setCaretColor(Color.WHITE);
		txtpin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpin.setBackground(Color.GRAY);
		txtpin.setBounds(173, 349, 175, 28);
		panel.add(txtpin);
		txtpin.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("District :");
		lblNewLabel_8.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(10, 386, 86, 28);
		panel.add(lblNewLabel_8);
		
		txtstate = new JTextField();
		txtstate.setForeground(Color.WHITE);
		txtstate.setCaretColor(Color.WHITE);
		txtstate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtstate.setBackground(Color.GRAY);
		txtstate.setBounds(437, 387, 175, 28);
		panel.add(txtstate);
		txtstate.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("State :");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_9.setBounds(366, 390, 61, 21);
		panel.add(lblNewLabel_9);
		
		txtdis = new JTextField();
		txtdis.setForeground(Color.WHITE);
		txtdis.setCaretColor(Color.WHITE);
		txtdis.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtdis.setBackground(Color.GRAY);
		txtdis.setBounds(173, 388, 175, 28);
		panel.add(txtdis);
		txtdis.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Mobile Number :");
		lblNewLabel_10.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(10, 424, 141, 28);
		panel.add(lblNewLabel_10);
		
		txtphno = new JTextField();
		txtphno.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtphno.getText().length() >= 10 ) // limit to 3 characters
	                e.consume();

			}
		});
		txtphno.setForeground(Color.WHITE);
		txtphno.setColumns(10);
		txtphno.setCaretColor(Color.WHITE);
		txtphno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtphno.setBackground(Color.GRAY);
		txtphno.setBounds(173, 427, 175, 26);
		panel.add(txtphno);
		txtphno.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Email Id :");
		lblNewLabel_12.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setBounds(10, 462, 141, 28);
		panel.add(lblNewLabel_12);
		
		txtemail = new JTextField();
		txtemail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtemail.setForeground(Color.WHITE);
		txtemail.setCaretColor(Color.WHITE);
		txtemail.setBackground(Color.GRAY);
		txtemail.setBounds(173, 464, 175, 28);
		panel.add(txtemail);
		txtemail.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Create Password :");
		lblNewLabel_13.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setBounds(10, 503, 153, 28);
		panel.add(lblNewLabel_13);
		
		txtpass = new JTextField();
		txtpass.setForeground(Color.WHITE);
		txtpass.setCaretColor(Color.WHITE);
		txtpass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpass.setBackground(Color.GRAY);
		txtpass.setBounds(173, 503, 175, 28);
		panel.add(txtpass);
		txtpass.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Re-type Password :");
		lblNewLabel_14.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setBounds(10, 542, 153, 28);
		panel.add(lblNewLabel_14);
		
		txtrepass = new JPasswordField();
		txtrepass.setForeground(Color.WHITE);
		txtrepass.setCaretColor(Color.WHITE);
		txtrepass.setBackground(Color.GRAY);
		txtrepass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtrepass.setBounds(173, 544, 175, 28);
		panel.add(txtrepass);
		
		JButton svbutton = new JButton("Send Verification");
		svbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				svbutton.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				svbutton.setBackground(Color.GRAY);
			}
		});
		svbutton.setBackground(Color.GRAY);
		svbutton.setBorder(null);
		svbutton.setBorderPainted(false);
		svbutton.setForeground(Color.WHITE);
		svbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(txtemail.getText().length()==0 ) {	
					JOptionPane.showMessageDialog(null,"Invalid Emailid");
				}else {
				
				String name=txtemail.getText();
			    int n=name.length();
			    int a=n-10;
			    
			    if(a<10) {
			    	JOptionPane.showMessageDialog(null,"Invalid Emailid");
			    }else {
			    String na=name.substring(a, n);
			    String finalmail=na;
								
				if(txtemail.getText().length()<=10) {	
					JOptionPane.showMessageDialog(null,"Invalid Emailid");
				}
				else if(finalmail.equals("@gmail.com")){
					
					if(txtpass.getText().equals(" ")) {
						JOptionPane.showMessageDialog(null,"Please Enter The Password Field");
					}else if(txtrepass.getText().equals(" ")) {
						JOptionPane.showMessageDialog(null,"Please Enter The Re-try Password Field ");
					} if(txtpass.getText().length()>1 && txtpass.getText().equals(txtrepass.getText())) {
						 // change accordingly
				         String username = "manoj9360404812@gmail.com";  
				         
				        // change accordingly
				         String password = "Manoj123#";
				         
				        // or IP address
				        final String host = "localhost";
				 
				        // Get system properties
				        Properties props = new Properties();            
				         
				        // enable authentication
				        props.put("mail.smtp.auth", "true");              
				         
				        // enable STARTTLS
				        props.put("mail.smtp.starttls.enable", "true");   
				         
				        // Setup mail server
				        props.put("mail.smtp.host", "smtp.gmail.com");    
				         
				        // TLS Port
				        props.put("mail.smtp.port", "587");               
				 
				        // creating Session instance referenced to
				        // Authenticator object to pass in
				        // Session.getInstance argument
				        Session session = Session.getInstance(props,new javax.mail.Authenticator() { 
				            
				            //override the getPasswordAuthentication method
				            protected PasswordAuthentication getPasswordAuthentication() {
				                                        
				                return new PasswordAuthentication(username,password);
				            }
				          });
				 
				        try {
				             
				            // compose the message
				            // javax.mail.internet.MimeMessage class is
				            // mostly used for abstraction.
				            Message message = new MimeMessage(session);   
				             
				            // header field of the header.
				            
				            message.setFrom(new InternetAddress("manoj9360404812@gmail.com"));
				             
				            message.setRecipients(Message.RecipientType.TO,
				                InternetAddress.parse(txtemail.getText()));
				            message.setSubject("verification");
				          
				            
				            
				            message.setText("951753");
				 
				            Transport.send(message);         //send Message
				            
				           
				 
				            System.out.println("Done");
				 
				        } catch (MessagingException e1) {
				            throw new RuntimeException(e1);
				        }
						
						
						
						vc.setVisible(true);
						vctxt.setVisible(true);
						submitbutton.setVisible(true);
						svbutton.setVisible(false);
					}
					
					
					else {
						JOptionPane.showMessageDialog(null,"Incorrect Password");
						txtpass.setText("");
						txtrepass.setText("");
					}
				
				
				}
				else {
					JOptionPane.showMessageDialog(null,"Invalid Emailid");
				}
				}
				}
			}
		});
		svbutton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		svbutton.setBounds(251, 595, 183, 36);
		panel.add(svbutton);
		
		 vc = new JLabel("Please enter Verification Code :");
		vc.setForeground(Color.WHITE);
		vc.setVisible(false);
		vc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				vc.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
			
			}
		});
		vc.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		vc.setBounds(10, 581, 271, 37);
		panel.add(vc);
		
		vctxt = new JTextField();
		vctxt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		vctxt.setBackground(Color.GRAY);
		vctxt.setVisible(false);
		vctxt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				vc.setVisible(false);
			}
		});
		vctxt.setBounds(251, 583, 183, 28);
		panel.add(vctxt);
		vctxt.setColumns(10);
		
		 submitbutton = new JButton("Submit");
		 submitbutton.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseEntered(MouseEvent e) {
		 		submitbutton.setBackground(Color.LIGHT_GRAY);
		 	}
		 	@Override
		 	public void mouseExited(MouseEvent e) {
		 		submitbutton.setBackground(Color.GRAY);
		 	}
		 });
		submitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dob=ycombo.getSelectedItem().toString()+"-"+mcombo.getSelectedItem().toString()+"-"+dcombo.getSelectedItem().toString();
				if(vctxt.getText().equals("951753")) {
					
					
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/efarming","root","Manoj123#");
						PreparedStatement stmt=con.prepareStatement("insert into profile(name,gender,dateofbirth,address,pincode,state,district,phno,emailid,password,type,area) values(?,?,?,?,?,?,?,?,?,?,?,?)");
						stmt.setString(1,txtname.getText() );
						stmt.setString(2,gcombo.getSelectedItem().toString());
						stmt.setString(3,dob );
						stmt.setString(4,txtadd.getText() );
						stmt.setString(5,txtpin.getText() );
						stmt.setString(6,txtstate.getText() );
						stmt.setString(7,txtdis.getText() );
						stmt.setString(8,txtphno.getText() );
						stmt.setString(9,txtemail.getText() );
						stmt.setString(10,txtpass.getText() );
						stmt.setString(11, rcombo.getSelectedItem().toString());
						stmt.setString(12,txtarea.getText() );
						stmt.execute();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					
					try {		
    					Class.forName("com.mysql.cj.jdbc.Driver");
    					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Manoj123#");
    					Statement stmt=con.createStatement();
    					
    					String get=txtemail.getText();
    					int count=get.length();
    					int countfinall=count-10;
    					String getfinall=get.substring(0, countfinall);
    					
    					
    					String sql = ("CREATE SCHEMA "+getfinall+"");
    					String sql1="CREATE TABLE "+getfinall+".profile ("
    							+"sno INT PRIMARY KEY AUTO_INCREMENT ,"
    							+"followers VARCHAR(45) ,"
    							+"following VARCHAR(50))";
    					String sql2="CREATE TABLE "+getfinall+".messages ("
    							+"message VARCHAR(500))";
    							
    					String sql3="CREATE TABLE "+getfinall+".buy ("
    							+"sno INT PRIMARY KEY AUTO_INCREMENT ,"
    							+"productname VARCHAR(45) NOT NULL,"
    							+"productqut VARCHAR(45) NOT NULL,"
    							+"productdescription VARCHAR(500),"
    							+"productprice VARCHAR(50))";
    					String sql4="CREATE TABLE "+getfinall+".sell ("
    							+"sno INT PRIMARY KEY AUTO_INCREMENT ,"
    							+"productname VARCHAR(45) NOT NULL,"
    							+"productqut VARCHAR(45) NOT NULL,"
    							+"productdescription VARCHAR(500),"
    							+"productprice VARCHAR(50))";
    					
    					stmt.executeUpdate(sql);
    					stmt.executeUpdate(sql1);
    					stmt.executeUpdate(sql2);
    					stmt.executeUpdate(sql3);
    					stmt.executeUpdate(sql4);
    					stmt.close();
					}catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				JOptionPane.showMessageDialog(null,"Successfully Registered");
				
				loginpage lp=new loginpage();
				lp.setVisible(true);
				dispose();
				}else {
					JOptionPane.showMessageDialog(null,"Please cheack your verification code");
					vctxt.setText("");
				}
			}
		});
		submitbutton.setBackground(Color.GRAY);
		submitbutton.setBorder(null);
		submitbutton.setVisible(false);
		submitbutton.setBorderPainted(false);
		submitbutton.setForeground(Color.WHITE);
		submitbutton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		submitbutton.setBounds(251, 642, 176, 36);
		panel.add(submitbutton);
		
		JButton backbutton = new JButton("Back");
		backbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginpage lp=new loginpage();
				lp.setVisible(true);
				dispose();
			}
		});
		backbutton.setBackground(Color.GRAY);
		backbutton.setBorder(null);
		backbutton.setBorderPainted(false);
		backbutton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		backbutton.setForeground(Color.WHITE);
		backbutton.setBounds(10, 11, 89, 28);
		panel.add(backbutton);
		
		JLabel lblNewLabel_4 = new JLabel("Area :");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_4.setBounds(366, 347, 68, 28);
		panel.add(lblNewLabel_4);
		
		txtarea = new JTextField();
		txtarea.setForeground(Color.WHITE);
		txtarea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtarea.setBackground(Color.GRAY);
		txtarea.setBounds(437, 347, 175, 28);
		panel.add(txtarea);
		txtarea.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon(((new ImageIcon(regframe.class.getResource("/image/pexels-pixabay-265278.jpg"))).getImage()).getScaledInstance(1445, 801, java.awt.Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 1445, 801);
		contentPane.add(lblNewLabel);
	}
}
