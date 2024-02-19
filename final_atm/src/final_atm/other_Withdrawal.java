package final_atm;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class other_Withdrawal {

	private JFrame other_Withdrawal;
	private JTextField drawtext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					other_Withdrawal window = new other_Withdrawal();
					window.other_Withdrawal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public other_Withdrawal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		other_Withdrawal = new JFrame("提款服務");
		other_Withdrawal.setVisible(true);
		other_Withdrawal.setBounds(100, 100, 600, 450);
		other_Withdrawal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		other_Withdrawal.getContentPane().setLayout(null);
		
		
		JButton confirm = new JButton("\u78BA\u8A8D");
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(drawtext.getText());
				if(check.bal>=a)
				{
					check.bal -= a;
					other_Withdrawal.dispose();
					new askprtrcp();
				}
				else JOptionPane.showMessageDialog(null, "餘額不足", "錯誤", JOptionPane.ERROR_MESSAGE);
			}
		});
		confirm.setBackground(Color.PINK);
		confirm.setFont(new Font("標楷體", Font.PLAIN, 22));
		confirm.setBounds(143, 265, 85, 35);
		other_Withdrawal.getContentPane().add(confirm);
		
		JLabel lab = new JLabel("\u8ACB\u8F38\u5165\u60A8\u8981\u63D0\u6B3E\u7684\u91D1\u984D\uFF1A");
		lab.setFont(new Font("標楷體", Font.PLAIN, 22));
		lab.setBounds(173, 94, 246, 46);
		other_Withdrawal.getContentPane().add(lab);
		
		
		
		JButton cancel = new JButton("\u53D6\u6D88");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				other_Withdrawal.dispose();
				new mainpage();
			}
		});
		cancel.setFont(new Font("標楷體", Font.PLAIN, 22));
		cancel.setBackground(Color.PINK);
		cancel.setBounds(365, 265, 85, 35);
		other_Withdrawal.getContentPane().add(cancel);
		
		drawtext = new JTextField();
		drawtext.setColumns(10);
		drawtext.setBounds(207, 170, 176, 35);
		other_Withdrawal.getContentPane().add(drawtext);
		drawtext.setFont(new Font("標楷體", Font.PLAIN, 20));
	}
}