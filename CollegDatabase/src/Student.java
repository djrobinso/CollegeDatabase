/**
 * 
 */

/**
 * @author Deyonta
 *
 */
 
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
	 * @return **/
	
	public String getfirstName() {
		return "";
	}
	
	public String getlastName() {
		return "";
	}
	
	public String getMiddleInitial() {
		return "";
	}
	
	public void getAddress() {
		return;
	}
	
	public void getMajor() {
		return;
	}
	
	public void getMinor() {
		return ;
	}
	public void getStudentID() {
		return;
	}
	
	public void getEmail() {
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
