package Package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class SalaryReport {

	private JFrame frmEmployeePayrollManagement;
	private JTextField getdata;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textCity;
	private JTextField textSalary;
	private JTextField textTime;
	private JTextField textGross;
	
	
	double InnerCity;
	double BasicWage;
	double OverTime;
	double Gross;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalaryReport window = new SalaryReport();
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
	public SalaryReport() {
		initialize();
		Toolkit t1=Toolkit.getDefaultToolkit();
        Dimension screensize=t1.getScreenSize();
        int screenwith = screensize.width;
		int screenheight = screensize.height;
		
		frmEmployeePayrollManagement.setSize(screenwith, screenheight);
		frmEmployeePayrollManagement.setLocationRelativeTo(null);
		frmEmployeePayrollManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Salary Report");
		lblNewLabel.setBounds(448, 10, 498, 59);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 45));
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel);
		
		getdata = new JTextField();
		getdata.setBounds(1033, 25, 71, 29);
		getdata.setColumns(10);
		frmEmployeePayrollManagement.getContentPane().add(getdata);
		
		JButton btnNewButton = new JButton("GetData");
		btnNewButton.setBounds(1147, 23, 112, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=getdata.getText();
				JDBC1 j=new JDBC1();
				ResultSet result=null;
				result=j.getrow(number);
				try {
					while(result.next()) {
						textField.setText(result.getString(1));
//						textArea.setText(result.getString(3));
//						textField_5.setText(result.getString(6));
//						textField_4.setText(result.getString(5));
//						textField_2.setText(result.getString(4));
//						textField_6.setText(result.getString(7));
//						textField_7.setText(result.getString(8));
						textField_1.setText(result.getString(2));
						
						
						
						
						
						
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBackground(SystemColor.menu);
		frmEmployeePayrollManagement.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name :");
		lblNewLabel_1.setBounds(22, 120, 295, 42);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(275, 127, 231, 29);
		textField.setFont(new Font("Arial", Font.PLAIN, 23));
		textField.setColumns(10);
		frmEmployeePayrollManagement.getContentPane().add(textField);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Employee ID :");
		lblNewLabel_1_1_1.setBounds(22, 184, 220, 42);
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(275, 192, 192, 29);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 23));
		textField_1.setColumns(10);
		frmEmployeePayrollManagement.getContentPane().add(textField_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 97, 1502, 2);
		frmEmployeePayrollManagement.getContentPane().add(separator);
		
		JLabel lblNewLabel_1_3 = new JLabel("Inner City Weighting : ");
		lblNewLabel_1_3.setBounds(545, 120, 253, 33);
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_3);
		
		textCity = new JTextField();
		textCity.setBounds(820, 120, 256, 33);
		textCity.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textCity.setColumns(10);
		frmEmployeePayrollManagement.getContentPane().add(textCity);
		
		JLabel lblNewLabel_1_4 = new JLabel("Basic Salary :");
		lblNewLabel_1_4.setBounds(545, 190, 234, 33);
		lblNewLabel_1_4.setFont(new Font("Arial Black", Font.BOLD, 20));
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_4);
		
		textSalary = new JTextField();
		textSalary.setBounds(820, 190, 256, 33);
		textSalary.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textSalary.setColumns(10);
		frmEmployeePayrollManagement.getContentPane().add(textSalary);
		
		JLabel lblNewLabel_1_5 = new JLabel("Over Time :");
		lblNewLabel_1_5.setBounds(545, 257, 234, 33);
		lblNewLabel_1_5.setFont(new Font("Arial Black", Font.BOLD, 20));
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_5);
		
		textTime = new JTextField();
		textTime.setBounds(820, 257, 256, 33);
		textTime.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textTime.setColumns(10);
		frmEmployeePayrollManagement.getContentPane().add(textTime);
		
		JLabel lblNewLabel_1_6 = new JLabel("Gross Pay :");
		lblNewLabel_1_6.setBounds(24, 257, 155, 33);
		lblNewLabel_1_6.setFont(new Font("Arial Black", Font.BOLD, 20));
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_6);
		
		textGross = new JTextField();
		textGross.setBounds(275, 255, 190, 42);
		textGross.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textGross.setColumns(10);
		frmEmployeePayrollManagement.getContentPane().add(textGross);
		
		JTextArea rtfpayslip = new JTextArea();
		rtfpayslip.setBounds(1148, 152, 346, 399);
		frmEmployeePayrollManagement.getContentPane().add(rtfpayslip);
		
		JButton btnNewButton_1 = new JButton("Pay Slip");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rtfpayslip.append("Employee Name             : "+textField.getText()+"\n\n");
				rtfpayslip.append("Employee ID               : "+textField_1.getText()+"\n\n");
				rtfpayslip.append("*********    Employee Salary Details   *******"+"\n\n");
				rtfpayslip.append("Employee InnerCity        : "+textCity.getText()+"\n\n");
				rtfpayslip.append("Employee Basic Salary     : "+textSalary.getText()+"\n\n");
				rtfpayslip.append("Employee overTime Credit  : "+textTime.getText()+"\n\n");
				rtfpayslip.append("Employee GrossPay         : "+textGross.getText()+"\n\n");
			}
		});
		btnNewButton_1.setBounds(1160, 585, 146, 41);
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		frmEmployeePayrollManagement.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("NET Wages");
		btnNewButton_1_1.setBounds(1337, 585, 146, 41);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 InnerCity=Double.parseDouble(textCity.getText());
                 BasicWage=Double.parseDouble(textSalary.getText());
                 OverTime=Double.parseDouble(textTime.getText());
                 Gross=InnerCity+ BasicWage+OverTime;
                 String GrossPay=String.format("%.2f",Gross);
                 System.out.println(GrossPay);
                 textGross.setText(GrossPay);
                 
