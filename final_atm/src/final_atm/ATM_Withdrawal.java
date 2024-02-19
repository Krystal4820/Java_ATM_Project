package final_atm;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class ATM_Withdrawal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_Withdrawal window = new ATM_Withdrawal();
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
	public ATM_Withdrawal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//視窗設定
		frame = new JFrame("提款服務"); //新建一個視窗
		frame.setBounds(0, 0, 500, 500);  //設定視窗大小
		frame.setVisible(true);  //設定視窗是否能被看見
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //設定視窗關閉方式(重要)
		frame.getContentPane().setLayout(null);  //設定是創中物件的擺置方式(有者個才能隨意拉物件)
		//建立物件
		JButton d1000 = new JButton("1000");
		d1000.setFont(new Font("Arial", Font.PLAIN, 16));
		d1000.addActionListener(new ActionListener() {
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
		JButton d3000 = new JButton("3000");
		d3000.setFont(new Font("Arial", Font.PLAIN, 16));
		d3000.addActionListener(new ActionListener() {
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
		JButton d5000 = new JButton("5000");
		d5000.setFont(new Font("Arial", Font.PLAIN, 16));
		d5000.addActionListener(new ActionListener() {
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
		JButton d7000 = new JButton("7000");
		d7000.setFont(new Font("Arial", Font.PLAIN, 16));
		d7000.addActionListener(new ActionListener() {
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
		JButton d10000 = new JButton("10000");
		d10000.setFont(new Font("Arial", Font.PLAIN, 16));
		d10000.addActionListener(new ActionListener() {
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
		JButton d30000 = new JButton("30000");
		d30000.setFont(new Font("Arial", Font.PLAIN, 16));
		d30000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check.bal>=30000) 
				{
					check.bal -=30000;
					frame.dispose();
					new askprtrcp();
				}
			else JOptionPane.showMessageDialog(null, "餘額不足", "錯誤", JOptionPane.ERROR_MESSAGE);
			}
		});
		JButton other = new JButton("其他金額");
		other.setFont(new Font("標楷體", Font.PLAIN, 16));
		other.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new other_Withdrawal();
			}
		});
		
		
		
		JButton back = new JButton("回上一頁");
		back.setFont(new Font("標楷體", Font.PLAIN, 16));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				 new mainpage();
			}
		});
		JLabel Banner = new JLabel("\u8ACB\u9078\u64C7\u60A8\u8981\u7684\u91D1\u984D");
		//新增物件到視窗上
		frame.getContentPane().add(d1000);
		frame.getContentPane().add(d3000);
		frame.getContentPane().add(d5000);
		frame.getContentPane().add(d7000);
		frame.getContentPane().add(d10000);
		frame.getContentPane().add(d30000);
		frame.getContentPane().add(other);
		frame.getContentPane().add(back);
		frame.getContentPane().add(Banner);
		//設定物件
		d1000.setBounds(40, 105, 144, 60);
		d3000.setBounds(40, 185, 144, 60);
		d5000.setBounds(40, 265, 144, 60);
		d7000.setBounds(40, 345, 144, 60);
		d10000.setBounds(296, 105,144, 60);
		d30000.setBounds(296, 185, 144, 60);
		other.setBounds(296, 266, 144, 60);
		back.setBounds(296, 345, 144, 60);
		Banner.setBounds(144, 30, 200, 38);
		Banner.setFont(new Font("標楷體", Font.PLAIN, 24));
	}
}
