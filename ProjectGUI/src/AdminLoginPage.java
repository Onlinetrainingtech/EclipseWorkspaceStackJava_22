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
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AdminLoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLoginPage frame = new AdminLoginPage();
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
	public AdminLoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 416, 243);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AdminLogin");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(157, 10, 120, 22);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("AdminId");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(28, 76, 93, 22);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("AdminPwd");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2.setBounds(28, 134, 93, 22);
		panel.add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(131, 78, 146, 19);
		panel.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(131, 136, 146, 19);
		panel.add(t2);
		t2.setColumns(10);
		
		final JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String u1=t1.getText();
					String p1=t2.getText();
					String str1="select * from adminlogin";
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/javap22","sa","");
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(str1);
					rs.next();
					String uname=rs.getString(1);
					String pass=rs.getString(2);
					if(u1.equals(uname)&&p1.equals(pass))
					{
						JOptionPane.showMessageDialog(btnNewButton,"LoginSuccess!!!");
						new AdminHomePage().setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton,"LoginFail!!!");
					}
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnNewButton.setBounds(61, 212, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				t1.setText("");
				t2.setText("");
			}
		});
		btnNewButton_1.setBounds(219, 212, 85, 21);
		panel.add(btnNewButton_1);
	}
}
