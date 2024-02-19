package final_atm;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class T_complete {

	private JFrame T_complete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T_complete window = new T_complete();
					window.T_complete.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public T_complete() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String nam = "";
		T_complete = new JFrame("轉帳成功");
		T_complete.setBounds(100, 100, 600, 450);
		T_complete.setVisible(true);
		T_complete.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		T_complete.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("\u4EA4\u6613\u8CC7\u8A0A\uFF1A");
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 22));
		lblNewLabel.setBounds(83, 58, 112, 52);
		T_complete.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1_1 = new JButton("\u78BA\u8A8D");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				T_complete.dispose();
				 new askotherserv();
			}
		});
		if(check.tarbknam.equals("001"))
		{
			nam = "土地銀行";
		}
		else if(check.tarbknam.equals("002"))
		{
			nam = "國泰世華";
		}
		else if(check.tarbknam.equals("003"))
		{
			nam = "花旗銀行";
		}
		btnNewButton_1_1.setFont(new Font("標楷體", Font.PLAIN, 22));
		btnNewButton_1_1.setBackground(Color.PINK);
		btnNewButton_1_1.setBounds(407, 269, 85, 35);
		T_complete.getContentPane().add(btnNewButton_1_1);
		
		JLabel accinf = new JLabel("轉入帳號:" + nam + " "+check.tarnam);
		accinf.setBounds(190, 132, 273, 35);
		T_complete.getContentPane().add(accinf);
		accinf.setFont(new Font("標楷體", Font.PLAIN, 20));
		
		JLabel tdnumbinf = new JLabel();
		if(check.page == 1) {
			tdnumbinf = new JLabel("轉入金額:NT. 0");
		}else {
			tdnumbinf = new JLabel("轉入金額:NT." + check.tradenum);
		}
		tdnumbinf.setBounds(190, 190, 210, 35);
		T_complete.getContentPane().add(tdnumbinf);
		tdnumbinf.setFont(new Font("標楷體", Font.PLAIN, 20));
		
	}
}