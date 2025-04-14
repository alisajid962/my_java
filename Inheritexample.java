package IS_HAS_OOP;
import java.awt.*;
class Employee{
    String name;
    int salary;
    Employee(String name,int salary){
    
        this.name = name;
        this.salary =salary;
    }
    void display (){

        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
class Developer extends Employee{
    String language;
    Developer(String name,int salary,String language){
        System.out.println("DEVELOPER");
         super(name,salary);
        this.language = language;

    }
    void developSoftware(){
        System.out.println("Developer "+name+" is developing software in "+language+" language");
    }
}
class Manager extends Employee{
    int teamsize;
    Manager(String name,int salary,int teamsize){
        super(name,salary);
        this.teamsize = teamsize;
    }
    void ManageTeam(){
        System.out.println("MANAGER "+name+" Manages "+teamsize+" employees");
    }
}
class Company {
    String companyName;
    Employee emp1;
    Employee emp2;

    Company(String companyName, Employee emp1, Employee emp2) {
        System.out.println("MANAGER");
        this.companyName = companyName;
        this.emp1 = emp1;
        this.emp2 = emp2;
    }

    void showCompanyInfo() {
        System.out.println("Company: " + companyName);
        emp1.display();
        System.out.println("-----------");
        emp2.display();
        System.out.println("-----------");
    }
}


public class Inheritexample {
    public static void main(String[] args) {
     Developer ali = new Developer("Ali",50000,"Java");
     Manager moh = new Manager("Moh",60000,10);
     Company comp = new Company("ABC",ali,moh);
     ali.display();
     ali.developSoftware();
     moh.display();
     moh.ManageTeam();
     comp.showCompanyInfo();

    
    }
    
   
}
