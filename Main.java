package institute_management;

import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	static {
		Institute I = new Institute();

		ArrayList course = new ArrayList();
		course.add("Java FullStack Developer");
		course.add("Python FullStack Developer");
		course.add("Manual Testing");

		System.out.println("=====================================================" + I.name
				+ "===================================================================");
		System.out.println();
		System.out.println("Courses Available --->" + course);
		System.out.println();

	}

	public static void main(String[] args) {

//		TRAINER DATA	

//		Trainer(int id, String name, long contact, String email, double sal, double exp, String sub) 

		List<Trainer> trainer = new ArrayList<>();

		Trainer t1 = new Trainer(101, "suraj kadam", 9137127927l, "surajk159357@gmail.com", 90000, 2, "Java");
		Trainer t2 = new Trainer(102, "uday shetty", 9137133337l, "ushetty159357@gmail.com", 100000, 10,
				"Manual Testing");
		Trainer t3 = new Trainer(103, "vinay krishna", 9333719247l, "vk159357@gmail.com", 100000, 5, "sql expert");
		Trainer t4 = new Trainer(104, "nagesh dj", 3133123923l, "dj159357@gmail.com", 100000, 4, "java Expert");

		trainer.add(t1);
		trainer.add(t2);
		trainer.add(t3);
		trainer.add(t4);

//		EMPLOYEE DATA

//		Employee(int id, String name, long contact, String email, double sal, int exp, String designation)

		List<Employee> employee = new ArrayList<>();

		Employee e1 = new Employee(301, "ramu kaka", 8394583349l, "ramuk@gmail.com", 30000, 3, "cleaning");
		Employee e2 = new Employee(302, "ajay rodge", 9393939393l, "ajay@gmail.com", 25000, 1, "HR");

		employee.add(e1);
		employee.add(e2);

//		STUDENT DATA

//		Student(int id, String name, long contact, String email,double percent,String course,String stream) 

		List<Student> student = new ArrayList<>();

		Student s1 = new Student(201, "nishchal", 2938249394l, "nish@gmail.com", 70.40, "javaFullStack", "CS");

		student.add(s1);

//      INSTITUTE DATA

//		Institute i=new Institute();
//		System.out.println(i.getTotalNumberOfStudents());
//		i.setTotalNumberOfStudents(student.size());
//		System.out.println(i.getTotalNumberOfStudents());
//		System.out.println(i.getBalance());
//		i.setBalance(50);

//		STARTING PROGRAM

		System.out.println("+++++++++++++++[    Admin Panel    ]++++++++++++++++++");
		admin(trainer, student, employee);

	}
//=================================================Admin=======================================================

	public static void admin(List<Trainer> trainer, List<Student> student, List<Employee> employee) {
		System.out.println();
		System.out.print("Enter username " + "\u27A4");
		String uname = sc.next();
		System.out.print("Enter password " + "\u27A4");
		String upass = sc.next();

		if (uname.equals(Institute.getAdmin()) && upass.equals(Institute.getPassword())) {
			System.out.println();
			System.out.println("=================WELCOME TO QSPIDER VASAI-VIRAR BRANCH====================");
			System.out.println();
			menu(trainer, student, employee);
		} else {
			System.out.println("\u26A0 " + "\u26A0" + " Enter Correct Credentials " + "\u26A0 " + "\u26A0");
			admin(trainer, student, employee);
		}
	}

