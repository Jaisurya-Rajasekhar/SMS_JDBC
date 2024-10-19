
public class Student {
	private int id;
	private String name;
	private String rollNumber;
	private String department;
	private int marks;
	 public Student(int id,String name,String rollNumber,String department,int marks) {
		 this.id=id;
		 this.name=name;
		 this.rollNumber=rollNumber;
		 this.department=department;
		 this.marks=marks;
	 }
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id=id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
	 public String getRollNumber() {
		 return rollNumber;
	 }
	 public void setRollNumber(String rollNumber) {
		 this.rollNumber=rollNumber;
	 }
	 public String getDepartment() {
		 return department;
		 
	 }
	 public void setDepartment(String department) {
		 this.department=department;
	 }
	 public int getMarks() {
		 return marks;
	 }
	 public void setMarks(int marks) {
		 this.marks=marks;
	 }
	 
	 public String toString() {
		 return "Student [ID=" + id + ", Name=" + name + ", Roll Number=" + rollNumber +
               ", Department=" + department + ", Marks=" + marks + "]";
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
