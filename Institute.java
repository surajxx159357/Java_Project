package institute_management;

public class Institute {

	String name="J Spider";

	String course="Java Fullstack Developer";
	
	private double balance=20;
	
	private int totalNumberOfStudents;
	private int totalNumberOfTeachers;
	
	private static String admin="Qspider-vasai";
	
	public static String getAdmin() {
		return admin;
	}

	public static void setAdmin(String admin) {
		Institute.admin = admin;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		Institute.password = password;
	}

	private static String password="QspiderNewBranch";
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}

	public int getTotalNumberOfStudents() {
		return totalNumberOfStudents;
	}

	public void setTotalNumberOfStudents(int totalNumberOfStudents) {
		this.totalNumberOfStudents = totalNumberOfStudents;
	}

	public int getTotalNumberOfTeachers() {
		return totalNumberOfTeachers;
	}

	public void setTotalNumberOfTeachers(int totalNumberOfTeachers) {
		this.totalNumberOfTeachers = totalNumberOfTeachers;
	}
	
}
