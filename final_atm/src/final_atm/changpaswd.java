package final_atm;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class changpaswd {

	private JFrame frame;
	private JTextField defpastxt;
	private JTextField newpastxt;
	private JTextField newpaschetxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					changpaswd window = new changpaswd();
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
	public changpaswd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("密碼變更");
		frame.setVisible(true);
		frame.setBounds(100, 100, 600, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel infolab = new JLabel("\u8ACB\u8F38\u5165\u60A8\u7684\u539F\u5BC6\u78BC\u8207\u65B0\u5BC6\u78BC\uFF0C\u8F38\u5165\u5B8C\u6210\u8ACB\u6309\u3010\u78BA\u8A8D\u3011\u9375");
		infolab.setBounds(22, 53, 538, 34);
		frame.getContentPane().add(infolab);
		infolab.setFont(new Font("標楷體", Font.PLAIN, 22));
		
		JLabel defpaslab = new JLabel("\u539F\u5BC6\u78BC");
		defpaslab.setBounds(127, 111, 87, 39);
		frame.getContentPane().add(defpaslab);
		defpaslab.setFont(new Font("標楷體", Font.PLAIN, 20));
		
		JLabel newpaslab = new JLabel("\u65B0\u5BC6\u78BC");
		newpaslab.setBounds(127, 160, 76, 39);
		frame.getContentPane().add(newpaslab);
		newpaslab.setFont(new Font("標楷體", Font.PLAIN, 20));
		
		JLabel newpaschelab = new JLabel("\u78BA\u8A8D\u5BC6\u78BC");
		newpaschelab.setBounds(127, 209, 87, 40);
		frame.getContentPane().add(newpaschelab);
		newpaschelab.setFont(new Font("標楷體", Font.PLAIN, 20));
		
		JTextField defpastxt = new JTextField();
		defpastxt.setBounds(239, 114, 170, 30);
		frame.getContentPane().add(defpastxt);
		defpastxt.setColumns(10);
		defpastxt.setFont(new Font("標楷體", Font.PLAIN, 22));
		
		JTextField newpastxt = new JTextField();
		newpastxt.setBounds(239, 163, 170, 30);
		frame.getContentPane().add(newpastxt);
		newpastxt.setColumns(10);
		newpastxt.setFont(new Font("標楷體", Font.PLAIN, 22));
		
		newpaschetxt = new JTextField();
		newpaschetxt.setBounds(239, 213, 170, 30);
		frame.getContentPane().add(newpaschetxt);
		newpaschetxt.setColumns(10);
		newpaschetxt.setFont(new Font("標楷體", Font.PLAIN, 22));
		
		JButton confirm = new JButton("\u78BA\u8A8D");
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check.passwd.equals(defpastxt.getText()))
				{
					if(newpastxt.getText().equals(newpaschetxt.getText()) &&newpastxt.getText()!=null)
					{
						check c = new check();
						check.passwd = newpaschetxt.getText();
						try {
							c.storeuserfile();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						frame.dispose();
						new askotherserv();
					}
					else JOptionPane.showMessageDialog(null, "新密碼驗證錯誤", "錯誤", JOptionPane.ERROR_MESSAGE);
				}
				else JOptionPane.showMessageDialog(null, "原密碼錯誤", "錯誤", JOptionPane.ERROR_MESSAGE);
				
			}
		});
		confirm.setBounds(127, 302, 85, 35);
		frame.getContentPane().add(confirm);
		confirm.setFont(new Font("標楷體", Font.PLAIN, 22));
		
		JButton cancel = new JButton("\u53D6\u6D88");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new mainpage();
			}
		});
		cancel.setBounds(378, 302, 85, 35);
		frame.getContentPane().add(cancel);
		cancel.setFont(new Font("標楷體", Font.PLAIN, 22));
	}
}
