import java.util.Scanner;
import java.util.ArrayList;

class Student {
	private String first_name;
	private String last_name;
	private String address;

	public Student(final String first_name, final String last_name) {
		this.first_name = ucfirst(first_name);
		this.last_name = ucfirst(last_name);
	}

	public void setFirstName(final String first_name) {
		this.first_name = ucfirst(first_name);
	}

	public void setLastName(final String first_name) {
		this.last_name = ucfirst(last_name);
	}

	public String getFirstName() {
		return first_name;
	}

	public String getLastName() {
		return last_name;
	}

	private String ucfirst(final String str) {
		return String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1, str.length());
	}
}

class Test {
	public static void main(final String[] args) {
		final Scanner scan = new Scanner(System.in);
		final ArrayList<Student> students = new ArrayList<Student>();
		
		char option = ' ';
		boolean flag = true;
		
		do {
			System.out.println("Welcome to Student Registration System.");
			System.out.println("[a] Register Student.");
			System.out.println("[b] Display All Students.");
			System.out.println("[c] Exit.");
			System.out.print("Option: ");
			option = scan.nextLine().charAt(0);
			
			switch(option) {
				case 'A': case 'a': 
					System.out.println("Enter New Student Record");
					students.add(createStudent());
					break;
				case 'B': case 'b': 
					displayStudents(students);
					break;
				case 'C': case 'c': 
					flag = false; 
					break;
			}		
		} while(flag);
	}

	public static Student createStudent() {
		final Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		String fname = scan.nextLine();
		System.out.print("Enter Last Name: ");
		String lname = scan.nextLine();
		return new Student(fname, lname);
	}

	public static void displayStudents(ArrayList<Student> students) {
		if(students.isEmpty()) {
			System.out.println("No student record available");
		} else {
			System.out.println("List of Students");
			for(Student student : students) {
				System.out.println("Student ID No. " + students.indexOf(student));
				System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
			}
		}
	}
}