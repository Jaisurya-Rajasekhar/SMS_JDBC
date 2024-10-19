import java.sql.*;

public class StudentDAO {
    // Constructor
    public StudentDAO() throws SQLException {
        // Constructor logic if needed
    }

    // Method to get a connection
    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String userName = "root";
        String password = "8768";
        return DriverManager.getConnection(url, userName, password);
    }

    // Method to retrieve all students
    public void getAllStudents() throws SQLException {
        Connection con = getConnection();
        Statement st = con.createStatement();
        String query = "SELECT * FROM Students";
        ResultSet rs = st.executeQuery(query);
        
        while (rs.next()) {
            System.out.println("Name: " + rs.getString("stu_name"));
            System.out.println("Roll Number: " + rs.getString("roll_number"));
            System.out.println("Department: " + rs.getString("department"));
            System.out.println("Marks: " + rs.getInt("marks"));
        }
        
        con.close();
    }

    // Method to insert a student
    public void insertStudent(String name, String rollNumber, String department, int marks) throws SQLException {
        Connection con = getConnection();
        String query = "INSERT INTO Students(stu_name, roll_number, department, marks) VALUES(?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, name);
        pst.setString(2, rollNumber);
        pst.setString(3, department);
        pst.setInt(4, marks);
        
        int rows = pst.executeUpdate();
        System.out.println("Rows affected: " + rows);
        
        con.close();
    }

    // Method to update a student's information
    public void updateStudent(String rollNumber, String name, String department, int marks) throws SQLException {
        String query = "UPDATE Students SET stu_name = ?, department = ?, marks = ? WHERE roll_number = ?";
        
        Connection con = getConnection();
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, name);
        pst.setString(2, department);
        pst.setInt(3, marks);
        pst.setString(4, rollNumber);
        
        int rows = pst.executeUpdate();
        System.out.println("Rows affected: " + rows);
        
        con.close();
    }

    // Method to delete a student
    public void deleteStudent(String rollNumber) throws SQLException {
        Connection con = getConnection();
        String query = "DELETE FROM Students WHERE roll_number = ?";
        
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, rollNumber);
        
        int rows = pst.executeUpdate();
        System.out.println("Rows affected: " + rows);
        
        con.close();
    }
}
