package Package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class EmployeeDetails {

	private JFrame frmEmployeePayrollManagement;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeDetails window = new EmployeeDetails();
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
	public EmployeeDetails() {
		initialize();
		Toolkit t1=Toolkit.getDefaultToolkit();
        Dimension screensize=t1.getScreenSize();
        int screenwith = screensize.width;
		int screenheight = screensize.height;
		
		frmEmployeePayrollManagement.setSize(screenwith, screenheight);;
		frmEmployeePayrollManagement.setLocationRelativeTo(null);
		frmEmployeePayrollManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Details");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 45));
		lblNewLabel.setBounds(452, 10, 498, 59);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 79, 1502, 2);
		frmEmployeePayrollManagement.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name :");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1.setBounds(26, 120, 295, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 23));
		textField.setBounds(279, 127, 392, 29);
		frmEmployeePayrollManagement.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 23));
		textField_1.setColumns(10);
		textField_1.setBounds(1095, 127, 392, 29);
		frmEmployeePayrollManagement.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Date of Birth :");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(842, 120, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 23));
		textField_2.setColumns(10);
		textField_2.setBounds(279, 222, 392, 29);
		frmEmployeePayrollManagement.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Employee ID :");
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_1.setBounds(26, 215, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 23));
		textField_3.setColumns(10);
		textField_3.setBounds(1095, 216, 392, 29);
		frmEmployeePayrollManagement.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Date of joining :");
		lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_2.setBounds(842, 209, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Address :");
		lblNewLabel_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_3.setBounds(26, 300, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1_3);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 23));
		textField_5.setColumns(10);
		textField_5.setBounds(1095, 301, 392, 29);
		frmEmployeePayrollManagement.getContentPane().add(textField_5);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("PIn Code :");
		lblNewLabel_1_1_4.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_4.setBounds(842, 294, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1_4);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.PLAIN, 23));
		textField_6.setColumns(10);
		textField_6.setBounds(279, 433, 392, 29);
		frmEmployeePayrollManagement.getContentPane().add(textField_6);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("Mobile No. :");
		lblNewLabel_1_1_5.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_5.setBounds(26, 426, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1_5);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.PLAIN, 23));
		textField_7.setColumns(10);
		textField_7.setBounds(1095, 418, 392, 29);
		frmEmployeePayrollManagement.getContentPane().add(textField_7);
		
		JLabel lblNewLabel_1_1_6 = new JLabel("Pan Card No. :");
		lblNewLabel_1_1_6.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_6.setBounds(842, 411, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1_6);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Arial", Font.PLAIN, 23));
		textField_8.setColumns(10);
		textField_8.setBounds(279, 556, 392, 29);
		frmEmployeePayrollManagement.getContentPane().add(textField_8);
		
		JLabel lblNewLabel_1_1_7 = new JLabel("Email ID :");
		lblNewLabel_1_1_7.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_7.setBounds(26, 556, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1_7);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setFont(new Font("Arial", Font.PLAIN, 23));
		textArea.setBounds(283, 314, 388, 59);
		frmEmployeePayrollManagement.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1_1_6_1 = new JLabel("Departments :");
		lblNewLabel_1_1_6_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_6_1.setBounds(842, 515, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1_6_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 25));
		comboBox.setForeground(Color.RED);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Computer", "Mechanicle", "Civil", "Artificial Intelligence"}));
		comboBox.setBounds(1095, 520, 313, 37);
		frmEmployeePayrollManagement.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1_1_6_2 = new JLabel("Grade :");
		lblNewLabel_1_1_6_2.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_6_2.setBounds(842, 603, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1_6_2);
		
		JCheckBox chckbxA = new JCheckBox("A");
		chckbxA.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		chckbxA.setForeground(Color.RED);
		chckbxA.setBounds(1095, 619, 57, 29);
		frmEmployeePayrollManagement.getContentPane().add(chckbxA);
		
		JCheckBox chckbxB = new JCheckBox("B");
		chckbxB.setForeground(Color.RED);
		chckbxB.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		chckbxB.setBounds(1178, 619, 57, 29);
		frmEmployeePayrollManagement.getContentPane().add(chckbxB);
		
		JCheckBox chckbxC = new JCheckBox("C");
		chckbxC.setForeground(Color.RED);
		chckbxC.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		chckbxC.setBounds(1258, 619, 57, 29);
		frmEmployeePayrollManagement.getContentPane().add(chckbxC);
		
		JCheckBox chckbxD = new JCheckBox("D");
		chckbxD.setForeground(Color.RED);
		chckbxD.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		chckbxD.setBounds(1340, 619, 57, 29);
		frmEmployeePayrollManagement.getContentPane().add(chckbxD);
		
		
		
		JRadioButton rdbtnmale = new JRadioButton("Male");
		buttonGroup.add(rdbtnmale);
		rdbtnmale.setFont(new Font("Tahoma", Font.PLAIN, 23));
		rdbtnmale.setBounds(279, 651, 112, 29);
		frmEmployeePayrollManagement.getContentPane().add(rdbtnmale);
		
		JRadioButton rdbtnFemale = new JRadioButton("female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 23));
		rdbtnFemale.setBounds(444, 651, 112, 29);
		frmEmployeePayrollManagement.getContentPane().add(rdbtnFemale);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 715, 1502, 2);
		frmEmployeePayrollManagement.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEmployeePayrollManagement.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(69, 740, 131, 37);
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
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(1321, 740, 131, 37);
		frmEmployeePayrollManagement.getContentPane().add(btnExit);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				System.out.println(name);
				String id=textField_2.getText();
				System.out.println(id);
				String address=textArea.getText();
				System.out.println(address);
				long mobile=Long.parseLong(textField_6.getText());
				System.out.println(mobile);
				String dob=textField_1.getText();
				System.out.println(dob);
				String doj=textField_3.getText();
				System.out.println(doj);
				long pincode=Long.parseLong(textField_5.getText());
				System.out.println(pincode);
				String pan=textField_7.getText();
				System.out.println(pan);
				String email=textField_8.getText();
				System.out.println(email);
				

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
			
			
			String grade1=null;
			String grade2=null;
