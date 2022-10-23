//package login_system_calc;
//import login_system_calc.myscicalc.scicalc;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

import org.w3c.dom.UserDataHandler;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.SystemColor;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginsystemcalc {

	private JFrame frame;
	private JTextField usertextfield;
	private JTextField pwdtextfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginsystemcalc window = new loginsystemcalc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginsystemcalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setBounds(0, 0, 434, 14);
		frame.getContentPane().add(label);
		
		JLabel loginlabel = new JLabel("Login System");
		loginlabel.setBounds(137, 25, 163, 36);
		loginlabel.setFont(new Font("Segoe UI Historic", Font.BOLD, 18));
		loginlabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginlabel.setForeground(Color.WHITE);
		loginlabel.setBackground(Color.WHITE);
		frame.getContentPane().add(loginlabel);
		
		JLabel userlabel = new JLabel("Username :");
		userlabel.setBounds(0, 78, 112, 35);
		userlabel.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		userlabel.setHorizontalAlignment(SwingConstants.CENTER);
		userlabel.setForeground(Color.WHITE);
		frame.getContentPane().add(userlabel);
		
		usertextfield = new JTextField();
		usertextfield.setBounds(121, 83, 228, 29);
		usertextfield.setFont(new Font("Segoe UI Historic", Font.PLAIN, 13));
		frame.getContentPane().add(usertextfield);
		usertextfield.setColumns(10);
		
		pwdtextfield = new JPasswordField();
		pwdtextfield.setBounds(121, 137, 228, 29);
		pwdtextfield.setFont(new Font("Segoe UI Historic", Font.PLAIN, 13));
		pwdtextfield.setColumns(10);
		frame.getContentPane().add(pwdtextfield);
		
		JLabel pwdlabel = new JLabel("Password :");
		pwdlabel.setBounds(0, 131, 112, 35);
		pwdlabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwdlabel.setForeground(Color.WHITE);
		pwdlabel.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		frame.getContentPane().add(pwdlabel);
		
		JButton btnreset = new JButton("Reset");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usertextfield.setText(null);
				pwdtextfield.setText(null);
				
			}
		});
		
		btnreset.setFont(new Font("Segoe UI Historic", Font.BOLD, 15));
		btnreset.setBounds(256, 190, 115, 36);
		frame.getContentPane().add(btnreset);
		
		JButton btnlogin = new JButton("Sign In");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = pwdtextfield.getText();
				String Username = usertextfield.getText();
				/*if (password.contains("1234") && Username.contains("apsit01")) {
					pwdtextfield.setText(null);
					usertextfield.setText(null);
                    scicalc info = new scicalc();
                    scicalc.main(null);
				}
				else 
				{ 
					JOptionPane.showMessageDialog(null, "Invalid Login","Try Again!",JOptionPane.ERROR_MESSAGE);
					pwdtextfield.setText(null);
					usertextfield.setText(null);
				}	*/
				try {
					//Class.forName("com.mysql.jdbc.Driver");
				//	Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/loginmyscicalc","root","");
					Statement stmnt = con.createStatement();
					//String sql= "insert into loginmp (uname, pswd) values('"+Username+"','"+password+"')";
					//stmnt.executeUpdate(sql);
					String sql2 ="Select * from loginmp";
					ResultSet rs = stmnt.executeQuery(sql2);
					//System.out.println(sql2);
					while(rs.next()) 
					{ 
						Username=rs.getString("uname");
						password=rs.getString("pswd");
						System.out.println("Name :" + Username + "  and Password  :" + password);
						if(password.contains(pwdtextfield.getText()) && Username.contains(usertextfield.getText())){
							pwdtextfield.setText(null);
						usertextfield.setText(null);
						scicalc info = new scicalc();
						scicalc.main(null);
						}
					}
					//String un=sql2.split(sql2)
					/*if (password.contains("1234") && Username.contains("apsit01")) {
						pwdtextfield.setText(null);
						usertextfield.setText(null);
						scicalc info = new scicalc();
						scicalc.main(null);
					}
					else 
					{ 
						JOptionPane.showMessageDialog(null, "Invalid Login","Try Again!",JOptionPane.ERROR_MESSAGE);
						pwdtextfield.setText(null);
						usertextfield.setText(null);
					}*/
					if (rs.next()){
						
					JOptionPane.showMessageDialog(null,"Login Successful!");
				    scicalc info = new scicalc();
                    scicalc.main(null);

					}
				
				else{
				/*JOptionPane.showMessageDialog(null,"Login Failed!");
				 con.close();*/
				 /*System.out.println("Login Failed");*/
				 
				}

				} catch(Exception ae){
					System.out.println(ae);
				}	
			}	

			}	);
		
		
	
		btnlogin.setFont(new Font("Segoe UI Historic", Font.BOLD, 15));
		btnlogin.setBounds(89, 190, 115, 36);
		frame.getContentPane().add(btnlogin);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	}

