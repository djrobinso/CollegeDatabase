/**
 * 
 */

/**
 * @author Deyonta
 *
 */

import java.sql.*;

import javax.swing.JOptionPane;  

 
public class Student {
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String address;
	private String major;
	private String minor;
	private String StudentIDnumber;
	private String email;
	
	/**
	 * @param afirstName
	 * @param alastName
	 * @param amiddleInitial 
	 * @param aaddress 
	 * @param amajor 
	 * @param aminor 
	 * @param aStudentIDNumber
	 * 
	 * ***/
	
	public Student(){
		firstName = "";
		middleInitial = "";
		lastName = "";
		address = "";
		major = "";
		minor = "";
		StudentIDnumber = "";
		email="";
	}
	
	public Student(String afirstName, String alastName, String amiddleInitial, String aaddress,
			String amajor, String aminor, String aStudentIDNumber, String aEmail){
		firstName = afirstName;
		middleInitial = amiddleInitial;
		lastName = alastName;
		address =  aaddress;
		major = amajor;
		minor = aminor;
		StudentIDnumber = aStudentIDNumber;
		email=aEmail;
	}

	/** Accessors
	 * @return 
	 * @throws SQLException **/
	
	public String getfirstName() throws SQLException {
	/**	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentData","root","");  
			//JOptionPane.showMessageDialog(null, "Connected to Database...");
			String command = "SELECT";
			
			Statement statement = con.createStatement(); //java statement
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error connecting to Database to retieve first name...");

		}  **/
		return "";
	}
	
	public String getlastName() throws SQLException {
		return "";
	}
	
	public String getMiddleInitial() throws SQLException {
		return "";
	}
	
	public void getAddress() throws SQLException {
		return;
	}
	
	public void getMajor() throws SQLException {
		return;
	}
	
	public void getMinor() throws SQLException {
		return ;
	}
	
	public void getStudentID() throws SQLException {
		return;
	}
	
	public void getEmail() throws SQLException {
		return;
	}


	/** Mutators ***/
	public void setfirstName(String a) {
		firstName = a;
	}
	
	public void setlastName(String a) {
		lastName = a;
	}
	
	public void setMiddleInitial(String a) {
		middleInitial = a;
	}
	
	public void setAddress(String a) {
		address = a;
	}
	
	public void setMajor(String a) {
		major = a;
	}
	
	public void setMinor(String a) {
		minor = a;
	}
	
	public void setStudentID(String a) {
		StudentIDnumber = a;
	}
	
	public void setEmail(String a) {
		email = a;
	}
	
}