//			String grade3=null;
//			String grade4=null;
////			
			boolean isSelected=chckbxA.isSelected();
			if(isSelected) {
				grade1=chckbxA.getLabel();
			}
			isSelected=chckbxB.isSelected();
			if(isSelected) {
				grade2=chckbxB.getLabel();
			}
		
//			isSelected=chckbxC.isSelected();
//			if(isSelected) {
//				grade3=chckbxC.getLabel();
//			}
//			isSelected=chckbxD.isSelected();
//			if(isSelected) {
//				grade4=chckbxD.getLabel();
//			}
//			
//			System.out.prinln();
		
			JDBC1 j=new JDBC1();
			int status=j.insertdata(name,id,address,mobile,dob,doj, pincode,pan,department,gender,grade1,grade2);
			
			if(status==1) {
				JOptionPane.showMessageDialog(null, "Data Added");
				
			}else {
				JOptionPane.showMessageDialog(null, "Problem in adding ");
			}
			
			}	
		});
		btnSave.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnSave.setBounds(425, 740, 131, 37);
		frmEmployeePayrollManagement.getContentPane().add(btnSave);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText(null);
			textField_1.setText(null);
			textArea.setText(null);
		    textField_2.setText(null);
			textField_3.setText(null);
		    textField_5.setText(null);
			textField_6.setText(null);
			textField_8.setText(null);
			textField_7.setText(null);
			chckbxA.setSelected(false);
			chckbxB.setSelected(false);
			chckbxC.setSelected(false);
			chckbxD.setSelected(false);
			
			
			}
		});
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnReset.setBounds(908, 740, 131, 37);
		frmEmployeePayrollManagement.getContentPane().add(btnReset);
		
		JLabel lblNewLabel_1_1_7_1 = new JLabel(" Gender :");
		lblNewLabel_1_1_7_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_7_1.setBounds(26, 651, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1_7_1);
		
		

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeePayrollManagement = new JFrame();
		frmEmployeePayrollManagement.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmEmployeePayrollManagement.setTitle("Employee Payroll Management System");
		frmEmployeePayrollManagement.setBounds(100, 100, 450, 300);
		frmEmployeePayrollManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
