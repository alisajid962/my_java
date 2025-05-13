package UMS;
public class Department {
    String name;
    int facultyNo;
    Department(	String name, int facultyNo) {
        this.name = name;
        this.facultyNo = facultyNo;
    }
    void display() {
        System.out.println("Department Name: " + this.name);
        System.out.println("Faculty No: " + this.facultyNo);
    }
}
