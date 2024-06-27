package Package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class PayrollWindow {

	private JFrame frmEmployeePayrollManagement;
	private JTextField textName;
	private JTextField textName1;
	private JTextField textID;
	private JTextField textCity;
	private JTextField textSallary;
	private JTextField textTime;
	private JTextField textGross;
	private JTextField textPension;
	private JTextField textNet;
	private JTextField textAddress;
	private JTextField textNI;
	private JTextField textTax;
	private JTextField textLoan;
	private JTextField textPension1;
	private JTextField textNI1;
	private JTextField textTax1;
	private JTextField textDeduction;
	
	double InnerCity;
	double BasicWage;
	double OverTime;
	double Gross;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayrollWindow window = new PayrollWindow();
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
	public PayrollWindow() {
		initialize();
		Toolkit t1=Toolkit.getDefaultToolkit();
        Dimension screensize=t1.getScreenSize();
        int screenwith = screensize.width;
		int screenheight = screensize.height;
		
		frmEmployeePayrollManagement.setSize(screenwith, screenheight);;
		frmEmployeePayrollManagement.setLocationRelativeTo(null);
		frmEmployeePayrollManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Payroll Management System");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 42));
		lblNewLabel.setBounds(465, 10, 741, 52);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 72, 1523, 5);
		frmEmployeePayrollManagement.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Employer's Name :");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(20, 87, 234, 33);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textName.setBounds(295, 87, 256, 33);
		frmEmployeePayrollManagement.getContentPane().add(textName);
		textName.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Employee Name :");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(20, 138, 234, 33);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1);
		
		textName1 = new JTextField();
		textName1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textName1.setColumns(10);
		textName1.setBounds(295, 138, 256, 33);
		frmEmployeePayrollManagement.getContentPane().add(textName1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Employee ID :");
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(20, 192, 234, 33);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_2);
		
		textID = new JTextField();
		textID.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textID.setColumns(10);
		textID.setBounds(295, 192, 256, 33);
		frmEmployeePayrollManagement.getContentPane().add(textID);
		
		JLabel lblNewLabel_1_3 = new JLabel("Inner City Weighting : ");
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(20, 378, 253, 33);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_3);
		
		textCity = new JTextField();
		textCity.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textCity.setColumns(10);
		textCity.setBounds(295, 378, 256, 33);
		frmEmployeePayrollManagement.getContentPane().add(textCity);
		
		JLabel lblNewLabel_1_4 = new JLabel("Basic Salary :");
		lblNewLabel_1_4.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(20, 448, 234, 33);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_4);
		
		textSallary = new JTextField();
		textSallary.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textSallary.setColumns(10);
		textSallary.setBounds(295, 448, 256, 33);
		frmEmployeePayrollManagement.getContentPane().add(textSallary);
		
		JLabel lblNewLabel_1_5 = new JLabel("Over Time :");
		lblNewLabel_1_5.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(20, 515, 234, 33);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_5);
		
		textTime = new JTextField();
		textTime.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textTime.setColumns(10);
		textTime.setBounds(295, 515, 256, 33);
		frmEmployeePayrollManagement.getContentPane().add(textTime);
		
		JLabel lblNewLabel_1_6 = new JLabel("Gross Pay :");
		lblNewLabel_1_6.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(20, 643, 234, 33);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_6);
		
		textGross = new JTextField();
		textGross.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textGross.setColumns(10);
		textGross.setBounds(295, 643, 256, 33);
		frmEmployeePayrollManagement.getContentPane().add(textGross);
		
		JLabel lblNewLabel_1_7 = new JLabel("Pensionable Pay :");
		lblNewLabel_1_7.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_7.setBounds(20, 713, 234, 33);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_7);
		
		textPension = new JTextField();
		textPension.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textPension.setColumns(10);
		textPension.setBounds(295, 713, 256, 33);
		frmEmployeePayrollManagement.getContentPane().add(textPension);
		
		JLabel lblNewLabel_1_8 = new JLabel("Net pay :");
		lblNewLabel_1_8.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_8.setBounds(20, 784, 234, 33);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_8);
		
		textNet = new JTextField();
		textNet.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textNet.setColumns(10);
		textNet.setBounds(295, 784, 256, 33);
		frmEmployeePayrollManagement.getContentPane().add(textNet);
		
		JLabel lblNewLabel_1_9 = new JLabel("Employee Address :");
		lblNewLabel_1_9.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_9.setBounds(20, 240, 234, 33);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_9);
		
		textAddress = new JTextField();
		textAddress.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textAddress.setColumns(10);
		textAddress.setBounds(295, 240, 256, 33);
		frmEmployeePayrollManagement.getContentPane().add(textAddress);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(590, 210, 533, 271);
		frmEmployeePayrollManagement.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Tax Period :");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 14, 150, 27);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox.setBounds(226, 10, 292, 37);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "E", "F", "G"}));
		comboBox_1.setBounds(226, 71, 292, 44);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tax Code :");
		lblNewLabel_2_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(10, 76, 150, 27);
		panel.add(lblNewLabel_2_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"A0000", "A3000", "B4000", "C5000", "D6000", "E7000", "F8000", "G9000"}));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(226, 144, 292, 44);
		panel.add(comboBox_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("NI code :\r\n");
		lblNewLabel_2_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(10, 149, 150, 27);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("NI Number :");
		lblNewLabel_2_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2_3.setBounds(10, 228, 150, 27);
		panel.add(lblNewLabel_2_3);
		
		textNI = new JTextField();
		textNI.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textNI.setColumns(10);
		textNI.setBounds(226, 219, 292, 37);
		panel.add(textNI);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("Tax :");
		lblNewLabel_1_6_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_6_1.setBounds(595, 527, 234, 33);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_6_1);
		
		textTax = new JTextField();
		textTax.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textTax.setColumns(10);
		textTax.setBounds(870, 527, 256, 33);
		frmEmployeePayrollManagement.getContentPane().add(textTax);
		
		JLabel lblNewLabel_1_6_2 = new JLabel("Student Laon :");
		lblNewLabel_1_6_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_6_2.setBounds(595, 617, 234, 33);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_6_2);
		
		textLoan = new JTextField();
		textLoan.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textLoan.setColumns(10);
		textLoan.setBounds(870, 617, 256, 33);
		frmEmployeePayrollManagement.getContentPane().add(textLoan);
		
		JLabel lblNewLabel_1_6_3 = new JLabel("Pension :");
		lblNewLabel_1_6_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_6_3.setBounds(593, 574, 234, 33);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_6_3);
		
		textPension1 = new JTextField();
		textPension1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textPension1.setColumns(10);
		textPension1.setBounds(868, 574, 256, 33);
		frmEmployeePayrollManagement.getContentPane().add(textPension1);
		
		JLabel lblNewLabel_1_6_4 = new JLabel("NI Payment :");
		lblNewLabel_1_6_4.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_6_4.setBounds(595, 670, 234, 33);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_6_4);
		
		textNI1 = new JTextField();
		textNI1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textNI1.setColumns(10);
		textNI1.setBounds(870, 670, 256, 33);
		frmEmployeePayrollManagement.getContentPane().add(textNI1);
		
		JLabel lblNewLabel_1_6_5 = new JLabel("Taxable Pay:");
		lblNewLabel_1_6_5.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_6_5.setBounds(595, 725, 234, 33);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_6_5);
		
		textTax1 = new JTextField();
		textTax1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textTax1.setColumns(10);
		textTax1.setBounds(870, 725, 256, 33);
		frmEmployeePayrollManagement.getContentPane().add(textTax1);
		
		JLabel lblNewLabel_1_6_6 = new JLabel("Deduction :");
		lblNewLabel_1_6_6.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_6_6.setBounds(595, 784, 234, 33);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_6_6);
		
		textDeduction = new JTextField();
		textDeduction.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textDeduction.setColumns(10);
		textDeduction.setBounds(870, 784, 256, 33);
		frmEmployeePayrollManagement.getContentPane().add(textDeduction);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1146, 87, 366, 473);
		frmEmployeePayrollManagement.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Pay Slip :");
		lblNewLabel_1_5_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_5_1.setBounds(79, 10, 234, 33);
		panel_1.add(lblNewLabel_1_5_1);
		
		JTextArea rtfpayslip = new JTextArea();
		rtfpayslip.setBounds(10, 64, 346, 399);
		panel_1.add(rtfpayslip);
		
		JButton btnNewButton = new JButton("Pay Slip");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			rtfpayslip.append("\tPramod Yadav\n");
			rtfpayslip.append("Emp name:    "+textName1.getText());
			
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnNewButton.setBounds(1168, 584, 146, 41);
		frmEmployeePayrollManagement.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("NET Wages");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                 double A00,A30,B40,C50,D60,E70,F80,G90,PensionablePay,TexablePay;
                 double deduction,Pension,StudentLoad,NIPayment,TotalDeduction,NetPay;
                 
                 
                 InnerCity=Double.parseDouble(textCity.getText());
                 BasicWage=Double.parseDouble(textSallary.getText());
                 OverTime=Double.parseDouble(textTime.getText());
                 Gross=InnerCity+ BasicWage+OverTime;
                 String GrossPay=String.format("$%.2f",Gross);
                 textGross.setText(GrossPay);
                 
