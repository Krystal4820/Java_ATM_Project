package final_atm;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class askotherserv {

	private JFrame other;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					askotherserv window = new askotherserv();
					window.other.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public askotherserv() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		other = new JFrame("是否進行其他服務");
		other.setBounds(100, 100, 600, 450);
		other.setVisible(true);
		other.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		other.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u662F\u5426\u9032\u884C\u5176\u4ED6\u670D\u52D9\uFF1F");
		lblNewLabel.setFont(new Font("標楷體", Font.PLAIN, 22));
		lblNewLabel.setBounds(182, 114, 202, 52);
		other.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u662F");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				other.dispose();
				new mainpage();
			}
		});
		btnNewButton.setFont(new Font("標楷體", Font.PLAIN, 22));
		btnNewButton.setBounds(133, 246, 85, 35);
		other.getContentPane().add(btnNewButton);
		
		JButton exit = new JButton("\u5426");
		exit.setBackground(Color.PINK);
		exit.setFont(new Font("標楷體", Font.PLAIN, 22));
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setBounds(359, 363, 85, 35);
		
		exit.setFont(new Font("標楷體", Font.PLAIN, 22));
		exit.setBounds(358, 246, 85, 35);
		other.getContentPane().add(exit);
		
	}

}
