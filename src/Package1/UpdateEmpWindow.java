package Package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;



import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class UpdateEmpWindow {

	private JFrame frmEmployeePayrollManagement;
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField getdata;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateEmpWindow window = new UpdateEmpWindow();
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
	public UpdateEmpWindow() {
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
		lblNewLabel.setBounds(448, 10, 498, 59);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name :");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1.setBounds(22, 120, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 23));
		textField.setColumns(10);
		textField.setBounds(275, 127, 392, 29);
		frmEmployeePayrollManagement.getContentPane().add(textField);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Address :");
		lblNewLabel_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_3.setBounds(22, 277, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.PLAIN, 23));
		textArea.setBounds(279, 284, 388, 59);
		frmEmployeePayrollManagement.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1_1 = new JLabel("Date of Birth :");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(838, 120, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 23));
		textField_4.setColumns(10);
		textField_4.setBounds(1091, 127, 392, 29);
		frmEmployeePayrollManagement.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("PIn Code :");
		lblNewLabel_1_1_4.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_4.setBounds(838, 284, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1_4);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.PLAIN, 23));
		textField_6.setColumns(10);
		textField_6.setBounds(1091, 286, 392, 29);
		frmEmployeePayrollManagement.getContentPane().add(textField_6);
		
		JLabel lblNewLabel_1_1_6 = new JLabel("Pan Card No. :");
		lblNewLabel_1_1_6.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_6.setBounds(848, 405, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.PLAIN, 23));
		textField_7.setColumns(10);
		textField_7.setBounds(1101, 412, 392, 29);
		frmEmployeePayrollManagement.getContentPane().add(textField_7);
		
		
		JCheckBox chckbxA = new JCheckBox("A");
		chckbxA.setForeground(Color.RED);
		chckbxA.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		chckbxA.setBounds(1103, 644, 57, 29);
		frmEmployeePayrollManagement.getContentPane().add(chckbxA);
		
		JCheckBox chckbxB = new JCheckBox("B");
		chckbxB.setForeground(Color.RED);
		chckbxB.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		chckbxB.setBounds(1183, 642, 57, 29);
		frmEmployeePayrollManagement.getContentPane().add(chckbxB);
		
		JRadioButton rdbtnmale = new JRadioButton("Male");
		rdbtnmale.setFont(new Font("Tahoma", Font.PLAIN, 23));
		rdbtnmale.setBounds(280, 659, 112, 29);
		frmEmployeePayrollManagement.getContentPane().add(rdbtnmale);
		
		JRadioButton rdbtnFemale = new JRadioButton("female");
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 23));
		rdbtnFemale.setBounds(445, 659, 112, 29);
		frmEmployeePayrollManagement.getContentPane().add(rdbtnFemale);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Computer", "Mechanical", "Civil", "Artificial Intelligence"}));
		comboBox.setForeground(Color.RED);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 25));
		comboBox.setBounds(1101, 530, 313, 37);
		frmEmployeePayrollManagement.getContentPane().add(comboBox);
		
		
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(0, 79, 1546, 1);
		frmEmployeePayrollManagement.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(0, 711, 1512, 1);
		frmEmployeePayrollManagement.getContentPane().add(spinner_1);
		
		getdata = new JTextField();
		getdata.setBounds(1033, 25, 71, 29);
		frmEmployeePayrollManagement.getContentPane().add(getdata);
		getdata.setColumns(10);
		
		JButton btnNewButton = new JButton("GetData");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=getdata.getText();
				JDBC1 j=new JDBC1();
				ResultSet result=null;
				result=j.getrow(number);
				try {
					while(result.next()) {
						textField.setText(result.getString(1));
						textArea.setText(result.getString(3));
//						textField_5.setText(result.getString(6));
						textField_4.setText(result.getString(5));
//						textField_2.setText(result.getString(4));
						textField_6.setText(result.getString(7));
						textField_7.setText(result.getString(8));
						textField_1.setText(result.getString(2));	
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setBounds(1147, 23, 112, 29);
		frmEmployeePayrollManagement.getContentPane().add(btnNewButton);
		
		
		JLabel lblNewLabel_1_1_7_1 = new JLabel(" Gender :");
		lblNewLabel_1_1_7_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_7_1.setBounds(22, 652, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1_7_1);
		
		
		JLabel lblNewLabel_1_1_6_1 = new JLabel("Departments :");
		lblNewLabel_1_1_6_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_6_1.setBounds(848, 525, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1_6_1);
		
		
		
		JLabel lblNewLabel_1_1_6_2 = new JLabel("Grade :");
		lblNewLabel_1_1_6_2.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_6_2.setBounds(850, 628, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1_6_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 23));
		textField_1.setColumns(10);
		textField_1.setBounds(275, 477, 392, 29);
		frmEmployeePayrollManagement.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Employee ID :");
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_1_1.setBounds(22, 470, 228, 42);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnDelet = new JButton("DELET");
		btnDelet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JDBC1 j=new JDBC1();
				String id=textField_1.getText();
				int status=j.deletUpdate(id);
				if(status==1) {
					 JOptionPane.showMessageDialog(null, "deleted");
				}else {
					JOptionPane.showMessageDialog(null,"Problem in data delet");
				}
			}
			
		});
		btnDelet.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnDelet.setBounds(703, 722, 137, 43);
		frmEmployeePayrollManagement.getContentPane().add(btnDelet);
		
		JButton btnDelet_1 = new JButton("BACK");
		btnDelet_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEmployeePayrollManagement.setVisible(false);
			}
		});
		btnDelet_1.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnDelet_1.setBounds(88, 722, 137, 43);
		frmEmployeePayrollManagement.getContentPane().add(btnDelet_1);
		
		JButton btnDelet_2 = new JButton("EXIT");
		btnDelet_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frmEmployeePayrollManagement =new JFrame("EXIT");
					
					if(JOptionPane.showConfirmDialog(frmEmployeePayrollManagement, "Confirm Do You want to exit","Payroll System",
							JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
						
						System.exit(0);
					}
			}
		});
		btnDelet_2.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnDelet_2.setBounds(1346, 722, 137, 43);
		frmEmployeePayrollManagement.getContentPane().add(btnDelet_2);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeePayrollManagement = new JFrame();
		frmEmployeePayrollManagement.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmEmployeePayrollManagement.setTitle("Employee Details");
		frmEmployeePayrollManagement.setBounds(100, 100, 450, 300);
		frmEmployeePayrollManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
