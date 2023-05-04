package Restro_bill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
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
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 668, 354);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restaurant Bill ");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(220, 11, 270, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MENU");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(25, 72, 72, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("QUANTITY");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(24, 162, 119, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setForeground(Color.BLACK);
		c1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Tea-Rs.10", "Coffee-Rs.30", "Maggie-Rs.50", "Ice-Cream-Rs.120"}));
		c1.setBounds(220, 77, 155, 22);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(220, 166, 155, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("order");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String quantity=t1.getText();
				int q=Integer.parseInt(quantity);
				int bill=0;
				if(item.equals("Tea-Rs.10"))
				{
					bill=q*10;
				JOptionPane.showMessageDialog(btnNewButton, "hello mawa\n selected item:"+item+"\n quantity:"+q+"\n your bill:"+bill);
				}
				else if(item.equals("Coffee-Rs.30"))
				{
					bill=q*30;
					JOptionPane.showMessageDialog(btnNewButton, "hello mawa\n selected item:"+item+"\n quantity:"+q+"\n your bill:"+bill);
				}
				else if(item.equals("Maggie-Rs.50"))
				{
					bill=q*50;
					JOptionPane.showMessageDialog(btnNewButton, "hello mawa\n selected item:"+item+"\n quantity:"+q+"\n your bill:"+bill);
				}
				else if(item.equals("Ice-Cream-Rs.120"))
				{
					bill=q*120;
							JOptionPane.showMessageDialog(btnNewButton, "hello mawa\n selected item:"+item+"\n quantity:"+q+"\n your bill:"+bill);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(175, 252, 89, 35);
		frame.getContentPane().add(btnNewButton);
	}
}
