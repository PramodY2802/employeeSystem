package Package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeManagementWindow {

	private JFrame frmEmployeePayrollManagement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeManagementWindow window = new EmployeeManagementWindow();
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
	public EmployeeManagementWindow() {
		initialize();
		Toolkit t1=Toolkit.getDefaultToolkit();
        Dimension screensize=t1.getScreenSize();
        int screenwith = screensize.width;
		int screenheight = screensize.height;
		
		frmEmployeePayrollManagement.setSize(screenwith, screenheight);;
		frmEmployeePayrollManagement.setLocationRelativeTo(null);
		frmEmployeePayrollManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Admin");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 42));
		lblNewLabel.setBounds(521, 38, 484, 43);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 113, 1532, 2);
		frmEmployeePayrollManagement.getContentPane().add(separator);
		
		JButton btnEmployeeMonthlySallary = new JButton("Employee Monthly Sallary");
		btnEmployeeMonthlySallary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SalaryReport.main(null);
			}
		});
		btnEmployeeMonthlySallary.setForeground(Color.BLACK);
		btnEmployeeMonthlySallary.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnEmployeeMonthlySallary.setBackground(Color.WHITE);
		btnEmployeeMonthlySallary.setBounds(618, 348, 278, 43);
		frmEmployeePayrollManagement.getContentPane().add(btnEmployeeMonthlySallary);
		
		JButton btnAddNewEmployee = new JButton("Add New Employee");
		btnAddNewEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeDetails.main(null);
				
				
			}
		});
		btnAddNewEmployee.setForeground(Color.BLACK);
		btnAddNewEmployee.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnAddNewEmployee.setBackground(Color.WHITE);
		btnAddNewEmployee.setBounds(618, 233, 278, 43);
		frmEmployeePayrollManagement.getContentPane().add(btnAddNewEmployee);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Information");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1.setBounds(581, 139, 435, 31);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 417, 1532, 2);
		frmEmployeePayrollManagement.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Employee Manager");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(597, 456, 435, 31);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnEmployeeShowTable = new JButton("Employee show Table");
		btnEmployeeShowTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowData.main(null);
			}
		});
		btnEmployeeShowTable.setForeground(Color.BLACK);
		btnEmployeeShowTable.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnEmployeeShowTable.setBackground(Color.WHITE);
		btnEmployeeShowTable.setBounds(618, 544, 278, 43);
		frmEmployeePayrollManagement.getContentPane().add(btnEmployeeShowTable);
		
		JButton btnRemoveEmployee = new JButton("Remove Employee");
		btnRemoveEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateEmpWindow.main(null);
			}
		});
		btnRemoveEmployee.setForeground(Color.BLACK);
		btnRemoveEmployee.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnRemoveEmployee.setBackground(Color.WHITE);
		btnRemoveEmployee.setBounds(618, 694, 278, 43);
		frmEmployeePayrollManagement.getContentPane().add(btnRemoveEmployee);
		
		JButton btnUpadateEmployeeInformation = new JButton("Upadate Employee Info.");
		btnUpadateEmployeeInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateEmployee1.main(null);
			}
		});
		btnUpadateEmployeeInformation.setForeground(Color.BLACK);
		btnUpadateEmployeeInformation.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnUpadateEmployeeInformation.setBackground(Color.WHITE);
		btnUpadateEmployeeInformation.setBounds(618, 617, 278, 43);
		frmEmployeePayrollManagement.getContentPane().add(btnUpadateEmployeeInformation);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 750, 1532, 2);
		frmEmployeePayrollManagement.getContentPane().add(separator_1_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEmployeePayrollManagement.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBounds(116, 758, 101, 24);
		frmEmployeePayrollManagement.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frmEmployeePayrollManagement =new JFrame("EXIT");
					
					if(JOptionPane.showConfirmDialog(frmEmployeePayrollManagement, "Confirm Do You want to exit","Payroll System",
							JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
						
						System.exit(0);
					}
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnExit.setBounds(1278, 758, 101, 24);
		frmEmployeePayrollManagement.getContentPane().add(btnExit);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeePayrollManagement = new JFrame();
		frmEmployeePayrollManagement.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmEmployeePayrollManagement.setForeground(Color.MAGENTA);
		frmEmployeePayrollManagement.getContentPane().setForeground(Color.MAGENTA);
		frmEmployeePayrollManagement.setTitle("Employee Admin");
		frmEmployeePayrollManagement.setBounds(100, 100, 450, 300);
		frmEmployeePayrollManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
