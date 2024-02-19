package final_atm;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;



import javax.swing.JButton;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class login {

	private JFrame login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		login = new JFrame("歡迎使用本銀行ATM服務");
		login.setBounds(100, 100, 600, 500);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.getContentPane().setLayout(null);
		
		JLabel welcomelab = new JLabel("\u8ACB\u8F38\u5165\u60A8\u7684\u5E33\u865F\u8207\u5BC6\u78BC\uFF0C\u8F38\u5165\u5B8C\u6210\u8ACB\u6309\u3010\u78BA\u8A8D\u3011\u9375");
		welcomelab.setFont(new Font("標楷體", Font.PLAIN, 22));
		welcomelab.setBounds(41, 75, 498, 43);
		login.getContentPane().add(welcomelab);
		
		JLabel acclab = new JLabel("\u5E33\u865F\uFF1A");
		acclab.setFont(new Font("標楷體", Font.PLAIN, 22));
		acclab.setBounds(127, 169, 67, 27);
		login.getContentPane().add(acclab);
		
		JLabel paslab = new JLabel("\u5BC6\u78BC\uFF1A");
		paslab.setFont(new Font("標楷體", Font.PLAIN, 22));
		paslab.setBounds(127, 255, 67, 27);
		login.getContentPane().add(paslab);
		
		TextField acctext = new TextField();
		acctext.setBounds(248, 169, 173, 27);
		acctext.setFont(new Font("標楷體", Font.PLAIN, 20));
		login.getContentPane().add(acctext);
		
		TextField pastext = new TextField();
		pastext.setBounds(248, 255, 173, 27);
		pastext.setEchoChar('*');
		pastext.setFont(new Font("標楷體", Font.PLAIN, 20));
		login.getContentPane().add(pastext);
		
		JButton confirm = new JButton("\u78BA\u8A8D");
		confirm.setFont(new Font("標楷體", Font.PLAIN, 22));
		confirm.setBounds(121, 363, 85, 35);
		login.getContentPane().add(confirm);
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				try {
					check c = new check(acctext.getText(),pastext.getText());
					if(c.d == 1)
					{
						login.setVisible(false);
						new mainpage();
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "帳號或密碼錯誤", "錯誤", JOptionPane.ERROR_MESSAGE);
					}	
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		
		JButton exit = new JButton("\u7D50\u675F");
		exit.setFont(new Font("標楷體", Font.PLAIN, 22));
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		login.getContentPane().add(exit);
		exit.setBounds(359, 363, 85, 35);
		
		
		
		
	}
}
