package studentmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
	private static ArrayList<Student> students = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);
	
public static void main(String[] args) {
	
	 while(true) {
		 System.out.println("\n======= Student Management System ========\n");
		 System.out.println("1. Add Student");
		 System.out.println("2. View Student");
		 System.out.println("3. Update Student");
		 System.out.println("4. Delete Student");
		 System.out.println("5. Exit");
		 System.out.println("Enter Choice: ");
		 		 
		 int choice=sc.nextInt();
		 sc.nextLine();
		 
		 switch(choice) {
		 case 1: addStudent(); break;
		 case 2: viewStudents(); break;
		 case 3: updateStudent(); break;
		 case 4: deleteStudent(); break;
		 case 5: {
			 			System.out.println("Exiting.... GoodBye:");
			 			System.exit(0);
		         }  break;
		 default: System.out.println("Invalid Choice! Try again.....");
		 
		 }
	 }
}

private static void addStudent() {
	System.out.println("Enter Student Id: ");
	int id  =sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Student Name: ");
	String name = sc.nextLine();
	sc.nextLine();
	System.out.println("Enter Student Age: ");
	int age = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Student Grade: ");
	String grade = sc.nextLine();
	
	
	students.add(new Student(id,name,age,grade));
	System.out.println("Student Added Successfully!....");
}

private static void viewStudents() {
	if(students.isEmpty()) {
		System.out.println("No Student found!");
	}
	else {
		System.out.println("\n===== Student List =====\n");
		for(Student s : students) {
			System.out.println(s);
		}
	}
}

private static void updateStudent() {
	System.out.println("Enter Id to update: ");
	int id=sc.nextInt();
	sc.nextLine();
	
	for(Student s : students) {
		if(s.getId() == id) {
			System.out.println("Enter new Name: ");
			s.setName(sc.nextLine());
			System.out.println("Enter new Age: ");
			s.setAge(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter new grade: ");
			s.setGrade(sc.nextLine());
			System.out.println("Student Update Successfully!.....");
			return;
		}
	}
	System.out.println("Student not found!");	
}

private static void deleteStudent() {
	System.out.println("Enter Id to delete: ");
	int id=sc.nextInt();
	sc.nextLine();
	
	for(Student s : students) {
		if(s.getId() == id) {
			students.remove(s);
			System.out.println("Student Deleted Successfully!.....");
			return;
		}
	}
	System.out.println("Student not found!......");
}
}
