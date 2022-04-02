

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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class mainframe extends JFrame {

	private JPanel contentPane;
	private JTextField searchtxt;
	private JTable table;
	private JTextField textField;
	public JLabel getphno,gettype,getname,username,getmailid,followmailid,followers,following,slabel;
	public JPanel followpane,messagepane, profilepane,tablepane;

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
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel messagelabel = new JLabel("Write a Message...");
		
		messagelabel.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		messagelabel.setForeground(Color.LIGHT_GRAY);
		messagelabel.setBounds(283, 142, 321, 42);
		contentPane.add(messagelabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 263, 801);
		panel.setBackground(Color.DARK_GRAY);
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
				seeds se=new seeds();
				se.setVisible(true);
				
				
				//Desktop.getDesktop().browse(new URL("http://google.com").toURI());
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 121, 243, 29);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Fertiliser");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fert fe=new fert();
				fe.setVisible(true);
			}
		});
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
		
		 username = new JLabel("New label");
		username.setBounds(10, 776, 46, 14);
		panel.add(username);
		
		 getmailid = new JLabel("New label");
		getmailid.setBounds(82, 776, 46, 14);
		panel.add(getmailid);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(273, 0, 1172, 60);
		panel_1.setBackground(Color.DARK_GRAY);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_10 = new JButton("Home");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		 slabel = new JLabel("Search Firends...");
		 slabel.setForeground(Color.BLACK);
		 slabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 slabel.setBounds(23, 23, 134, 19);
		 panel_1.add(slabel);
		btnNewButton_10.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-home-30.png")));
		btnNewButton_10.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton_10.setBounds(435, 11, 125, 38);
		panel_1.add(btnNewButton_10);
		
		JButton profilebutton = new JButton("Profile");
		profilebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				profilepane.setVisible(true);
				messagepane.setVisible(false);
				followpane.setVisible(false);
				
				String get1=getmailid.getText();
				int count1=get1.length();
				int countfinall1=count1-10;
				String getfinall12=get1.substring(0, countfinall1);
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+getfinall12+"","root","Manoj123#");
					String sql="SELECT count(followers)  FROM profile";
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					while(rs.next()) {
						String sum=rs.getString("COUNT(followers)");
						followers.setText(sum);
						
					}
					
					String sql1="SELECT count(following)  FROM profile";
					Statement stmt1=con.createStatement();
					ResultSet rs1=stmt.executeQuery(sql1);
					while(rs1.next()) {
						String sum1=rs1.getString("count(following)");
						following.setText(sum1);
						
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
		profilebutton.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-male-user-30.png")));
		profilebutton.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		profilebutton.setBounds(570, 11, 125, 38);
		panel_1.add(profilebutton);
		
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
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regframe rfm=new regframe();
				rfm.setVisible(true);
				dispose();
			}
		});
		btnNewButton_13.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-add-user-male-30.png")));
		btnNewButton_13.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton_13.setBounds(855, 11, 125, 38);
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("LogOut");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginpage lp=new loginpage();
				lp.setVisible(true);
				dispose();
			}
		});
		btnNewButton_14.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-logout-30.png")));
		btnNewButton_14.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		btnNewButton_14.setBounds(990, 11, 120, 38);
		panel_1.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				messagepane.setVisible(false);
				followpane.setVisible(false);
				profilepane.setVisible(false);
			}
		});
		btnNewButton_15.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-bulleted-list-30.png")));
		btnNewButton_15.setBounds(1120, 11, 51, 38);
		panel_1.add(btnNewButton_15);
		
		JButton btnNewButton_19 = new JButton("");
		btnNewButton_19.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-search-30 (1).png")));
		btnNewButton_19.setBounds(370, 11, 62, 38);
		panel_1.add(btnNewButton_19);
		
		searchtxt = new JTextField();
		searchtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if(searchtxt.getText().length()==0) {
					tablepane.setVisible(false);
					slabel.setVisible(true);
				}
				else {
				
					slabel.setVisible(false);	
					
				tablepane.setVisible(true);
				
				table.setModel(new DefaultTableModel(
		    			new Object[][] {
		    			},
		    			new String[] {
		    				"New column", "New column",
		    			}
		    		));
				DefaultTableModel actable=(DefaultTableModel)table.getModel();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/efarming","root","Manoj123#");
					Statement stmt1=con1.createStatement();
					ResultSet rs=stmt1.executeQuery("Select * from profile where name like '"+searchtxt.getText()+"%' or phno like '"+searchtxt.getText()+"%'  ");
					ResultSetMetaData stData=rs.getMetaData();
					int q=stData.getColumnCount();
					actable.setRowCount(0);
				    while(rs.next()) {
				    	Vector columnData=new Vector();
						for(int i=1;i<=q;i++) {
							columnData.add(rs.getString("name"));
							columnData.add(rs.getString("phno"));
							
							table.setRowHeight(50);
						}
						actable.addRow(columnData);
				    }
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				}
			}
		});
		searchtxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				
			}
			
		});
		searchtxt.setBounds(10, 11, 357, 38);
		panel_1.add(searchtxt);
		searchtxt.setColumns(10);
		
		JButton btnNewButton_16 = new JButton("");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				String get1=getmailid.getText();
				int count1=get1.length();
				int countfinall1=count1-10;
				String getfinall12=get1.substring(0, countfinall1);
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+getfinall12+"","root","Manoj123#");
					Statement stmt=con.createStatement();
					ResultSet rs = stmt.executeQuery("select followers from profile");
					ResultSetMetaData rsmetadata = rs.getMetaData();

           // int columns = rsmetadata.getColumnCount();
           // String followers[] = new String[columns];

    
            while (rs.next()) {
            	
            }
                /*for (int i = 1; i < columns; i++) {
                	followers[i] = rs.getString(i);
                }
                System.out.println(followers);
            }

            con.close();*/
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
			}
		});
		btnNewButton_16.setBackground(new Color(30, 144, 255));
		btnNewButton_16.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-sent-30.png")));
		btnNewButton_16.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		btnNewButton_16.setBounds(1142, 64, 35, 125);
		contentPane.add(btnNewButton_16);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea.setForeground(Color.WHITE);
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(textArea.getText().length()!=0) {
				messagelabel.setVisible(false);
				}else {
					messagelabel.setVisible(true);
				}
			}
		});
		textArea.setBackground(Color.DARK_GRAY);
		textArea.setBounds(274, 64, 866, 125);
		contentPane.add(textArea);
		
		 profilepane = new JPanel();
		profilepane.setVisible(false);
		profilepane.setBackground(Color.DARK_GRAY);
		profilepane.setBounds(1187, 65, 258, 736);
		contentPane.add(profilepane);
		profilepane.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-user-100.png")));
		lblNewLabel_10.setBounds(86, 40, 100, 100);
		profilepane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Followers");
		lblNewLabel_11.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_11.setBounds(46, 151, 102, 24);
		profilepane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Following");
		lblNewLabel_12.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblNewLabel_12.setBounds(148, 151, 100, 24);
		profilepane.add(lblNewLabel_12);
		
		 followers = new JLabel("89");
		followers.setHorizontalAlignment(SwingConstants.CENTER);
		followers.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		followers.setBounds(46, 186, 80, 24);
		profilepane.add(followers);
		
		 following = new JLabel("145");
		following.setHorizontalAlignment(SwingConstants.CENTER);
		following.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		following.setBounds(148, 186, 80, 24);
		profilepane.add(following);
		
		JButton btnNewButton_17 = new JButton("Account Settings");
		btnNewButton_17.setBounds(10, 237, 238, 29);
		profilepane.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("Delete Account");
		btnNewButton_18.setBounds(10, 291, 238, 29);
		profilepane.add(btnNewButton_18);
		
		/* tablepane = new JPanel();
		tablepane.setVisible(false);
		tablepane.setBounds(273, 193, 904, 608);
		contentPane.add(tablepane);
		tablepane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 904, 608);
		tablepane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				followpane.setVisible(true);
				profilepane.setVisible(false);
				
				DefaultTableModel mailtable=(DefaultTableModel)table.getModel();
				int selectedRowIndex=table.getSelectedRow();
				getname.setText(mailtable.getValueAt(selectedRowIndex, 0).toString());
				getphno.setText(mailtable.getValueAt(selectedRowIndex, 1).toString());
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/efarming","root","Manoj123#");
					Statement stmt1=con1.createStatement();
					ResultSet rs=stmt1.executeQuery("Select * from profile where name ='"+getname.getText()+"' ");
					ResultSetMetaData stData=rs.getMetaData();
					
				    if(rs.next()) {
				    	String type=rs.getString("type");
				    	String mailid=rs.getString("emailid");
				    	followmailid.setText(mailid);
				    	gettype.setText(type);
				    	followpane.setVisible(true);
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
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", 
			}
		));
		scrollPane.setViewportView(table);*/
		
	     followpane = new JPanel();
		followpane.setBackground(Color.WHITE);
		followpane.setVisible(false);
		followpane.setBounds(1182, 64, 263, 343);
		contentPane.add(followpane);
		followpane.setLayout(null);
		
        getname = new JLabel("Manoj");
		getname.setHorizontalAlignment(SwingConstants.CENTER);
		getname.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		getname.setBounds(10, 115, 243, 46);
		followpane.add(getname);
		
		 getphno = new JLabel("9360404812");
		getphno.setHorizontalAlignment(SwingConstants.CENTER);
		getphno.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		getphno.setBounds(10, 154, 243, 46);
		followpane.add(getphno);
		
		 gettype = new JLabel("Seller");
		gettype.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		gettype.setBounds(10, 11, 133, 32);
		followpane.add(gettype);
		
		JLabel lblNewLabel_101 = new JLabel("");
		lblNewLabel_101.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-user-100.png")));
		lblNewLabel_101.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_101.setBounds(81, 31, 100, 100);
		followpane.add(lblNewLabel_101);
		
		JButton btnNewButton_171 = new JButton("Follow");
		btnNewButton_171.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_171.setText("Following");
				String get=getmailid.getText();
				int count=get.length();
				int countfinall=count-10;
				String getfinall=get.substring(0, countfinall);
				
				
				String get1=followmailid.getText();
				int count1=get1.length();
				int countfinall1=count1-10;
				String getfinall1=get1.substring(0, countfinall1);
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+getfinall+"","root","Manoj123#");
					Statement stmt2=con.createStatement();
					PreparedStatement stmt=con.prepareStatement("insert into profile(following) values(?)");
					stmt.setString(1,getfinall1);
					stmt.execute();stmt.close();
					
					
					
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+getfinall1+"","root","Manoj123#");
					PreparedStatement stmt1=con1.prepareStatement("insert into profile(followers) values(?)");
					stmt1.setString(1, getfinall);
					stmt1.execute();stmt1.close();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_171.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_171.setBounds(81, 211, 113, 32);
		followpane.add(btnNewButton_171);
		
		JButton btnNewButton_181 = new JButton("Message");
		btnNewButton_181.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				messagepane.setVisible(true);
			}
		});
		btnNewButton_181.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_181.setBounds(81, 254, 113, 32);
		followpane.add(btnNewButton_181);
		
		 followmailid = new JLabel("New label");
		followmailid.setBounds(207, 11, 46, 14);
		followpane.add(followmailid);
		
		 messagepane = new JPanel();
		 messagepane.setVisible(false);
		messagepane.setBackground(Color.WHITE);
		messagepane.setBounds(1182, 418, 263, 383);
		contentPane.add(messagepane);
		messagepane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 295, 243, 39);
		messagepane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_20 = new JButton("Send");
		btnNewButton_20.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_20.setBounds(10, 345, 243, 23);
		messagepane.add(btnNewButton_20);
		
		JLabel lblNewLabel_111 = new JLabel("New label");
		lblNewLabel_111.setBounds(64, 21, 189, 33);
		messagepane.add(lblNewLabel_111);
		
		JLabel lblNewLabel_121 = new JLabel("New label");
		lblNewLabel_121.setBounds(10, 64, 176, 39);
		messagepane.add(lblNewLabel_121);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setBounds(77, 113, 176, 33);
		messagepane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setBounds(10, 154, 189, 39);
		messagepane.add(lblNewLabel_14);
		
		JButton btnNewButton_21 = new JButton("X");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				messagepane.setVisible(false);
			}
		});
		btnNewButton_21.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnNewButton_21.setBounds(214, 0, 49, 23);
		messagepane.add(btnNewButton_21);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(284, 200, 884, 131);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-test-account-30.png")));
		lblNewLabel_15.setBounds(10, 11, 30, 30);
		panel_2.add(lblNewLabel_15);
		
		JLabel getprofilename = new JLabel("Manoj");
		getprofilename.setBounds(50, 11, 123, 30);
		panel_2.add(getprofilename);
		
		JLabel getcontent = new JLabel("");
		getcontent.setBounds(10, 40, 864, 80);
		panel_2.add(getcontent);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(273, 195, 904, 595);
		contentPane.add(scrollPane1);
		
		JPanel panel_3 = new JPanel();
		scrollPane1.setViewportView(panel_3);
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 140, 884, 131);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-test-account-30.png")));
		lblNewLabel_16.setBounds(10, 11, 30, 30);
		panel_4.add(lblNewLabel_16);
		
		JLabel lblNewLabel_19 = new JLabel("lokesh");
		lblNewLabel_19.setBounds(50, 11, 105, 30);
		panel_4.add(lblNewLabel_19);
		
		JLabel lblNewLabel_22 = new JLabel("");
		lblNewLabel_22.setBounds(10, 52, 864, 68);
		panel_4.add(lblNewLabel_22);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 277, 884, 131);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-test-account-30.png")));
		lblNewLabel_17.setBounds(10, 11, 30, 30);
		panel_5.add(lblNewLabel_17);
		
		JLabel lblNewLabel_20 = new JLabel("richie");
		lblNewLabel_20.setBounds(50, 11, 108, 30);
		panel_5.add(lblNewLabel_20);
		
		JLabel lblNewLabel_23 = new JLabel("");
		lblNewLabel_23.setBounds(10, 52, 864, 68);
		panel_5.add(lblNewLabel_23);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 415, 884, 131);
		panel_3.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setIcon(new ImageIcon(mainframe.class.getResource("/image/icons8-test-account-30.png")));
		lblNewLabel_18.setBounds(10, 11, 30, 30);
		panel_6.add(lblNewLabel_18);
		
		JLabel lblNewLabel_21 = new JLabel("kishore");
		lblNewLabel_21.setBounds(50, 11, 103, 30);
		panel_6.add(lblNewLabel_21);
		
		JLabel lblNewLabel_24 = new JLabel("");
		lblNewLabel_24.setBounds(10, 52, 864, 68);
		panel_6.add(lblNewLabel_24);
	}
}