//  ====================================================Menu====================================================

	public static void menu(List<Trainer> trainer, List<Student> student, List<Employee> employee) {

		System.out.println("Choose the Section: ");
		System.out.println("1.Student");
		System.out.println("2.Trainer");
		System.out.println("3.Employee");
		System.out.println("4.End The Program");
		System.out.print("\u27A4");

		try {
			int in;
			in = sc.nextInt();
			switch (in) {
			case 1:
				sOptions(student);
				break;
			case 2:
				tOptions(trainer);
				break;
			case 3:
				eOptions(employee);
				break;
			case 4:
				exit();
				break;
			default:
				System.out.println("\u26A0" + " " + "\u26A0" + " enter valid input " + "\u26A0" + " " + "\u26A0");
				System.out.println();
				menu(trainer, student, employee);
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("\u26A0" + " " + "\u26A0" + " enter valid input " + "\u26A0" + " " + "\u26A0");
			System.out.println();
			sc.next();
			menu(trainer, student, employee);
		}

	}

//	===========================================exit() method===================================================

	public static void exit() {
		System.out.println();
		System.out.println("\u263A" + " " + "\u263A" + " Thank You ,Good Day " + "\u263A" + " " + "\u263A");

	}

//	=======================================TRAINER SECTION STARTS HERE=============================================

	// printing the trainers details

	public static void printT(List<Trainer> trainer) {
		for (int i = 0; i < trainer.size(); i++) {
			System.out.println("ID: " + trainer.get(i).id + "\n" + "NAME: " + trainer.get(i).name);
			System.out.println("CONTACT: " + trainer.get(i).contact + "\n" + "EMAIL: " + trainer.get(i).email);
			System.out.println("SUBJECT: " + trainer.get(i).sub + "\n" + "EXPERIENCE: " + trainer.get(i).exp + " y");
			System.out.println();

		}
		tOptions(trainer);

	}

	// choosing the options for trainer

	public static void tOptions(List<Trainer> trainer) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose Options: ");
		System.out.println("1.Add Trainer");
		System.out.println("2.Remove Trainer ");
		System.out.println("3.Update Trainers details");
		System.out.println("4.Show Trainers details");
		System.out.println("5.Close the System");
		System.out.print("\u27A4");
		try {

			int uip = sc.nextInt();
			switch (uip) {
			case 1:
				addT(trainer);
				break;
			case 2:
				removeT(trainer);
				break;
			case 3:
				updateT(trainer);
				break;
			case 4:
				showT(trainer);
				break;
			case 5:
				exit();
				break;
			default:
				System.out.println("\u26A0" + " " + "\u26A0" + " enter valid options" + "\u26A0" + " " + "\u26A0");
				tOptions(trainer);
			}
		} catch (InputMismatchException e) {
			sc.next();
			System.out.println("\u26A0" + " " + "\u26A0" + " enter valid options" + "\u26A0" + " " + "\u26A0");
			System.out.println();
			tOptions(trainer);
		}
	}

	// removing the trainer

	public static void removeT(List<Trainer> trainer) {
		try {

			System.out.print("enter trainer ID: ");
			int tid = sc.nextInt();
			int count=0;
			int i;
			for (i = 0; i < trainer.size(); i++) 
			{
				if (tid != trainer.get(i).id) 
				{
					count++;
				}
				else
				{
					trainer.remove(i);
					System.out.println(" \u2714" + " Trainer has removed");
					System.out.println();
					tOptions(trainer);
				}
				
			}
			
			if(trainer.isEmpty())
			{
//				System.out.println("student section is empty");
			}
			
			else if(count==trainer.size()) {
				System.out.println(
						"\u26A0" + " " + "\u26A0" + " Trainer ID does not Exists " + "\u26A0" + " " + "\u26A0");
				System.out.println();
				tOptions(trainer);
			}
		}
		catch (InputMismatchException e) {
			sc.next();
			System.out.println("\u26A0" + " " + "\u26A0" + " enter valid ID" + "\u26A0" + " " + "\u26A0");
			System.out.println();
			removeT(trainer);
		}
	}

	// updating trainer details

	public static void updateT(List<Trainer> trainer) {

		try {

			System.out.print("Enter Trainer ID: ");
			int tid = sc.nextInt();

			int i = 0;

			while (i < trainer.size() && tid != trainer.get(i).id) {
				i++;
			}
			if (i < trainer.size()) {

				System.out.print("ID: ");
				int id = sc.nextInt();
				System.out.print("NAME: ");
				String name = sc.next();
				System.out.print("CONTACT: ");
				long contact = sc.nextLong();
				System.out.print("EMAIL: ");
				String email = sc.next();
				System.out.print("SALARY: ");
				double sal = sc.nextDouble();
				System.out.print("EXPERIENCE: ");
				int exp = sc.nextInt();
				System.out.print("SUBJECT: ");
				String sub = sc.next();

				Trainer t = new Trainer(id, name, contact, email, sal, exp, sub);

				trainer.set(i, t);
			} else {
				System.out.println("\u26A0" + " " + "\u26A0" + " ID does not Exists " + "\u26A0" + " " + "\u26A0");
				tOptions(trainer);
			}

			System.out.println();
			System.out.println(" \u2714" + " Trainer Details are Updated");
			System.out.println();

			tOptions(trainer);

		} catch (InputMismatchException e) {
			sc.next();
			System.out.println("\u26A0" + " " + "\u26A0" + " enter valid input" + "\u26A0" + " " + "\u26A0");
			System.out.println();
			tOptions(trainer);

		}

	}

	// displaying trainers details

	public static void showT(List<Trainer> trainer) {
		System.out.println();

		try {

			System.out.println("1.All Trainer Details");
			System.out.println("2.Individual Trainer Details");
			System.out.print("\u27A4");
			int ssid = sc.nextInt();

			switch (ssid) {
			case 1:
				printT(trainer);
				break;
			case 2:
				System.out.println();
				System.out.print("enter trainer Id: ");
				Integer sid = sc.nextInt();
				int i = 0;

				while (i < trainer.size() && trainer.get(i).id != sid) {
					i++;
				}
				if (i < trainer.size()) {
					System.out.println("ID: " + trainer.get(i).id + "\n" + "NAME: " + trainer.get(i).name);
					System.out
							.println("CONTACT: " + trainer.get(i).contact + "\n" + "TRAINER: " + trainer.get(i).email);
					System.out.println(
							"SUBJECT: " + trainer.get(i).sub + "\n" + "EXPERIENCE: " + trainer.get(i).exp + " y");
					System.out.println();
					tOptions(trainer);
					break;
				}
				System.out.println("\u26A0" + " " + "\u26A0" + " ID does not Exists " + "\u26A0" + " " + "\u26A0");

				System.out.println();
				tOptions(trainer);

				break;
			default:
				System.out.println("\u26A0" + " " + "\u26A0" + " enter valid option" + "\u26A0" + " " + "\u26A0");
				tOptions(trainer);
			}

		} catch (InputMismatchException e) {
			sc.next();
			System.out.println("\u26A0" + " " + "\u26A0" + " enter valid option" + "\u26A0" + " " + "\u26A0");
			System.out.println();
			tOptions(trainer);
		}
	}

	// adding trainers

	public static void addT(List<Trainer> trainer) {
		try {

			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("NAME: ");
			String name = sc.next();
			System.out.print("CONTACT: ");
			long contact = sc.nextLong();
			System.out.print("EMAIL: ");
			String email = sc.next();
			System.out.print("SALARY: ");
			double sal = sc.nextDouble();
			System.out.print("EXPERIENCE: ");
			int exp = sc.nextInt();
			System.out.print("SUBJECT: ");
			String sub = sc.next();

			Trainer t = new Trainer(id, name, contact, email, sal, exp, sub);
			trainer.add(t);

			System.out.println();
			System.out.println(" \u2714" + " Trainer is Added");
			System.out.println();

			System.out.println("do you want to add more tainer ");
			System.out.println("1.yes" + "\n" + "2.no");
			int aip = sc.nextInt();
			if (aip == 1) {
				addT(trainer);
			} else if (aip == 2) {
				tOptions(trainer);
			} else {
				System.out.println("\u26A0" + " " + "\u26A0" + " enter valid option" + "\u26A0" + " " + "\u26A0");
				tOptions(trainer);
			}

		} catch (InputMismatchException e) {
			sc.next();
			System.out.println("\u26A0" + " " + "\u26A0" + " enter valid option" + "\u26A0" + " " + "\u26A0");
			System.out.println();
			tOptions(trainer);
		}
	}

