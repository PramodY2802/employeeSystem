package Package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ShowData {

	private JFrame frmEmployeePayrollManagement;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowData window = new ShowData();
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
	public ShowData() {
		initialize();
		Toolkit t1=Toolkit.getDefaultToolkit();
        Dimension screensize=t1.getScreenSize();
        int screenwith = screensize.width;
		int screenheight = screensize.height;
		
		frmEmployeePayrollManagement.setSize(screenwith, screenheight);;
		frmEmployeePayrollManagement.setLocationRelativeTo(null);
		frmEmployeePayrollManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Data");
		lblNewLabel.setBounds(511, 21, 429, 54);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 48));
		lblNewLabel.setForeground(Color.BLUE);
		frmEmployeePayrollManagement.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 100, 1502, 2);
		frmEmployeePayrollManagement.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 726, 1512, 2);
		frmEmployeePayrollManagement.getContentPane().add(separator_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 125, 1485, 573);
		frmEmployeePayrollManagement.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "ID", "Address", "Mobile", "D O B", "D O J", "Pin Code", "PanCard", "Department", "Gender", "GradeA", "GreadB"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("SHOW");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDBC1 j=new JDBC1();
				ResultSet result=j.getTable();
				
				DefaultTableModel model=new DefaultTableModel();
				String [] columnNames= {"Name", "ID", "Address", "Mobile", "D O B", "D O J", "Pin Code", "PanCard", "Department", "Gender", "GradeA", "GreadB"};
				model.setColumnIdentifiers(columnNames);
				
				try {
					while(result.next()) {
						model.addRow(new Object[] {
							result.getString(1),
							result.getString(2),
							result.getString(3),
							result.getInt(4),
							result.getString(5),
							result.getString(6),
							result.getInt(7),
							result.getString(8),
							result.getString(9),
							result.getString(10),
							result.getString(11),
							result.getString(12),
							
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
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(642, 740, 138, 37);
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
		btnExit.setBounds(1332, 738, 124, 37);
		frmEmployeePayrollManagement.getContentPane().add(btnExit);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEmployeePayrollManagement.setVisible(false);
			}
		});
		btnClose.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnClose.setBounds(39, 738, 138, 37);
		frmEmployeePayrollManagement.getContentPane().add(btnClose);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmployeePayrollManagement = new JFrame();
		frmEmployeePayrollManagement.setTitle("Employee Data");
		frmEmployeePayrollManagement.setBounds(100, 100, 450, 300);
		frmEmployeePayrollManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
