import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class quiz2 {

	private JFrame frmWater;
	private JTextField textFieldnum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quiz2 window = new quiz2();
					window.frmWater.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public quiz2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWater = new JFrame();
		frmWater.setTitle("Water Calculator");
		frmWater.setBounds(100, 100, 451, 251);
		frmWater.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWater.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Tell Me");
		btnNewButton.setBackground(new Color(127, 255, 212));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num;
				try {
					num=Integer.parseInt(textFieldnum.getText());
					//water to drink = ur weight * 0.033
					double ans;
					ans = num * 0.033;
					JOptionPane.showMessageDialog(null, ("Buddy, you should drink "+ans+"L of water a day!"));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, ("Please Enter A Valid Number"));
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(149, 127, 116, 31);
		frmWater.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("How much water should i drink? ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(101, 34, 256, 47);
		frmWater.getContentPane().add(lblNewLabel);
		
		JLabel lblMyWeightkg = new JLabel("My weight (kg):");
		lblMyWeightkg.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblMyWeightkg.setBounds(130, 83, 116, 31);
		frmWater.getContentPane().add(lblMyWeightkg);
		
		textFieldnum = new JTextField();
		textFieldnum.setBounds(243, 86, 57, 25);
		frmWater.getContentPane().add(textFieldnum);
		textFieldnum.setColumns(10);
	}
}
