JDBC Student Management System (SMS)

This project is a Student Management System (SMS) developed using Java and JDBC (Java Database Connectivity). It allows users to perform basic CRUD (Create, Read, Update, Delete) operations on student data stored in a MySQL database. The system is designed to manage student information such as name, roll number, department, and marks.

Features:
1. Retrieve All Students: Display a list of all students from the database.
2. Insert a New Student: Add a new student's details into the database.
3. Update a Student's Information: Update existing student information such as name, department, or marks.
4. Delete a Student: Remove a student's record from the database using their roll number.

Technologies Used:
1. Java: Core programming language.
2. JDBC (Java Database Connectivity): Used for connecting and interacting with the MySQL database.
3. MySQL: Backend database to store student records.
4. PreparedStatement: To avoid SQL injection attacks while handling SQL queries.
5. Scanner: For user input handling.

How It Works:
1. The application provides a menu-driven interface that allows users to select various options for managing student data.
2. Each option corresponds to a database operation (CRUD).
3. Data is validated and then processed in the MySQL database.

How to Run the Project:

1. Clone the repository: git clone https://github.com/yourusername/jdbc-student-management-system.git


2. Set up the Database:
   
    Create a MySQL database named jdbcdemo or update the StudentDAO class with your database connection details.
    Create a table called Students: 
                    CREATE TABLE Students (
                        stu_name VARCHAR(100),
                        roll_number VARCHAR(20) PRIMARY KEY,
                        department VARCHAR(50),
                        marks INT
                    );

3. Run the Project:
   
   Compile and run the Main.java file in any Java-supported IDE or command line.
