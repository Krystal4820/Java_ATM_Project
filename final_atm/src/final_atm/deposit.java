package final_atm;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class deposit {

	private JFrame deposit;
	private JTextField deptext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deposit window = new deposit();
					window.deposit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public deposit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		deposit = new JFrame("存款服務");
		deposit.setBounds(100, 100, 600, 450);
		deposit.setVisible(true);
		deposit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deposit.getContentPane().setLayout(null);
		

		JButton confirm = new JButton("\u78BA\u8A8D");
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check.bal +=Integer.parseInt(deptext.getText());
				deposit.dispose();
				new askprtrcp();
			}
		});
		confirm.setBackground(Color.PINK);
		confirm.setFont(new Font("標楷體", Font.PLAIN, 22));
		confirm.setBounds(143, 265, 85, 35);
		deposit.getContentPane().add(confirm);
		
		JLabel lab = new JLabel("\u8ACB\u8F38\u5165\u60A8\u8981\u5B58\u5165\u7684\u91D1\u984D\uFF1A");
		lab.setFont(new Font("標楷體", Font.PLAIN, 22));
		lab.setBounds(173, 94, 246, 46);
		deposit.getContentPane().add(lab);
		
		deptext = new JTextField();
		deptext.setBounds(207, 171, 176, 35);
		deposit.getContentPane().add(deptext);
		deptext.setColumns(10);
		deptext.setFont(new Font("標楷體", Font.PLAIN, 20));
		
		JButton cancel = new JButton("\u53D6\u6D88");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deposit.dispose();
				new mainpage();
			}
		});
		cancel.setFont(new Font("標楷體", Font.PLAIN, 22));
		cancel.setBackground(Color.PINK);
		cancel.setBounds(365, 265, 85, 35);
		deposit.getContentPane().add(cancel);
	}
}