//                 ========================================================================================
                 try {
                	 if(comboBox_1.getSelectedItem().equals("A0000")) {
                		 A00=(Gross*9)/100;
                		 deduction=Gross-A00;
                		 Pension=(deduction*12)/100;
                		 
                		 StudentLoad=Pension+A00;
                		 StudentLoad=Gross-StudentLoad;
                		 StudentLoad=(StudentLoad*5.7)/100;
                		 
                		 NIPayment=StudentLoad+Pension+A00;
                		 NIPayment=Gross-NIPayment;
                		 NIPayment=(NIPayment*4.2)/100;
                		 
                		 String Taxpaid=String.format("%.2f",A00);
                		 textTax.setText(Taxpaid);
                		 textTax.setText("$"+Taxpaid);
                		 
                		 String PensionPaid=String.format("%.2f",Pension);
                		 textPension1.setText(PensionPaid);
                		 textPension1.setText("$"+PensionPaid);
                		 
                		 String StudentLoanPaid=String.format("%.2f",StudentLoad);
                		 textLoan.setText(StudentLoanPaid);
                		 textLoan.setText("$"+StudentLoanPaid);
                		 
                		 String NIpaymentPaid=String.format("%.2f",NIPayment);
                		 textNI1.setText(NIpaymentPaid);
                		 textNI1.setText("$"+NIpaymentPaid);
                		 
                		 TotalDeduction=A00+Pension+StudentLoad+NIPayment;
                		 NetPay=Gross-TotalDeduction;
                		 
                		 String TDeduction=String.format("%.2f",TotalDeduction);
                		 textDeduction.setText(TDeduction);
                		 textDeduction.setText("$"+TDeduction);
                		 
                		 String TNetPay=String.format("%.2f",NetPay);
                		 textNet.setText(TNetPay);
                		 textNet.setText("$"+TNetPay);
                		 
                		 String TaxPeriod=comboBox.getSelectedItem().toString();
                		 TexablePay=Double.parseDouble(TaxPeriod);
                		 PensionablePay= TexablePay*A00;
                		 
                		 
                		 String PensionPayment=String.format("%.2f",PensionablePay);
                		 textPension1.setText(PensionPayment);
                		 textPension1.setText("$"+PensionPayment);
                		 
                		 String TaxablePayPayment=String.format("%.2f",TexablePay);
                		 textTax1.setText(TaxablePayPayment);
                		 textTax1.setText("$"+TaxablePayPayment);
              
                	 }
                	 
                   
                 textGross.setText(GrossPay);
                 }catch (NumberFormatException e1) {        	 
                	 JOptionPane.showMessageDialog(null,"Enter a valid Number","Payroll System",
                			 JOptionPane.INFORMATION_MESSAGE);
      
                 }
//                 ========================================================================================
                 
                 String sInnerCity=String.format("$%.2f", InnerCity);
                 textCity.setText(sInnerCity);
                 
                 String sBasicWage=String.format("$%.2f",BasicWage);
                 textSallary.setText(sBasicWage);
				
                 String sOverTime=String.format("$%.2f",OverTime);
                 textTime.setText(sOverTime);
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnNewButton_1.setBounds(1345, 584, 146, 41);
		frmEmployeePayrollManagement.getContentPane().add(btnNewButton_1);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnReset.setBounds(1168, 680, 146, 41);
		frmEmployeePayrollManagement.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnExit.setBounds(1345, 680, 146, 41);
		frmEmployeePayrollManagement.getContentPane().add(btnExit);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeePayrollManagement = new JFrame();
		frmEmployeePayrollManagement.getContentPane().setForeground(Color.BLACK);
		frmEmployeePayrollManagement.setTitle("Employee Payroll Management System");
		frmEmployeePayrollManagement.setBounds(100, 100, 450, 300);
		frmEmployeePayrollManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
