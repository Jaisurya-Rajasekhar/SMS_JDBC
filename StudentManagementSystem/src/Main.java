import java.sql.*;
import java.util.*;
public class Main {

	public static void main(String[] args)throws SQLException {
		Scanner sc=new Scanner(System.in);
		StudentDAO studentDAO=new StudentDAO();
		while(true) {
			  System.out.println("\nChoose an option:");
	            System.out.println("1. Retrieve all students");
	            System.out.println("2. Insert a new student");
	            System.out.println("3. Update a student's information");
	            System.out.println("4. Delete a student");
	            System.out.println("5. Exit");
	            
	            int choice =sc.nextInt();
	            sc.nextLine();
	            
	            try {
	            	switch(choice) {
	            	case 1:
	            		studentDAO.getAllStudents();
	            		break;
	            	case 2:
	            		System.out.println("Enter student name:");
                        String name = sc.nextLine();
                        System.out.println("Enter roll number:");
                        String rollNumber = sc.nextLine();
                        System.out.println("Enter department:");
                        String department = sc.nextLine();
                        System.out.println("Enter marks:");
                        int marks = sc.nextInt();
                     
                        studentDAO.insertStudent(name, rollNumber, department, marks);
                        break;
                        
	            	case 3:
	            		 System.out.println("Enter roll number of the student to update:");
	                        String rollNumToUpdate = sc.nextLine();
	                        System.out.println("Enter new name:");
	                        String newName = sc.nextLine();
	                        System.out.println("Enter new department:");
	                        String newDepartment = sc.nextLine();
	                        System.out.println("Enter new marks:");
	                        int newMarks = sc.nextInt();
	                        
	                        studentDAO.updateStudent(rollNumToUpdate, newName, newDepartment, newMarks);
	                        break;
	                        
	            	case 4:
	            	    System.out.println("Enter roll number of the student to delete:");
	            	    String rollNumToDelete = sc.nextLine(); 
	            	    studentDAO.deleteStudent(rollNumToDelete);
	            	    break;

	            		
	            	case 5:
	            		System.out.println("Exiting...");
	            		System.exit(0);
	            		default:
	            			System.out.println("Invalid option, please try again.");
                        
	            	}
	            	
	            }catch(SQLException e) {
	            	System.out.println("An error occured:"+ e.getMessage());
	            }
		}

	}

}