//	===========================================TRAINER SECTION ENDS HERE=============================================

//	=======================================STUDENT SECTION STARTS HERE=============================================
	// printing the student details

//	Student(int id, String name, long contact, String email,double percent,String course,String stream) 

	public static void printS(List<Student> student) {
		for (int i = 0; i < student.size(); i++) {
			System.out.println("ID: " + student.get(i).id + "\n" + "NAME: " + student.get(i).name);
			System.out.println("CONTACT: " + student.get(i).contact + "\n" + "EMAIL: " + student.get(i).email);
			System.out.println("PERCENT: " + student.get(i).percent + "\n" + "COURSE: " + student.get(i).course + "\n"
					+ "STREAM: " + student.get(i).stream);
			System.out.println();

		}
		sOptions(student);
	}

	// choosing the options for student

	public static void sOptions(List<Student> student) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose Options: ");
		System.out.println("1.Add Student ");
		System.out.println("2.Remove Student ");
		System.out.println("3.Update Student details");
		System.out.println("4.Show Students details");
		System.out.println("5.Close the System");
		System.out.print("\u27A4");
		try {
			int uip = sc.nextInt();
			switch (uip) {
			case 1:
				addS(student);
				break;
			case 2:
				removeS(student);
				break;
			case 3:
				updateS(student);
				break;
			case 4:
				showS(student);
				break;
			case 5:
				exit();
				break;
			default:
				System.out.println("\u26A0" + " " + "\u26A0" + " enter valid input" + "\u26A0" + " " + "\u26A0");
				sOptions(student);
			}
		} catch (InputMismatchException e) {
			sc.next();
			System.out.println("\u26A0" + " " + "\u26A0" + " enter valid input" + "\u26A0" + " " + "\u26A0");
			System.out.println();
			sOptions(student);
		}
	}

	// removing the student

	public static void removeS(List<Student> student) {
		try {

			System.out.print("enter student ID: ");
			int tid = sc.nextInt();
			int count=0;
			int i;
			for (i = 0; i < student.size(); i++) 
			{
				if (tid != student.get(i).id) 
				{
					count++;
				}
				else
				{
					student.remove(i);
					System.out.println(" \u2714" + " Student has removed");
					System.out.println();
					sOptions(student);
				}
				
			}
			
			if(student.isEmpty())
			{
//				System.out.println("student section is empty");
			}
			
			else if(count==student.size()) {
				System.out.println(
						"\u26A0" + " " + "\u26A0" + " Student ID does not Exists " + "\u26A0" + " " + "\u26A0");
				System.out.println();
				sOptions(student);
			}

		} catch (InputMismatchException e) {
			sc.next();
			System.out.println("\u26A0" + " " + "\u26A0" + " enter valid input" + "\u26A0" + " " + "\u26A0");
			System.out.println();
			sOptions(student);
		}
	}

	// updating student details

	public static void updateS(List<Student> student) {

		try {
			System.out.println();
			System.out.print("Enter Student ID: ");
			int tid = sc.nextInt();

			int i = 0;

			while (i < student.size() && tid != student.get(i).id) {
				i++;
			}
			if (i < student.size()) {

				System.out.print("ID: ");
				int id = sc.nextInt();
				System.out.print("NAME: ");
				String name = sc.next();
				System.out.print("CONTACT: ");
				long contact = sc.nextLong();
				System.out.print("EMAIL: ");
				String email = sc.next();
				System.out.print("PERCENT: ");
				double percent = sc.nextDouble();
				System.out.print("COURSE: ");
				String course = sc.next();
				System.out.print("STREAM: ");
				String stream = sc.next();

				Student s = new Student(id, name, contact, email, percent, course, stream);

				student.set(i, s);
			} else {
				System.out.println("\u26A0" + " " + "\u26A0" + " ID does not Exists " + "\u26A0" + " " + "\u26A0");
				sOptions(student);
			}

			System.out.println();
			System.out.println(" \u2714" + " Student Details are Updated");
			System.out.println();

			sOptions(student);

		} catch (InputMismatchException e) {
			sc.next();
			System.out.println();
			System.out.println("\u26A0" + " " + "\u26A0" + " enter valid input" + "\u26A0" + " " + "\u26A0");
			sOptions(student);

		}

	}

	// displaying student details

	public static void showS(List<Student> student) {
		try {
			System.out.println("1.All student Details");
			System.out.println("2.Individual student Details");
			System.out.print("\u27A4");

			int ssid = sc.nextInt();
			switch (ssid) {
			case 1:
				System.out.println();

				printS(student);
				break;
			case 2:
				System.out.println();
				System.out.print("enter student ID: ");
				int sid = sc.nextInt();
				int i = 0;

				while (i < student.size() && student.get(i).id != sid) {
					i++;
				}
				if (i < student.size()) {
					System.out.println();
					System.out.println("ID: " + student.get(i).id + "\n" + "NAME: " + student.get(i).name);
					System.out.println("CONTACT: " + student.get(i).contact + "\n" + "EMAIL: " + student.get(i).email);
					System.out.println("PERCENT: " + student.get(i).percent + "\n" + "COURSE: " + student.get(i).course
							+ "\n" + student.get(i).stream);
					System.out.println();
					sOptions(student);
					break;
				}
				System.out.println("\u26A0" + " " + "\u26A0" + " ID does not Exists " + "\u26A0" + " " + "\u26A0");

				System.out.println();
				sOptions(student);

				break;
			default:
				System.out.println("\u26A0" + " " + "\u26A0" + " enter valid option" + "\u26A0" + " " + "\u26A0");
				sOptions(student);
			}

		} catch (InputMismatchException e) {
			sc.next();
			System.out.println();
			System.out.println("\u26A0" + " " + "\u26A0" + " enter valid option" + "\u26A0" + " " + "\u26A0");
			sOptions(student);

		}
	}

	// adding students

	public static void addS(List<Student> student) {
		try {
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("NAME: ");
			String name = sc.next();
			System.out.print("CONTACT: ");
			long contact = sc.nextLong();
			System.out.print("EMAIL: ");
			String email = sc.next();
			System.out.print("PERCENT: ");
			double percent = sc.nextDouble();
			System.out.print("COURSE: ");
			String course = sc.next();
			System.out.print("STREAM: ");
			String stream = sc.next();

			Student s = new Student(id, name, contact, email, percent, course, stream);
			student.add(s);

			System.out.println();
			System.out.println(" \u2714" + " Student is Added");
			System.out.println();

			System.out.println("do you want to add more student ");
			System.out.println("1.yes" + "\n" + "2.no");
			int aip = sc.nextInt();
			if (aip == 1) {
				addS(student);
			} else if (aip == 2) {
				sOptions(student);
			} else {
				System.out.println("\u26A0" + " " + "\u26A0" + " enter valid option" + "\u26A0" + " " + "\u26A0");
				sOptions(student);
			}
		} catch (InputMismatchException e) {
			sc.next();
			System.out.println();
			System.out.println("\u26A0" + " " + "\u26A0" + " enter valid option" + "\u26A0" + " " + "\u26A0");
			sOptions(student);

		}

	}

