📘 Student Management System (Java Console Application)

A simple Java-based console application to manage student records. This system allows users to Add, View, Update, and Delete (CRUD) student details using an in-memory ArrayList.

🧾 Features

Add Student – Enter ID, Name, Age, Grade

View Students – Displays all student records

Update Student – Modify details using Student ID

Delete Student – Remove a student by ID

Exit Program – Close the application safely

🏗️ Project Structure
studentmanagement/
│
├── Student.java
└── StudentManagementSystem.java

Student.java

Model class representing a student with:

id

name

age

grade

Includes constructor, getters, setters, and toString().

StudentManagementSystem.java

Contains:

Main menu

CRUD operations

ArrayList for storage

Scanner for user input

▶️ How to Run

Download or clone the project

Open the folder in Eclipse, IntelliJ, or any Java IDE

Ensure the package name is:

package studentmanagement;


Run:

StudentManagementSystem.java


You will see the menu:

======= Student Management System ========

1. Add Student
2. View Student
3. Update Student
4. Delete Student
5. Exit
Enter Choice:

📂 Example Usage
Add Student
Enter Student Id: 101
Enter Student Name: John
Enter Student Age: 20
Enter Student Grade: A
Student Added Successfully!

View Students
===== Student List =====
ID: 101 | Name: John | Age: 20 | Grade: A |

🛠️ Technologies Used

Java

ArrayList

OOP (Classes, Objects, Encapsulation)

🚀 Future Enhancements

(Optional ideas to improve the project)

Save & load data using files

Connect MySQL database using JDBC

Add Java Swing / JavaFX UI

Convert to a web app using Servlets or Spring Boot
