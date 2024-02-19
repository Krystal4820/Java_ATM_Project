package final_atm;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Transfer {

	private JFrame Transfer;
	private JTextField acctext;
	private JTextField amountext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transfer window = new Transfer();
					window.Transfer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Transfer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Transfer = new JFrame("轉帳服務");
		Transfer.setBounds(100, 100, 600, 450);
		Transfer.setVisible(true);
		Transfer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Transfer.getContentPane().setLayout(null);
		
		JLabel bankkab = new JLabel("\u8ACB\u9078\u64C7\u9280\u884C\u4EE3\u78BC\uFF1A");
		bankkab.setFont(new Font("標楷體", Font.PLAIN, 22));
		bankkab.setBounds(56, 56, 179, 36);
		Transfer.getContentPane().add(bankkab);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("標楷體", Font.PLAIN, 18));
		comboBox.addItem("005  土地銀行");
		comboBox.addItem("013  國泰世華");
		comboBox.addItem("021  花旗銀行");
		comboBox.setBounds(245, 53, 149, 45);
		Transfer.getContentPane().add(comboBox);
		
		
		JLabel lblNewLabel_1 = new JLabel("\u8ACB\u8F38\u5165\u8F49\u5E33\u5E33\u6236\uFF1A");
		lblNewLabel_1.setFont(new Font("標楷體", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(56, 138, 179, 45);
		Transfer.getContentPane().add(lblNewLabel_1);
		
		acctext = new JTextField();
		acctext.setBounds(262, 145, 188, 36);
		Transfer.getContentPane().add(acctext);
		acctext.setColumns(10);
		acctext.setFont(new Font("標楷體", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1_1 = new JLabel("\u8ACB\u8F38\u5165\u8F49\u5E33\u91D1\u984D\uFF1A");
		lblNewLabel_1_1.setFont(new Font("標楷體", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(56, 215, 179, 45);
		Transfer.getContentPane().add(lblNewLabel_1_1);
		
		amountext = new JTextField();
		amountext.setColumns(10);
		amountext.setBounds(262, 224, 188, 36);
		Transfer.getContentPane().add(amountext);
		amountext.setFont(new Font("標楷體", Font.PLAIN, 20));
		
		JButton cancel = new JButton("\u53D6\u6D88");
		cancel.setBackground(Color.PINK);
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Transfer.dispose();
				new mainpage();
			}
		});
		cancel.setFont(new Font("標楷體", Font.PLAIN, 22));
		cancel.setBounds(354, 324, 85, 35);
		Transfer.getContentPane().add(cancel);
		
		JButton confirm = new JButton("\u78BA\u8A8D");
		confirm.setBackground(Color.PINK);
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(acctext.getText().equals(null)||amountext.getText().equals(null))
				{
					JOptionPane.showMessageDialog(null, "請輸入帳號與金額", "錯誤", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					String bank = "";
					if(comboBox.getSelectedItem() == "005  土地銀行")
					{
						bank = "001";
					}
					else if(comboBox.getSelectedItem() == "013  國泰世華")
					{
						bank = "002";
					}
					else if(comboBox.getSelectedItem() == "021  花旗銀行")
					{
						bank = "003";
					}
					int res=JOptionPane.showConfirmDialog(null, "是否確定轉帳?", "是否繼續", JOptionPane.YES_NO_OPTION);
						if(res==JOptionPane.YES_OPTION)
						{ 
							int bal = 0;
							try {
								bal = Integer.parseInt(amountext.getText());
							}catch(Exception E) {
								JOptionPane.showMessageDialog(null, "格式有誤", "錯誤", JOptionPane.ERROR_MESSAGE);
								
							}
							check c = new check();
							try {
								c.transfercheck(bank, acctext.getText(),bal);
								
								if(c.d == 0) {JOptionPane.showMessageDialog(null, "帳號輸入錯誤", "錯誤", JOptionPane.ERROR_MESSAGE);
								System.out.println("");}
								else
								{
									c.storeuserfile();
									c.storetagfile(bank, acctext.getText(), bal);
									Transfer.dispose();
									new T_complete();
								}
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						else return;
				}
			}
		});
		confirm.setFont(new Font("標楷體", Font.PLAIN, 22));
		confirm.setBounds(112, 324, 85, 35);
		Transfer.getContentPane().add(confirm);
		
		
	}
}