//	===========================================STUDENT SECTION ENDS HERE=============================================

//	=======================================EMPLOYEE SECTION STARTS HERE=============================================
	// printing the employee details

	public static void printE(List<Employee> employee) {
		for (int i = 0; i < employee.size(); i++) {
			System.out.println("ID: " + employee.get(i).id + "\n" + "NAME: " + employee.get(i).name);
			System.out.println("CONTACT: " + employee.get(i).contact + "\n" + "EMAIL: " + employee.get(i).email);
			System.out.println(
					"EXPERIENCE: " + employee.get(i).exp + " y" + "\n" + "DESIGNATION: " + employee.get(i).designation);
			System.out.println();

		}
		eOptions(employee);

	}

	// choosing the options for employee

	public static void eOptions(List<Employee> employee) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose Options: ");
		System.out.println("1.Add Employee");
		System.out.println("2.Remove Employee");
		System.out.println("3.Update Employee Details");
		System.out.println("4.Show Employee Details");
		System.out.println("5.Close the System");
		System.out.print("\u27A4");
		try {
			int uip = sc.nextInt();

			switch (uip) {
			case 1:
				addE(employee);
				break;
			case 2:
				removeE(employee);
				break;
			case 3:
				updateE(employee);
				break;
			case 4:
				showE(employee);
				break;
			case 5:
				exit();
				break;
			default:
				System.out.println("\u26A0" + " " + "\u26A0" + " enter valid option" + "\u26A0" + " " + "\u26A0");
				eOptions(employee);
			}
		} catch (InputMismatchException e) {
			sc.next();
			System.out.println("\u26A0" + " " + "\u26A0" + " enter valid option" + "\u26A0" + " " + "\u26A0");
			System.out.println();
			eOptions(employee);
		}
	}

	// removing the employee

	public static void removeE(List<Employee> employee) {
		try {
			System.out.print("enter trainer ID: ");

			int tid = sc.nextInt();
			int i;
			int count=0;
			for (i = 0; i < employee.size(); i++) 
			{
				if (tid != employee.get(i).id) 
				{
					count++;
				}
				else
				{
					employee.remove(i);
					System.out.println(" \u2714" + " Employee has removed");
					System.out.println();
					eOptions(employee);
				}
				
			}
			
			if(employee.isEmpty())
			{
//				System.out.println("employee section is empty");
			}
			
			else if(count==employee.size()) {
				System.out.println(
						"\u26A0" + " " + "\u26A0" + " Employee ID does not Exists " + "\u26A0" + " " + "\u26A0");
				System.out.println();
				eOptions(employee);
			}
		} catch (InputMismatchException e) {
			sc.next();
			System.out.println("\u26A0" + " " + "\u26A0" + " enter valid input" + "\u26A0" + " " + "\u26A0");
			System.out.println();
			eOptions(employee);

		}
	}

	// updating employee details

	public static void updateE(List<Employee> employee) {
		try {
			System.out.print("Enter Employee ID: ");
			int tid = sc.nextInt();

			int i = 0;

			while (i < employee.size() && tid != employee.get(i).id) {
				i++;
			}
			if (i < employee.size()) {

				System.out.print("ID: ");
				int id = sc.nextInt();
				System.out.print("NAME: ");
				String name = sc.next();
				System.out.print("CONTACT: ");
				long contact = sc.nextLong();
				System.out.print("EMAIL: ");
				String email = sc.next();
				System.out.print("SALARY: ");
				double sal = sc.nextDouble();
				System.out.print("EXPERIENCE: ");
				int exp = sc.nextInt();
				System.out.print("DESIGNATION: ");
				String designation = sc.next();

//				Employee(int id, String name, long contact, String email, double sal, int exp, String designation) {

				Employee e = new Employee(id, name, contact, email, sal, exp, designation);

				employee.set(i, e);
			} else {
				System.out.println("\u26A0" + " " + "\u26A0" + " ID does not Exists " + "\u26A0" + " " + "\u26A0");
				eOptions(employee);
			}

			System.out.println();
			System.out.println(" \u2714" + " Employee Details are Updated");
			System.out.println();

			eOptions(employee);

		} catch (InputMismatchException e) {
			sc.next();
			System.out.println("\u26A0" + " " + "\u26A0" + " enter valid input" + "\u26A0" + " " + "\u26A0");
			System.out.println();
			eOptions(employee);

		}

	}

	// displaying employee details

	public static void showE(List<Employee> employee) {
		System.out.println("1.All employee Details");
		System.out.println("2.Individual employee Details");
		System.out.print("\u27A4");
		try {
			int ssid = sc.nextInt();
			switch (ssid) {
			case 1:
				printE(employee);
				break;
			case 2:
				System.out.println();
				System.out.print("enter employee ID: ");
				int sid = sc.nextInt();
				int i = 0;

				while (i < employee.size() && employee.get(i).id != sid) {
					i++;
				}
				if (i < employee.size()) {
					System.out.println();
					System.out.println("ID: " + employee.get(i).id + "\n" + "NAME: " + employee.get(i).name);
					System.out
							.println("CONTACT: " + employee.get(i).contact + "\n" + "EMAIL: " + employee.get(i).email);
					System.out.println("EXPERIENCE: " + employee.get(i).exp + "\n" + "DESIGNATION: "
							+ employee.get(i).designation);
					System.out.println();
					eOptions(employee);
					break;
				}

				System.out.println("\u26A0" + " " + "\u26A0" + " ID does not exist " + "\u26A0" + " " + "\u26A0");

				System.out.println();
				eOptions(employee);
				break;
			default:
				System.out.println("\u26A0" + " " + "\u26A0" + " enter valid option" + "\u26A0" + " " + "\u26A0");
				eOptions(employee);
			}

		} catch (InputMismatchException e) {
			sc.next();
			System.out.println("\u26A0" + " " + "\u26A0" + " enter valid option" + "\u26A0" + " " + "\u26A0");
			System.out.println();
			eOptions(employee);

		}
	}

	// adding employee

	public static void addE(List<Employee> employee) {
		try {
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("NAME: ");
			String name = sc.next();
			System.out.print("CONTACT: ");
			long contact = sc.nextLong();
			System.out.print("EMAIL: ");
			String email = sc.next();
			System.out.print("SALARY: ");
			double sal = sc.nextDouble();
			System.out.print("EXPERIENCE: ");
			int exp = sc.nextInt();
			System.out.print("DESIGNATION: ");
			String designation = sc.next();

//			Employee(int id, String name, long contact, String email, double sal, int exp, String designation) {

			Employee e = new Employee(id, name, contact, email, sal, exp, designation);
			employee.add(e);

			System.out.println();
			System.out.println(" \u2714" + " Employee is Added");
			System.out.println();

			System.out.println("do you want to add more employee ");
			System.out.println("1.yes" + "\n" + "2.no");
			int aip = sc.nextInt();
			if (aip == 1) {
				addE(employee);
			} else if (aip == 2) {
				eOptions(employee);
			} else
				System.out.println("\u26A0" + " " + "\u26A0" + " enter valid option" + "\u26A0" + " " + "\u26A0");
			eOptions(employee);
		} catch (InputMismatchException e) {
			sc.next();
			System.out.println("\u26A0" + " " + "\u26A0" + " enter valid option" + "\u26A0" + " " + "\u26A0");
			System.out.println();
			eOptions(employee);
		}
	}

//	===========================================EMPLOYEE SECTION ENDS HERE=============================================
}
