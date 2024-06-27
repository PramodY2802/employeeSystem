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
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;

public class UpdateEmployee1 {

	private JFrame frmEmployeePayrollMangement;
	private JTextField getdata;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textMobile;
	private JTextField textdoj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateEmployee1 window = new UpdateEmployee1();
					window.frmEmployeePayrollMangement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UpdateEmployee1() {
		initialize();
		Toolkit t1=Toolkit.getDefaultToolkit();
        Dimension screensize=t1.getScreenSize();
        int screenwith = screensize.width;
		int screenheight = screensize.height;
		
		frmEmployeePayrollMangement.setSize(screenwith, screenheight);;
		frmEmployeePayrollMangement.setLocationRelativeTo(null);
		frmEmployeePayrollMangement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Details");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 45));
		lblNewLabel.setBounds(458, 10, 498, 59);
		frmEmployeePayrollMangement.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.PLAIN, 23));
		textArea.setBounds(285, 222, 388, 59);
		frmEmployeePayrollMangement.getContentPane().add(textArea);
		
		getdata = new JTextField();
		getdata.setColumns(10);
		getdata.setBounds(1043, 25, 71, 29);
		frmEmployeePayrollMangement.getContentPane().add(getdata);
		
		JButton btnNewButton = new JButton("GetData");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=getdata.getText();
				JDBC1 j=new JDBC1();
				ResultSet result=null;
				result=j.getrow1(number);
				try {
					while(result.next()) {
						textField.setText(result.getString(1));
						textArea.setText(result.getString(3));
						textdoj.setText(result.getString(6));
						textField_4.setText(result.getString(5));
						textMobile.setText(result.getString(4));
						textField_6.setText(result.getString(7));
						textField_7.setText(result.getString(8));
						textField_2.setText(result.getString(2));
						  	
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.setBounds(1157, 23, 112, 37);
		frmEmployeePayrollMangement.getContentPane().add(btnNewButton);
		
		JRadioButton rdbtnmale = new JRadioButton("Male");
		rdbtnmale.setFont(new Font("Tahoma", Font.PLAIN, 23));
		rdbtnmale.setBounds(285, 578, 112, 29);
		frmEmployeePayrollMangement.getContentPane().add(rdbtnmale);
		
		JRadioButton rdbtnFemale = new JRadioButton("female");
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 23));
		rdbtnFemale.setBounds(450, 578, 112, 29);
		frmEmployeePayrollMangement.getContentPane().add(rdbtnFemale);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"computer", "Civil", "Mechanical", "Artificial Intelligence"}));
		comboBox.setForeground(Color.RED);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 25));
		comboBox.setBounds(1101, 495, 313, 37);
		frmEmployeePayrollMangement.getContentPane().add(comboBox);
		
		JCheckBox chckbxA = new JCheckBox("A");
		chckbxA.setForeground(Color.RED);
		chckbxA.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		chckbxA.setBounds(1101, 602, 57, 29);
		frmEmployeePayrollMangement.getContentPane().add(chckbxA);
		
		JCheckBox chckbxB = new JCheckBox("B");
		chckbxB.setForeground(Color.RED);
		chckbxB.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		chckbxB.setBounds(1184, 602, 57, 29);
		frmEmployeePayrollMangement.getContentPane().add(chckbxB);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(10, 79, 1546, 1);
		frmEmployeePayrollMangement.getContentPane().add(spinner);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 23));
		textField.setColumns(10);
		textField.setBounds(285, 127, 392, 29);
		frmEmployeePayrollMangement.getContentPane().add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name :");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1.setBounds(32, 120, 228, 42);
		frmEmployeePayrollMangement.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Address  :");
		lblNewLabel_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_3.setBounds(32, 215, 228, 42);
		frmEmployeePayrollMangement.getContentPane().add(lblNewLabel_1_1_3);
		
		
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 23));
		textField_2.setColumns(10);
		textField_2.setBounds(281, 449, 392, 29);
		frmEmployeePayrollMangement.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Employee ID :");
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_1.setBounds(20, 441, 228, 42);
		frmEmployeePayrollMangement.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Date of Birth :");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(848, 120, 228, 42);
		frmEmployeePayrollMangement.getContentPane().add(lblNewLabel_1_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 23));
		textField_4.setColumns(10);
		textField_4.setBounds(1101, 127, 392, 29);
		frmEmployeePayrollMangement.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("PIn Code :");
		lblNewLabel_1_1_4.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_4.setBounds(848, 290, 228, 42);
		frmEmployeePayrollMangement.getContentPane().add(lblNewLabel_1_1_4);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.PLAIN, 23));
		textField_6.setColumns(10);
		textField_6.setBounds(1101, 292, 392, 29);
		frmEmployeePayrollMangement.getContentPane().add(textField_6);
		
		JLabel lblNewLabel_1_1_6 = new JLabel("Pan Card No. :");
		lblNewLabel_1_1_6.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_6.setBounds(848, 388, 228, 42);
		frmEmployeePayrollMangement.getContentPane().add(lblNewLabel_1_1_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.PLAIN, 23));
		textField_7.setColumns(10);
		textField_7.setBounds(1101, 396, 392, 29);
		frmEmployeePayrollMangement.getContentPane().add(textField_7);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 671, 1502, 1);
		frmEmployeePayrollMangement.getContentPane().add(separator);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.getText();
				String name=textField.getText();
				String address=textArea.getText();
				String id=textField_2.getText();
				String dob=textField_4.getText();
				long pincode=Long.parseLong(textField_6.getText());
				String pan=textField_7.getText();
				long mobile=Long.parseLong(textMobile.getText());
				String doj=textdoj.getText();
				System.out.println(name+id+dob+pincode+pan+address+mobile+doj);
				String department=null;
				department=(String) comboBox.getSelectedItem();
				System.out.println(department);
   
              String gender=null;
                  if(rdbtnmale.isSelected()) {
                	  gender="male";
                  }else if(rdbtnFemale.isSelected()){
              	  gender="Female";
                  }
                  System.out.println(gender);
			
			
			String greadA=null;
			String greadB=null;
			
			boolean isSelected=chckbxA.isSelected();
			if(isSelected) {
				greadA=chckbxA.getLabel();
			}
			isSelected=chckbxB.isSelected();
			if(isSelected) {
				greadB=chckbxB.getLabel();
			}
				
				
	     JDBC1 j=new JDBC1();
	     String number=getdata.getText();
	     
	     
	     int status =0;
	     status=j.insertupdate(name, id, address, mobile, dob,doj, pincode, pan, department, gender,greadA, greadB);
	     
	     
	     if(status==1) {
			 JOptionPane.showMessageDialog(null, "updated");
		}else {
			JOptionPane.showMessageDialog(null,"Problem in data updated");
		}
	       
	     
	}
		});
		btnUpdate.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnUpdate.setBounds(684, 696, 137, 43);
		frmEmployeePayrollMangement.getContentPane().add(btnUpdate);
		
		textMobile = new JTextField();
		textMobile.setFont(new Font("Arial", Font.PLAIN, 23));
		textMobile.setColumns(10);
		textMobile.setBounds(281, 342, 392, 29);
		frmEmployeePayrollMangement.getContentPane().add(textMobile);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("Mobile No. :");
		lblNewLabel_1_1_5.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_5.setBounds(32, 334, 228, 42);
		frmEmployeePayrollMangement.getContentPane().add(lblNewLabel_1_1_5);
		
		JLabel lblNewLabel_1_1_7_1 = new JLabel(" Gender :");
		lblNewLabel_1_1_7_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_7_1.setBounds(32, 578, 228, 42);
		frmEmployeePayrollMangement.getContentPane().add(lblNewLabel_1_1_7_1);
		
		
		
		textdoj = new JTextField();
		textdoj.setFont(new Font("Arial", Font.PLAIN, 23));
		textdoj.setColumns(10);
		textdoj.setBounds(1101, 205, 392, 29);
		frmEmployeePayrollMangement.getContentPane().add(textdoj);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Date of joining :");
		lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_2.setBounds(848, 198, 228, 42);
		frmEmployeePayrollMangement.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_6_1 = new JLabel("Departments :");
		lblNewLabel_1_1_6_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_6_1.setBounds(848, 490, 228, 42);
		frmEmployeePayrollMangement.getContentPane().add(lblNewLabel_1_1_6_1);
		
