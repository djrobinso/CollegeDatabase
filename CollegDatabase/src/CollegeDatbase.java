/**
 * 
 */
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileNotFoundException;
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
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, 
				ClassNotFoundException, FileNotFoundException {
		// TODO Auto-generated method stub
		
		//connect to mysql database\
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root","Mydata123");  
			JOptionPane.showMessageDialog(null, "Connected to Database...");
			//Statement statement = con.createStatement();
			Statement statement = con.createStatement();

			
			JOptionPane.showMessageDialog(null, "Looking for txt file to enter info into database");
			//read file with the Student Information which should be the
			//first name, last name, middle initial, address,  major , minor, 
			//StudentID and email are generated by methods
			
			File inputFile = new File("src/info.txt");
			Scanner reader = new Scanner(inputFile);
			JOptionPane.showMessageDialog(null, "got file about to print");

			while(reader.hasNext()) {
				
				String first = reader.next();
				String last = reader.next(); 
				String middle  = reader.next();
				String address = reader.next();
				String major = reader.next();
				String minor = reader.next();
				String id = generateStudentID();
				String email = genereateEmail(first, middle, last);
				JOptionPane.showMessageDialog(null, first + last + middle +"/n" + address + major + minor + id + email);
				String sql = "INSERT INTO studentinfo (firstName, lastName, address, major, minor, studentID, middleInitial, studentEmail) " + 
							 "VALUES (" +  "'"+first+"'" + ", " + "'"+last+"'" + ", " + "'"+address+"'" + ", " +  "'"+major+"'" + ", " 
									+ "'"+minor+"'" + ", " + "'"+id+"'" + ", " + "'"+middle+"'" + ", "+ "'"+email+"'"+ ")" + ";";
				JOptionPane.showMessageDialog(null,sql);

				statement.executeUpdate(sql);
			}
			con.close();
			statement.close();
			JOptionPane.showMessageDialog(null, "finished");

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
			email = first.substring(0) + middle.substring(0) + last.substring(0, last.length());
		}else {
			email = first.substring(0) + middle.substring(0) + last.substring(0, 6);
		}
		return email;
		
	}

}
