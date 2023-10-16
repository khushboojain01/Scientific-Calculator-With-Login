package login_system_calc.myscicalc;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
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

public class scicalc {

	private JFrame frame;
	private JTextField textField;
	private JTextField unitconvtextfield;
	
    double firstnum;
     double secondnum;
     double result;
     String operations;
     String answer;
     double Nigerian_Naira = 535.96;
     double US_Dollar = 1.52;
     double Kenyan_shilling = 156.21;
     double Brazilian_Real = 5.86;
     double Canadian_Dollar = 2.03;
     double Indian_Rupee = 100.68;
     double Philippine_Peso = 71.74;
     double Indonesian_Rupiah =20746.75 ;
     private JTextField jlblconverts;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scicalc window = new scicalc();
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
	public scicalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Segoe UI Historic", Font.ITALIC, 13));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 342, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Standard");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 341, 395);
				textField.setBounds(10, 11, 305, 47);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Scientific");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 580, 380);
				textField.setBounds(10, 11, 485, 47);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Currency Converter");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(100, 100, 884, 380);
				textField.setBounds(10, 11, 485, 47);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Segoe UI Emoji", Font.BOLD, 20));
		textField.setBounds(10, 11, 305, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = textField.getText() +btn0 .getText();
				textField.setText(iNum);
		  }
		});

		JComboBox combobox01 = new JComboBox();
		combobox01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		combobox01.setModel(new DefaultComboBoxModel(new String[] {"Select Country", "USA", "Nigeria", "Kenyan", "Canada", "Brazil", "Indonesia", "Philippine", "India"}));
		combobox01.setBounds(645, 84, 162, 22);
		frame.getContentPane().add(combobox01);
		
		jlblconverts = new JTextField();
		jlblconverts.setEditable(false);
		jlblconverts.setBounds(656, 158, 141, 23);
		frame.getContentPane().add(jlblconverts);
		jlblconverts.setColumns(10);
		btn0.setForeground(new Color(0, 0, 0));
		btn0.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btn0.setBackground(new Color(192, 192, 192));
		btn0.setBounds(67, 264, 74, 49);
		frame.getContentPane().add(btn0);
		
		JButton btnbksp = new JButton("<-");
		btnbksp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				if (textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backspace= strB.toString();
					textField.setText(backspace);
					
				}
			}
		});
		btnbksp.setForeground(new Color(0, 0, 0));
		btnbksp.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnbksp.setBackground(new Color(250, 128, 114));
		btnbksp.setBounds(10, 69, 58, 47);
		frame.getContentPane().add(btnbksp);
		
		  JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = textField.getText() + btn7 . getText();
				textField.setText(iNum);
				
			}
			
		});
		btn7.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btn7.setBackground(new Color(192, 192, 192));
		btn7.setBounds(10, 117, 58, 47);
		frame.getContentPane().add(btn7);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = textField.getText() +btn9 .getText();
				textField.setText(iNum);
			}
		});
		btn9.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btn9.setBackground(new Color(192, 192, 192));
		btn9.setBounds(140, 117, 68, 47);
		frame.getContentPane().add(btn9);
		
		JButton btnCE = new JButton("AC");
		btnCE.setForeground(new Color(0, 0, 0));
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnCE.setFont(new Font("Segoe UI", Font.BOLD, 17));
		btnCE.setBackground(new Color(144, 238, 144));
		btnCE.setBounds(67, 69, 74, 47);
		frame.getContentPane().add(btnCE);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = textField.getText() +btn8 .getText();
				textField.setText(iNum);
			
			}
		});
		btn8.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btn8.setBackground(new Color(192, 192, 192));
		btn8.setBounds(67, 117, 74, 47);
		frame.getContentPane().add(btn8);
		
		JButton btnroot = new JButton("\t√");
		btnroot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.sqrt(ops);
				textField.setText(String.valueOf(ops));
			}
		});
		btnroot.setForeground(Color.WHITE);
		btnroot.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnroot.setBackground(new Color(0, 0, 0));
		btnroot.setBounds(272, 69, 43, 47);
		frame.getContentPane().add(btnroot);
		
		JButton btnpercentage = new JButton("%");
		btnpercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				String iNum = textField.getText() +btn7 .getText();
				textField.setText(" ");
				operations = "%";
			}
		});
		btnpercentage.setForeground(Color.WHITE);
		btnpercentage.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnpercentage.setBackground(new Color(0, 0, 0));
		btnpercentage.setBounds(272, 117, 43, 47);
		frame.getContentPane().add(btnpercentage);
		
		JButton btnfraction = new JButton("1/X");
		btnfraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(textField.getText());
			    ops = 1/ops;
				textField.setText(String.valueOf(ops));
			}
			}
	);
		btnfraction.setForeground(Color.WHITE);
		btnfraction.setFont(new Font("Dialog", Font.PLAIN, 6));
		btnfraction.setBackground(new Color(0, 0, 0));
		btnfraction.setBounds(272, 165, 43, 49);
		frame.getContentPane().add(btnfraction);
		
		JButton btnisequal = new JButton("=");
		btnisequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                String answer;
                secondnum= Double.parseDouble(textField.getText());
                {
                    if (operations == "+")
                    {
                        result = firstnum + secondnum;
                        answer = String.format("%.2f",result);
                        textField.setText(answer); 
                    }

                    else if (operations == "-")
                    {
                        result = firstnum - secondnum;
                        answer = String.format("%.2f",result);
                        textField.setText(answer); 
                    }
                    else if (operations == "/")
                    {
                        result = firstnum / secondnum;
                        answer = String.format("%.2f",result);
                        textField.setText(answer); 
                    }
                    else if (operations == "x")
                    {
                        result = firstnum * secondnum;
                        answer = String.format("%.2f",result);
                        textField.setText(answer); 
                    }
                    else if (operations == "%")
                    {
                        result = firstnum / secondnum * 100;
                        answer = String.format("%.2f",result);
                        textField.setText(answer); 
                    }
                }
			
			}});
		btnisequal.setForeground(Color.WHITE);
		btnisequal.setFont(new Font("Dialog", Font.BOLD, 14));
		btnisequal.setBackground(new Color(0, 0, 0));
		btnisequal.setBounds(272, 217, 43, 96);
		frame.getContentPane().add(btnisequal);
		
		 JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = textField.getText() +btn4 .getText();
				textField.setText(iNum);
			}
		});
		
		btn4.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btn4.setBackground(new Color(192, 192, 192));
		btn4.setBounds(10, 165, 58, 49);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = textField.getText() +btn5 .getText();
				textField.setText(iNum);
			}
		});
		btn5.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btn5.setBackground(new Color(192, 192, 192));
		btn5.setBounds(67, 165, 74, 49);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = textField.getText() +btn6 .getText();
				textField.setText(iNum);
			}
		});
		btn6.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btn6.setBackground(new Color(192, 192, 192));
		btn6.setBounds(140, 165, 68, 49);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = textField.getText() +btn1 .getText();
				textField.setText(iNum);
			}
		});
		btn1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btn1.setBackground(new Color(192, 192, 192));
		btn1.setBounds(10, 217, 58, 47);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = textField.getText() +btn2 .getText();
				textField.setText(iNum);
			}
		});
		btn2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btn2.setBackground(new Color(192, 192, 192));
		btn2.setBounds(67, 217, 74, 47);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = textField.getText() +btn3 .getText();
				textField.setText(iNum);
			}
		});
		btn3.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btn3.setBackground(new Color(192, 192, 192));
		btn3.setBounds(140, 217, 68, 47);
		frame.getContentPane().add(btn3);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				String iNum = textField.getText() +btn7 .getText();
				textField.setText(" ");
				operations = "-";
			}
		});
		btnminus.setForeground(Color.WHITE);
		btnminus.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnminus.setBackground(new Color(0, 0, 0));
		btnminus.setBounds(205, 217, 68, 47);
		frame.getContentPane().add(btnminus);
		
		JButton btndecimal = new JButton(".");
		btndecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().contains(".")){
					String iNum = textField.getText()+btndecimal.getText();
					textField.setText(iNum);
				}
			}
			
		});
		btndecimal.setForeground(Color.WHITE);
		btndecimal.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btndecimal.setBackground(new Color(0, 0, 0));
		btndecimal.setBounds(10, 264, 57, 49);
		frame.getContentPane().add(btndecimal);
		
		JButton btndiv = new JButton("÷");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				String iNum = textField.getText() +btn7 .getText();
				textField.setText(" ");
				operations = "/";
			}
		});
		btndiv.setForeground(Color.WHITE);
		btndiv.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btndiv.setBackground(new Color(0, 0, 0));
		btndiv.setBounds(205, 117, 68, 47);
		frame.getContentPane().add(btndiv);
		
		JButton btn = new JButton("+-");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops*(-1);
				textField.setText(String.valueOf(ops));
		}
			}
	);
		btn.setForeground(Color.WHITE);
		btn.setFont(new Font("Segoe UI", Font.BOLD, 17));
		btn.setBackground(new Color(0, 0, 0));
		btn.setBounds(140, 69, 133, 47);
		frame.getContentPane().add(btn);
		
		JButton btnmult = new JButton("x");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				String iNum = textField.getText() +btn7 .getText();
				textField.setText(" ");
				operations = "x";
			}
		});
		btnmult.setForeground(Color.WHITE);
		btnmult.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnmult.setBackground(new Color(0, 0, 0));
		btnmult.setBounds(205, 165, 68, 49);
		frame.getContentPane().add(btnmult);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				String iNum = textField.getText() +btn7 .getText();
				textField.setText(" ");
				operations = "+";
				
			    
			}
		});
		btnplus.setForeground(Color.WHITE);
		btnplus.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnplus.setBackground(new Color(0, 0, 0));
		btnplus.setBounds(140, 265, 133, 48);
		frame.getContentPane().add(btnplus);
		
		JButton btnlog = new JButton("Log");
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.log(ops);
				textField.setText(String.valueOf(ops));
			}
		});
		btnlog.setBackground(new Color(192, 192, 192));
		btnlog.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btnlog.setBounds(326, 69, 58, 47);
		frame.getContentPane().add(btnlog);
		
		JButton btnpi = new JButton("pi");
		btnpi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops=(3.14592653589793384626433832795);
				textField.setText(String.valueOf(ops));
			}
		});
		btnpi.setBackground(new Color(192, 192, 192));
		btnpi.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btnpi.setBounds(325, 117, 58, 47);
		frame.getContentPane().add(btnpi);
		
		JButton btnraisey = new JButton("x^y");
		btnraisey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops=Math.pow(ops,ops);
				textField.setText(String.valueOf(ops));			}
		});
		btnraisey.setBackground(new Color(192, 192, 192));
		btnraisey.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btnraisey.setBounds(325, 165, 58, 47);
		frame.getContentPane().add(btnraisey);
		
		JButton btnraise2 = new JButton("x^2");
		btnraise2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double ops = Double.parseDouble(String.valueOf(textField.getText()));
			ops=(ops*ops);
			textField.setText(String.valueOf(ops));
			}
			
		});
		btnraise2.setBackground(new Color(192, 192, 192));
		btnraise2.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btnraise2.setBounds(325, 217, 58, 47);
		frame.getContentPane().add(btnraise2);
		
		JButton btnraise3 = new JButton("x^3");
		btnraise3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops=(ops*ops*ops);
				textField.setText(String.valueOf(ops));
			}
		});
		btnraise3.setBackground(new Color(192, 192, 192));
		btnraise3.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btnraise3.setBounds(325, 266, 58, 47);
		frame.getContentPane().add(btnraise3);
		
		JButton btnsin = new JButton("Sin");
		btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.sqrt(ops);
				textField.setText(String.valueOf(ops));
				
			}
		});
		btnsin.setBackground(new Color(192, 192, 192));
		btnsin.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btnsin.setBounds(385, 69, 58, 47);
		frame.getContentPane().add(btnsin);
		
		JButton btnsinh = new JButton("Sinh");
		btnsinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.sinh(ops);
				textField.setText(String.valueOf(ops));
			}
		});
		btnsinh.setBackground(new Color(192, 192, 192));
		btnsinh.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btnsinh.setBounds(443, 69, 58, 47);
		frame.getContentPane().add(btnsinh);
		
		JButton btnmod = new JButton("Mod");
		btnmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				String iNum = textField.getText() +btn7 .getText();
				textField.setText(" ");
				operations = "Mod";
				
				
			}
		});
		btnmod.setBackground(new Color(192, 192, 192));
		btnmod.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btnmod.setBounds(501, 69, 58, 47);
		frame.getContentPane().add(btnmod);
		
		JButton btnln = new JButton("lnx");
		btnln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops=Math.log10(ops);
				textField.setText(String.valueOf(ops));
				
			}
		});
		btnln.setBackground(new Color(192, 192, 192));
		btnln.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btnln.setBounds(501, 117, 58, 47);
		frame.getContentPane().add(btnln);
		
		JButton btnsciclear = new JButton("exp");
		btnsciclear.setBackground(new Color(192, 192, 192));
		btnsciclear.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btnsciclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				String iNum = textField.getText() +btn7 .getText();
				textField.setText(" ");
				operations = "Exp";
			}
		});
		btnsciclear.setBounds(501, 165, 58, 47);
		frame.getContentPane().add(btnsciclear);
		
		JButton btn2pi = new JButton("2PI");
		btn2pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops=(3.14592653589793384626433832795)*2;
				textField.setText(String.valueOf(ops));
			}
		});
		btn2pi.setBackground(new Color(192, 192, 192));
		btn2pi.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btn2pi.setBounds(501, 217, 58, 47);
		frame.getContentPane().add(btn2pi);
		
		JButton btnoctal = new JButton("Octal");
		btnoctal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int a = Integer.parseInt(textField.getText());
					textField.setText(Integer.toString(a,8));
			}
		});
		btnoctal.setBackground(new Color(192, 192, 192));
		btnoctal.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btnoctal.setBounds(501, 266, 58, 47);
		frame.getContentPane().add(btnoctal);
		
		JButton btnhex = new JButton("Hex");
		btnhex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int a = Integer.parseInt(textField.getText());
					textField.setText(Integer.toString(a, 16));
			}
		});
		btnhex.setBackground(new Color(192, 192, 192));
		btnhex.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btnhex.setBounds(443, 266, 58, 47);
		frame.getContentPane().add(btnhex);
		
		JButton btnbin = new JButton("Bin");
		btnbin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				textField.setText(Integer.toString(a, 2));
			}
		});
		btnbin.setBackground(new Color(192, 192, 192));
		btnbin.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btnbin.setBounds(385, 266, 58, 47);
		frame.getContentPane().add(btnbin);
		
		JButton btncbr = new JButton("Cbr");
		btncbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops= Math.cbrt(ops);
				textField.setText(String.valueOf(ops));
				
			}
		});
		btncbr.setBackground(new Color(192, 192, 192));
		btncbr.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btncbr.setBounds(385, 217, 58, 47);
		frame.getContentPane().add(btncbr);
		
		JButton btncos = new JButton("Cos");
		btncos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.cos(ops);
				textField.setText(String.valueOf(ops));
			}
		});
		btncos.setBackground(new Color(192, 192, 192));
		btncos.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btncos.setBounds(385, 117, 58, 47);
		frame.getContentPane().add(btncos);
		
		JButton btncosh = new JButton("Cosh");
		btncosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
			ops = Math.cosh(ops);
			textField.setText(String.valueOf(ops));
			}
		});
		btncosh.setBackground(new Color(192, 192, 192));
		btncosh.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btncosh.setBounds(443, 117, 58, 47);
		frame.getContentPane().add(btncosh);
		
		JButton btntanh = new JButton("Tanh");
		btntanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.tanh(ops);
				textField.setText(String.valueOf(ops));
			}
		});
		btntanh.setBackground(new Color(192, 192, 192));
		btntanh.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btntanh.setBounds(443, 165, 58, 47);
		frame.getContentPane().add(btntanh);
		
		JButton btnrunf = new JButton("Rund");
		btnrunf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops= Math.round(ops);
				textField.setText(String.valueOf(ops));
			}
		});
		btnrunf.setBackground(new Color(192, 192, 192));
		btnrunf.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btnrunf.setBounds(443, 217, 58, 47);
		frame.getContentPane().add(btnrunf);
		
		Label label = new Label("Currency Converter");
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 17));
		label.setBackground(new Color(204, 204, 204));
		label.setAlignment(Label.CENTER);
		label.setBounds(646, 11, 162, 47);
		frame.getContentPane().add(label);
		
		JButton btntan = new JButton("Tan");
		btntan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.tan(ops);
				textField.setText(String.valueOf(ops));
			}
		});
		btntan.setBackground(new Color(192, 192, 192));
		btntan.setFont(new Font("Segoe UI", Font.BOLD, 9));
		btntan.setBounds(385, 165, 58, 47);
		frame.getContentPane().add(btntan);
		
		unitconvtextfield = new JTextField();
		unitconvtextfield.setBounds(655, 117, 141, 30);
		frame.getContentPane().add(unitconvtextfield);
		unitconvtextfield.setColumns(10);
		
		JButton btnconvert = new JButton("Convert");
		btnconvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double British_Pound = Double.parseDouble(unitconvtextfield.getText());
				if (combobox01.getSelectedItem().equals("Nigeria"))
				{
					String cConvert1 = String.format("N%.2f", British_Pound*Nigerian_Naira);
					jlblconverts.setText(cConvert1);
				}
				if (combobox01.getSelectedItem().equals("USA"))
				{
					String cConvert2 = String.format("$%.2f", British_Pound*US_Dollar);
					jlblconverts.setText(cConvert2);
				}
                if (combobox01.getSelectedItem().equals("Kenyan"))
				{
					String cConvert3 = String.format("KS%.2f", British_Pound*Kenyan_shilling);
					jlblconverts.setText(cConvert3);
				}
				if (combobox01.getSelectedItem().equals("Canada"))
				{
					String cConvert4 = String.format("C$%.2f", British_Pound*Canadian_Dollar);
					jlblconverts.setText(cConvert4);
				}
				if (combobox01.getSelectedItem().equals("India"))
				{
					String cConvert5 = String.format("INR %.2f", British_Pound*Indian_Rupee);
					jlblconverts.setText(cConvert5);
				}
				if (combobox01.getSelectedItem().equals("Brazil"))
				{
					String cConvert6 = String.format("BR %.2f", British_Pound*Philippine_Peso);
					jlblconverts.setText(cConvert6);
				}
				if (combobox01.getSelectedItem().equals("Philippine"))
				{
					String cConvert6 = String.format("PHP %.2f", British_Pound*Philippine_Peso);
					jlblconverts.setText(cConvert6);
				}
				if (combobox01.getSelectedItem().equals("Indonesia"))
				{
					String cConvert7 = String.format("IDR %.2f", British_Pound*Indonesian_Rupiah);
					jlblconverts.setText(cConvert7);
				}
				
			}});
		btnconvert.setBounds(613, 200, 89, 23);
		frame.getContentPane().add(btnconvert);
		
		JButton btnconvertclear = new JButton("Clear");
		btnconvertclear.setBounds(732, 199, 99, 24);
		frame.getContentPane().add(btnconvertclear);

		btnconvertclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unitconvtextfield.setText(null);
				jlblconverts.setText(null);
				combobox01.setSelectedItem("Select Country");
			}
		});
		btnconvertclear.setBounds(732, 199, 99, 24);
		frame.getContentPane().add(btnconvertclear);
		frame.getContentPane().add(btnconvertclear);
		
	}
}
