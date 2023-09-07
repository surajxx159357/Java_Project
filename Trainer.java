package institute_management;
import java.util.*;

public class Trainer extends Institute{
Scanner sc=new Scanner(System.in);
	int id;
	String name;
	long contact;
	String email;
	private double sal;
	double exp;
	String sub;
	
	public Trainer(int id, String name, long contact, String email, double sal, double exp, String sub) {

		this.id = id;
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.sal = sal;
		this.exp = exp;
		this.sub = sub;
	}

	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
		
}
