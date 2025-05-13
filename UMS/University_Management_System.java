package UMS; 
public class University_Management_System{
    public static void main(String[] args) {
    Department department1 = new Department("Computer Science", 101);
    Department department2 = new Department("Mathematics", 102);
    Department department3 = new Department("Physics", 103);
    Department[] departments = {department1, department2, department3};
    University university = new University("ABC University", departments);
    university.display();


}}