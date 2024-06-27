package Package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC1 {
	Connection con=null;
	PreparedStatement p=null;
	Statement stmt=null;
	ResultSet result=null;
                       
	 JDBC1() {
	          
		 try {
	 			Class.forName("com.mysql.jdbc.Driver");
	 			System.out.println("load succesfull");
	 		} catch (ClassNotFoundException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 			System.out.println("load unsuccesfull");
	 		}
	 		
	 		
	 		try {
	 			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata1", "root" ,"root");
	 			System.out.println("wow: connection get succefull");
	 		} catch (SQLException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 			System.out.println("connection failed");
	 		}
			 
		}
	 
	     int insertdata(String name,String id,String address,long mobile,String dob,String doj,long pincode,String pan,String department,String gender,String gread1,String gread2) {
	    	 int status =0;
	    	 try {
				p=con.prepareStatement("insert into employeetable values(?,?,?,?,?,?,?,?,?,?,?,?)");
				p.setString(1,name);
				p.setString(2,id);
				p.setString(3,address);
				p.setLong(4,mobile);
				p.setString(5,dob);
				p.setString(6,doj);
				p.setLong(7,pincode);
				p.setString(8,pan);
				p.setString(9,department);
				p.setString(10,gender);
				p.setString(11,gread1);
				p.setString(12, gread2);
				status=p.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	 return status;
	     }
	 
	             
	     ResultSet getTable() {
	    	  try {
				stmt=con.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  try {
				result=stmt.executeQuery("select * from employeetable");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  
	    	  return result;
	      } 
	    
	     
	     ResultSet getrow(String id) {
	    	  try {
				stmt=con.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  
	    	  String query="select * from employeetable where ID = "+id;
	    	  try {
				result=stmt.executeQuery(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      
	    	return result;  
	   }
	     
	     
	     
	     int insertupdate(String name,String id,String address,long mobile,String dob,String doj,long pincode,String pan,String department,String gender,String greadA,String greadB) {
	    	 int status=0;
	    		try {
					p=con.prepareStatement("update employeetable set name=?,id=?,address=?,mobile=?,dob=?,doj=?,pincode=?,pan=?,department=?,gender=?,greadA=?,greadB=? where id= "+id);
					p.setString(1,name);
					p.setString(2,id);
					p.setString(3,address);
					p.setLong(4,mobile);
					p.setString(5,dob);
					p.setString(6,doj);
					p.setLong(7,pincode);
					p.setString(8,pan);
					p.setString(9,department);
					p.setString(10,gender);
					p.setString(11,greadA);
					p.setString(12, greadB);
					
					
					status=p.executeUpdate();
	    		
	    		} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	 
	    	 return status;
	     }
//	     int insertupdate(String name,String id,String address,long mobile,String dob,String doj,long pincode,String pan,String department,String gender,String gread1,String gread2) {
//	    	 int status=0;
//	    	 try {
//				p=con.prepareStatement("update employeetable set name=?,id=?,address=?,mobile=?,dob=?doj=?,pincode=?,pan=?,department=?,gender=?,gread1=?,gread2=? where id= "+id);
//				p.setString(1,name);
//				p.setString(2,id);
//				p.setString(3,address);
//				p.setLong(4,mobile);
//				p.setString(5,dob);
//				p.setString(6,doj);
//				p.setLong(7,pincode);
//				p.setString(8,pan);
//				p.setString(9,department);
//				p.setString(10,gender);
//				p.setString(11,gread1);
//				p.setString(12, gread2);
//				status=p.executeUpdate();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	    	 
//	    	 
//	    	 
//	    	 return status;
//	     }
	      
	 
	  int deletUpdate(String id) {
		  int status=0;
		  
		  try {
			p=con.prepareStatement("delete from employeetable where id="+id);
			status=p.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  return status;
	  }
	  
	 
	  int insertdata1(String ID,String Name,double GrossPay,double InnerCity,double BasicWage,double OverTime) {
		  int status=0;
		  try {
			p=con.prepareStatement("insert into salarytable1 values(?,?,?,?,?,?)");
			p.setString(1, ID);
			p.setString(2, Name);
			p.setDouble(3, GrossPay);
			p.setDouble(4,InnerCity);
			p.setDouble(5, BasicWage);
			p.setDouble(6, OverTime);
			status=p.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		  return status;
		  
	  }
	  
	  ResultSet getTable1() {
    	  try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  try {
			result=stmt.executeQuery("select * from salarytable1");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
    	  return result;
      } 
	  ResultSet getrow1(String id) {
    	  try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
    	  String query="select * from employeetable where ID = "+id;
    	  try {
			result=stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
    	  
    	return result;  
      }
	  
	  
	  
	 
	 
	}
