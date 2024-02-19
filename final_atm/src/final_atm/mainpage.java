package final_atm;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class mainpage {

	JFrame frame;
	static int money=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainpage window = new mainpage();
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
	public mainpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("請選擇服務項目");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		JLabel fastdrawlab = new JLabel("\u5FEB\u901F\u63D0\u6B3E");
		fastdrawlab.setFont(new Font("標楷體", Font.PLAIN, 22));
		fastdrawlab.setBounds(46, 20, 99, 40);
		frame.getContentPane().add(fastdrawlab);
		
		JButton b1000 = new JButton("1,000");
		b1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check.bal>=1000) 
					{
						check.bal -=1000;
						frame.dispose();
						new askprtrcp();
					}
				else JOptionPane.showMessageDialog(null, "餘額不足", "錯誤", JOptionPane.ERROR_MESSAGE);
			}
		});
		b1000.setFont(new Font("Arial", Font.PLAIN, 16));
		b1000.setBackground(Color.WHITE);
		b1000.setBounds(24, 70, 134, 55);
		frame.getContentPane().add(b1000);
		
		JButton b3000 = new JButton("3,000");
		b3000.setFont(new Font("Arial", Font.PLAIN, 16));
		b3000.setBackground(Color.WHITE);
		b3000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check.bal>=3000) 
				{
					check.bal -=3000;
					frame.dispose();
					new askprtrcp();
				}
			else JOptionPane.showMessageDialog(null, "餘額不足", "錯誤", JOptionPane.ERROR_MESSAGE);
			}
		});
		b3000.setBounds(24, 145, 134, 55);
		frame.getContentPane().add(b3000);
		
		JButton b5000 = new JButton("5,000");
		b5000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check.bal>=5000) 
				{
					check.bal -=5000;
					frame.dispose();
					new askprtrcp();
				}
			else JOptionPane.showMessageDialog(null, "餘額不足", "錯誤", JOptionPane.ERROR_MESSAGE);
			}
		});
		b5000.setFont(new Font("Arial", Font.PLAIN, 16));
		b5000.setBackground(Color.WHITE);
		b5000.setBounds(24, 222, 134, 55);
		frame.getContentPane().add(b5000);
		
		JButton b7000 = new JButton("7000");
		b7000.setFont(new Font("Arial", Font.PLAIN, 16));
		b7000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check.bal>=7000) 
				{
					check.bal -=7000;
					frame.dispose();
					new askprtrcp();
				}
			else JOptionPane.showMessageDialog(null, "餘額不足", "錯誤", JOptionPane.ERROR_MESSAGE);
			}
		});
		b7000.setBackground(Color.WHITE);
		b7000.setBounds(24, 297, 134, 55);
		frame.getContentPane().add(b7000);
		
		JButton draw = new JButton("\u63D0\u6B3E");
		draw.setBackground(Color.ORANGE);
		draw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				 new ATM_Withdrawal();
			}
		});
		draw.setFont(new Font("標楷體", Font.PLAIN, 18));
		draw.setBounds(398, 32, 110, 110);
		frame.getContentPane().add(draw);
		
		JButton deposit = new JButton("\u5B58\u6B3E");
		deposit.setBackground(Color.ORANGE);
		deposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				 new deposit();
			}
		});
		
		deposit.setFont(new Font("標楷體", Font.PLAIN, 18));
		deposit.setBounds(217, 32, 110, 110);
		frame.getContentPane().add(deposit);
		
		JButton checkbal = new JButton("\u9918\u984D\r\n\u67E5\u8A62");
		checkbal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				 new query();
			}
		});
		checkbal.setBackground(Color.ORANGE);
		checkbal.setFont(new Font("標楷體", Font.PLAIN, 18));
		checkbal.setBounds(217, 183, 110, 110);
		frame.getContentPane().add(checkbal);
		
		JButton transfer = new JButton("\u8F49\u5E33");
		transfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				 new Transfer();
			}
		});
		transfer.setBackground(Color.ORANGE);
		transfer.setFont(new Font("標楷體", Font.PLAIN, 18));
		transfer.setBounds(398, 183, 110, 110);
		frame.getContentPane().add(transfer);
		
		JButton changpsw = new JButton("\u5BC6\u78BC\u8B8A\u66F4");
		changpsw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new changpaswd();
			}
		});
		changpsw.setFont(new Font("標楷體", Font.PLAIN, 18));
		changpsw.setBackground(Color.ORANGE);
		changpsw.setBounds(217, 330, 110, 110);
		frame.getContentPane().add(changpsw);
		
		JButton exit = new JButton("\u96E2\u958B");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setFont(new Font("標楷體", Font.PLAIN, 18));
		exit.setBackground(Color.ORANGE);
		exit.setBounds(398, 330, 110, 110);
		frame.getContentPane().add(exit);
		
		JButton b10000 = new JButton("10,000");
		b10000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check.bal>=10000) 
				{
					check.bal -=10000;
					frame.dispose();
					new askprtrcp();
				}
			else JOptionPane.showMessageDialog(null, "餘額不足", "錯誤", JOptionPane.ERROR_MESSAGE);
			}
		});
		b10000.setFont(new Font("Arial", Font.PLAIN, 16));
		b10000.setBackground(Color.WHITE);
		b10000.setBounds(24, 370, 134, 55);
		frame.getContentPane().add(b10000);
		frame.setVisible(true);
	
	}
}