//		JComboBox comboBox = new JComboBox();
//		comboBox.setModel(new DefaultComboBoxModel(new String[] {"computer", "Civil", "Mechanical", "Artificial Intelligence"}));
//		comboBox.setForeground(Color.RED);
//		comboBox.setFont(new Font("Tahoma", Font.BOLD, 25));
//		comboBox.setBounds(1101, 533, 313, 37);
//		frmEmployeePayrollMangement.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1_1_6_2 = new JLabel("Grade :");
		lblNewLabel_1_1_6_2.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_6_2.setBounds(848, 586, 228, 42);
		frmEmployeePayrollMangement.getContentPane().add(lblNewLabel_1_1_6_2);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEmployeePayrollMangement=new JFrame("EXIT");
					
					if(JOptionPane.showConfirmDialog(frmEmployeePayrollMangement, "Confirm Do You want to exit","Payroll System",
							JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
						
						System.exit(0);
					}
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnExit.setBounds(1235, 696, 137, 43);
		frmEmployeePayrollMangement.getContentPane().add(btnExit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEmployeePayrollMangement.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnBack.setBounds(111, 696, 137, 43);
		frmEmployeePayrollMangement.getContentPane().add(btnBack);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeePayrollMangement = new JFrame();
		frmEmployeePayrollMangement.getContentPane().setBackground(Color.GRAY);
		frmEmployeePayrollMangement.getContentPane().setForeground(Color.GRAY);
		frmEmployeePayrollMangement.setTitle("Employee Details");
		frmEmployeePayrollMangement.setBounds(100, 100, 450, 300);
		frmEmployeePayrollMangement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
