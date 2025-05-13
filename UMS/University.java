package UMS;
public class University {
    String name;
    Department[] departments;

     University(String name, Department[] departments) {
        this.name = name;
        this.departments = departments;
    }
    void display(){
        System.out.println("University Name: "+this.name);
        System.out.println("Departments: ");
        for (Department department : departments) {
            System.out.println("Department Name: " + department.name);
            System.out.println("Faculty No: " + department.facultyNo);
        }
    }
    

}