//                 String sInnerCity=String.format("$%.2f", InnerCity);
//                 textCity.setText(sInnerCity);
//                 
//                 String sBasicWage=String.format("$%.2f",BasicWage);
//                 textSalary.setText(sBasicWage);
//				
//                 String sOverTime=String.format("$%.2f",OverTime);
//                 textTime.setText(sOverTime);
			}
		});
		btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		frmEmployeePayrollManagement.getContentPane().add(btnNewButton_1_1);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(1170, 737, 146, 41);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textCity.setText(null);
				textGross.setText(null);
				textSalary.setText(null);
				textTime.setText(null);
				rtfpayslip.setText(null);
			}
		});
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 16));
		frmEmployeePayrollManagement.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(1337, 737, 146, 41);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEmployeePayrollManagement =new JFrame("EXIT");
				
				if(JOptionPane.showConfirmDialog(frmEmployeePayrollManagement, "Confirm Do You want to exit","Payroll System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					
					System.exit(0);
				}
				
				
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 16));
		frmEmployeePayrollManagement.getContentPane().add(btnExit);
		
		JPanel panel = new JPanel();
		panel.setBounds(1131, 112, 381, 449);
		frmEmployeePayrollManagement.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Pay Slip :");
		lblNewLabel_1_5_1.setBounds(138, 5, 105, 29);
		panel.add(lblNewLabel_1_5_1);
		lblNewLabel_1_5_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setBounds(1160, 660, 146, 41);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ID=textField_1.getText();
			     String Name=textField.getText();
			     double Gross=Double.parseDouble(textGross.getText());
			     double InnerCity=Double.parseDouble(textCity.getText());
			     double BasicWage=Double.parseDouble(textSalary.getText());
			     double OverTime=Double.parseDouble(textTime.getText());
			     System.out.println(ID+Name+Gross+InnerCity+BasicWage+OverTime);
			     
			     
			     JDBC1 j=new JDBC1();
			     int status=j.insertdata1(ID, Name, Gross, InnerCity, BasicWage, OverTime);
			     if(status==1) {
						JOptionPane.showMessageDialog(null, "Data Added");
						
					}else {
						JOptionPane.showMessageDialog(null, "Problem in adding ");
					}
				
			}
		});
		btnSave.setFont(new Font("Arial Black", Font.BOLD, 16));
		frmEmployeePayrollManagement.getContentPane().add(btnSave);
		
		JButton btnShow = new JButton("SHOW");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDBC1 j=new JDBC1();
				ResultSet result =j.getTable1();
				DefaultTableModel model=new DefaultTableModel();
				String[] columnNames= {"ID", "Name", "GrossPay", "InnerCity", "BasicWage", "OverTime"};
				model.setColumnIdentifiers(columnNames);
				try {
					while(result.next()) {
						model.addRow(new Object[] {
								result.getString(1),
								result.getString(2),
								result.getDouble(3),
								result.getDouble(4),
								result.getDouble(5),
								result.getDouble(6)
						});
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				table.setModel(model);
				table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				try {
					result.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnShow.setBounds(1337, 660, 146, 41);
		btnShow.setFont(new Font("Arial Black", Font.BOLD, 16));
		frmEmployeePayrollManagement.getContentPane().add(btnShow);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 359, 1094, 2);
		frmEmployeePayrollManagement.getContentPane().add(separator_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 429, 1052, 327);
		frmEmployeePayrollManagement.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "GrossPay", "InnerCity", "BasicWage", "OverTime"
			}
		));
		scrollPane.setViewportView(table);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeePayrollManagement = new JFrame();
		frmEmployeePayrollManagement.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmEmployeePayrollManagement.setTitle("Employee Payroll Management");
		frmEmployeePayrollManagement.setBounds(100, 100, 450, 300);
		frmEmployeePayrollManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
