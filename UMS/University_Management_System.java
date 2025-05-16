package UMS; 
public class University_Management_System{
    public static void main(String[] args) {
    Department department1 = new Department("Computer Science", 101);
    Department department2 = new Department("Mathematics", 102);
    Department department3 = new Department("Physics", 103);
        Department cs = new Department("java",204)
    Department[] departments = {department1, department2, department3,cs};
    University university = new University("ABC University", departments);
    university.display();


}}
