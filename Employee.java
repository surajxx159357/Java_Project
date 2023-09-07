package institute_management;

public class Employee {

	int id;
	String name;
	long contact;
	String email;
	private double sal;
	int exp;
	String designation;
	
	
	public Employee(int id, String name, long contact, String email, double sal, int exp, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.sal = sal;
		this.exp = exp;
		this.designation = designation;
	}

	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}

}
