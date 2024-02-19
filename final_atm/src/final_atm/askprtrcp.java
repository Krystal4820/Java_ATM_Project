package final_atm;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class askprtrcp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					askprtrcp window = new askprtrcp();
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
	public askprtrcp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("是否列印明細表");
		frame.setBounds(100, 100, 600, 450);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel asklab = new JLabel("\u662F\u5426\u5217\u5370\u4EA4\u6613\u660E\u7D30\u8868?");
		asklab.setBounds(178, 116, 246, 46);
		frame.getContentPane().add(asklab);
		asklab.setFont(new Font("標楷體", Font.PLAIN, 22));
		
		JButton printrcp = new JButton("\u5217\u5370\u660E\u7D30\u8868");
		printrcp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check c = new check();
				try {
					c.storeuserfile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("          台灣銀行\n");
				System.out.printf("交易帳號:%s\n",check.name);
				System.out.printf("餘額:%d",check.bal);
				frame.dispose();
				new askotherserv();
			}
		});
		printrcp.setBounds(43, 230, 150, 35);
		frame.getContentPane().add(printrcp);
		printrcp.setFont(new Font("標楷體", Font.PLAIN, 18));
		
		JButton printscr = new JButton("\u87A2\u5E55\u986F\u793A");
		printscr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check c = new check();
				try {
					c.storeuserfile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frame.dispose();
				new query();
			}
		});
		printscr.setFont(new Font("標楷體", Font.PLAIN, 18));
		printscr.setBounds(219, 230, 150, 35);
		frame.getContentPane().add(printscr);
		
		JButton printrcp_2 = new JButton("\u4E0D\u986F\u793A\u4E0D\u5217\u5370");
		printrcp_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check c = new check();
				try {
					c.storeuserfile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frame.dispose();
				new askotherserv();
			}
		});
		printrcp_2.setFont(new Font("標楷體", Font.PLAIN, 18));
		printrcp_2.setBounds(393, 231, 150, 35);
		frame.getContentPane().add(printrcp_2);
	}
}
