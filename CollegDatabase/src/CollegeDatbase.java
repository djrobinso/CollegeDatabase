/**
 * 
 */
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.sql.*;  

/**
 * @author Deyonta
 * 4/18/2019
 * Interactive GUI for registering college students
 *
 */

public class CollegeDatbase {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		//connect to mysql database
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentData","root","");  
			JOptionPane.showMessageDialog(null, "Connected to Database...");
			
			JOptionPane.showMessageDialog(null, "Looking for txt file to enter info into database");
			//read file with the Student Information which should be the
			//first name, last name, middle initial, address,  minor,   StudentID and email
			String file ="info.txt";
			Scanner reader = new Scanner(file);
			while(reader.hasNext()) {
				
				String first = reader.next();
				String last = reader.next(); 
				String middle  = reader.next();
				String address = reader.next();
				String minor = reader.next();
				String id = generateStudentID();
				String email = genereateEmail(first, middle, last);
				
				
		/**		Student student1 = new Student();
				student1.setfirstName(reader.next());
				student1.setlastName(reader.next());
				student1.setAddress(reader.next());
				student1.setMajor(reader.next());
				student1.setMinor(reader.next());
				//generate the studentID
				student1.setStudentID(generateStudentID());
				//generate the student email
				student1.setEmail( (genereateEmail(student1.getfirstName(), student1.getMiddleInitial(), student1.getlastName())) );
			**/
				
			}
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error connecting to Database...");

		}  
		
		

	}//end of main

	public static String generateStudentID () {
		String ID = "";
		int rand = 0;
		//loop through and randomly select  a number
		//6x and convert it into a string
		for(int index = 0; index < 7; index++) {
			rand = (int)( Math.random() * 10);
			ID += String.valueOf(rand);
		}
		return ID;
	}
	
	public static String genereateEmail(String first, String middle, String last) {
		String email="";
		if(last.length() < 6){
			email = first.substring(0,0) + middle.substring(0) + last.substring(0, last.length());
		}else {
			email = first.substring(0,0) + middle.substring(0) + last.substring(0, 6);
		}
		return email;
		
	}

}
