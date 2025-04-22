// File: polymorphism.java

class LMS{
    public void display() {
        System.out.println("Welcome to the Learning Management System");
    }
}

class Student extends LMS {
    @Override
    public void display() {
        System.out.println("Student Dashboard: View courses and track progress.");
    }
    void addcourse() {
        System.out.println("Adding a new course...");
    }
    void dropcourse() {
        System.out.println("Dropping a course...");
    }
}

class Instructor extends LMS {
    @Override
    public void display() {
        System.out.println("Instructor Dashboard: Manage courses and assignments.");
    }
    void createCourse() {
        System.out.println("Creating a new course...");
    }
    void gradeAssignments() {
        System.out.println("Grading assignments...");
    }
}

class Admin extends LMS {
    @Override
    public void display() {
        System.out.println("Admin Dashboard: Manage users and system settings.");
    }
    void manageUsers() {
        System.out.println("Managing users...");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        LMS user1 = new Student(); // Upcasting
        user1.display();
         // Dynamic method dispatch
        // user1.addcourse(); // This line would cause a compile-time error
        // because addcourse() is not defined in LMS class
        // To call addcourse(), we need to downcast
         Student student = (Student) user1; // Downcasting
        student.addcourse(); // Now we can call addcourse()
        student.dropcourse(); // Now we can call dropcourse()


        LMS user2 = new Instructor(); 
        user2.display(); // Dynamic method dispatch
        Instructor instructor = (Instructor) user2; // Downcasting
        instructor.createCourse(); // Now we can call createCourse()
        instructor.gradeAssignments(); // Now we can call gradeAssignments()

        LMS user3 = new Admin();
        Admin admin = (Admin) user3;
        admin.display();
        admin.manageUsers(); // Now we can call manageUsers()
        






    
       
       
    }
}