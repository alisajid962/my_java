
class employee {

    protected int id;
    protected String name;
    protected String role;
    static String comapny_name;
    static int emp_count = 0; // static variable is used to store the count of objects created
    // static variable is shared by all the objects of the class
    // static variable is used to store the common data of all the objects of the class
    // static variable is used to store the data which is not going to change
    static void setComapany_name(String name) {
        comapny_name = name;
    }

    employee(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
        emp_count++; // increment the count of objects created
    }

    void displayInfo() {
        System.out.println("id: " + this.id);
        System.out.println("name: " + this.name);
        System.out.println("company name: " + comapny_name);
    }
    static void displayCount() {
        System.out.println("count of objects created: " + emp_count);
    }

}

public class static_exp {

    public static void main(String[] args) {
        employee.setComapany_name("Soft_tech_solutions");
        employee emp1 = new employee(101, "John","developer");
        emp1.displayInfo();
      
        employee emp2 = new employee(102, "Smith","developer");
        emp2.displayInfo();

        employee.displayCount(); // static method can be called using class name
        
    }
}
