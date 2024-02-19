package final_atm;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class query {

	private JFrame query;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					query window = new query();
					window.query.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public query() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		query = new JFrame("餘額查詢");
		query.setVisible(true);
		query.setBounds(100, 100, 600, 450);
		query.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		query.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u5E33\u6236\u9918\u984D\uFF1A");
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 26));
		lblNewLabel.setBounds(142, 102, 149, 62);
		query.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u662F\u5426\u8981\u9032\u884C\u5176\u4ED6\u4EA4\u6613");
		lblNewLabel_1.setFont(new Font("標楷體", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(178, 222, 227, 68);
		query.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\u662F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				query.dispose();
				new mainpage();
			}
		});
		btnNewButton.setFont(new Font("標楷體", Font.PLAIN, 24));
		btnNewButton.setBounds(189, 323, 80, 62);
		query.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u5426");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("標楷體", Font.PLAIN, 24));
		btnNewButton_1.setBounds(313, 323, 80, 62);
		query.getContentPane().add(btnNewButton_1);
		
		JLabel balshowlab = new JLabel("NT."+Integer.toString(check.bal));
		balshowlab.setBounds(301, 104, 130, 60);
		query.getContentPane().add(balshowlab);
		balshowlab.setFont(new Font("標楷體", Font.PLAIN, 24));
	}

}
