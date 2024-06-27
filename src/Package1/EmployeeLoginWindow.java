package Package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;



import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeLoginWindow {

	private JFrame frmEmployeePayrollManagement;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeLoginWindow window = new EmployeeLoginWindow();
					window.frmEmployeePayrollManagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeLoginWindow() {
		initialize();
		Toolkit t1=Toolkit.getDefaultToolkit();
        Dimension screensize=t1.getScreenSize();
        int screenwith = screensize.width;
		int screenheight = screensize.height;
		
		frmEmployeePayrollManagement.setSize(screenwith/2, screenheight/2);;
		frmEmployeePayrollManagement.setLocationRelativeTo(null);
		frmEmployeePayrollManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Login Page");
		lblNewLabel.setBounds(0, 10, 716, 49);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 57, 744, 2);
		frmEmployeePayrollManagement.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 307, 754, 2);
		frmEmployeePayrollManagement.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(43, 107, 45, 13);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LoginName :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(53, 107, 139, 40);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password    :");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(53, 179, 139, 40);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 27));
		textField.setBounds(267, 112, 309, 33);
		frmEmployeePayrollManagement.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 27));
		passwordField.setBounds(267, 180, 309, 33);
		frmEmployeePayrollManagement.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("www.dypatilcoei.com");
		lblNewLabel_3.setForeground(Color.ORANGE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblNewLabel_3.setBounds(253, 256, 369, 25);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("LogIn");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String login_id = textField.getText();
				String pass = passwordField.getText();
				//System.out.println(login_id+password);
				if(login_id.equals("pramod") && pass.equals("yadav")) {
//					System.out.println("wow:successfully egistration");
					EmployeeManagementWindow.main(null);
				
					
				}else {
                      JOptionPane.showMessageDialog(null, "invalid user");
					
				}	
			}
		});
				
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBounds(60, 334, 100, 40);
		frmEmployeePayrollManagement.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                   frmEmployeePayrollManagement =new JFrame("EXIT");
				
				if(JOptionPane.showConfirmDialog(frmEmployeePayrollManagement, "Confirm Do You want to exit","Payroll System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					
					System.exit(0);
				}
			       
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnExit.setBounds(580, 334, 100, 40);
		frmEmployeePayrollManagement.getContentPane().add(btnExit);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeePayrollManagement = new JFrame();
		frmEmployeePayrollManagement.setForeground(Color.CYAN);
		frmEmployeePayrollManagement.getContentPane().setBackground(Color.CYAN);
		frmEmployeePayrollManagement.setBackground(Color.CYAN);
		frmEmployeePayrollManagement.getContentPane().setForeground(Color.CYAN);
		frmEmployeePayrollManagement.setFont(new Font("Arial Black", Font.BOLD, 20));
		frmEmployeePayrollManagement.setTitle("Employee Payroll Management System");
		frmEmployeePayrollManagement.setBounds(100, 100, 450, 300);
		frmEmployeePayrollManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
