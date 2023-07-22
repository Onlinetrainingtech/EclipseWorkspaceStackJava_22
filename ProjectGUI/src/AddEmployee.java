import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmployee frame = new AddEmployee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AddEmployeeDetails");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(147, 10, 153, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EmployeeId");
		lblNewLabel_1.setBounds(25, 53, 82, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("EmpName");
		lblNewLabel_2.setBounds(25, 102, 82, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("EmpSalary");
		lblNewLabel_3.setBounds(25, 154, 63, 13);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(146, 50, 136, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(147, 99, 135, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(147, 151, 135, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		final JButton btnNewButton = new JButton("AddEmployee");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					//int empid=Integer.parseInt(textField.getText());
					String empid=textField.getText();
					String empname=textField_1.getText();
					String salary=textField_2.getText();
					String str1="insert into addemployee values('"+empid+"','"+empname+"','"+salary+"')";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javap22","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str1);
					JOptionPane.showMessageDialog(btnNewButton,"Inserted...");
				}
				catch(ClassNotFoundException t)
				{
					
				}
				catch(SQLException t1)
				{
					
				}
			}
		});
		btnNewButton.setBounds(10, 210, 85, 21);
		contentPane.add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String empid=textField.getText();
					String str2="select * from addemployee where empid='"+empid+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javap22","sa","");
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(str2);
					rs.next();
					String t1=rs.getString(1);
					String t2=rs.getString(2);
					textField_1.setText(t1);
					textField_2.setText(t2);
					
					JOptionPane.showMessageDialog(btnNewButton_1,"Search!!!");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnNewButton_1.setBounds(147, 210, 85, 21);
		contentPane.add(btnNewButton_1);
		
		final JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String empid=textField.getText();
					String empname=textField_1.getText();
					String str3="update addemployee set empname='"+empname+"' where empid='"+empid+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javap22","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str3);
					JOptionPane.showMessageDialog(btnNewButton_2,"Updated...");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnNewButton_2.setBounds(270, 210, 85, 21);
		contentPane.add(btnNewButton_2);
		
		final JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String empid=textField.getText();
					String str4="delete addemployee where empid='"+empid+"'";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javap22","sa","");
					Statement stmt=conn.createStatement();
					stmt.executeUpdate(str4);
					JOptionPane.showMessageDialog(btnNewButton_3,"Deleted...");
				}
				catch(Exception t)
				{
					
				}
			}
		});
		btnNewButton_3.setBounds(321, 150, 85, 21);
		contentPane.add(btnNewButton_3);
	}

}
