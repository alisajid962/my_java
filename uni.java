package mid_oop;
import java.util.Objects;

class Student {
    private String name;
    private int studentId;
    private Course enrolledCourse;
    private Teacher teacher; // Added: Reference to a teacher (for simplicity in this constraint)

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourse = null;
        this.teacher = null;
    }

    public Student(Student other) {
        this.name = other.name;
        this.studentId = other.studentId;
        this.enrolledCourse = other.enrolledCourse;
        this.teacher = other.teacher; // Shallow copy
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public Course getEnrolledCourse() {
        return enrolledCourse;
    }

    public void enrollCourse(Course course) {
        this.enrolledCourse = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", studentId=" + studentId +
               ", enrolledCourse=" + (enrolledCourse != null ? enrolledCourse.getCourseName() : "None") +
               ", teacher=" + (teacher != null ? teacher.getName() : "None") +
               '}';
    }
}

class Teacher {
    private String name;
    private int teacherId;
    private Course assignedCourse;
    private Student student; // Added: Reference to a student (very limited)

    public Teacher(String name, int teacherId) {
        this.name = name;
        this.teacherId = teacherId;
        this.assignedCourse = null;
        this.student = null;
    }

    public String getName() {
        return name;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public Course getAssignedCourse() {
        return assignedCourse;
    }

    public void assignCourse(Course course) {
        this.assignedCourse = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public boolean compareTeacherByName(Teacher other) {
        return this.name.equalsIgnoreCase(other.name);
    }

    public boolean compareTeacherById(Teacher other) {
        return this.teacherId == other.teacherId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return teacherId == teacher.teacherId && Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, teacherId);
    }

    @Override
    public String toString() {
        return "Teacher{" +
               "name='" + name + '\'' +
               ", teacherId=" + teacherId +
               ", assignedCourse=" + (assignedCourse != null ? assignedCourse.getCourseName() : "None") +
               ", student=" + (student != null ? student.getName() : "None") +
               '}';
    }
}

class Course {
    private String courseName;
    private String courseCode;
    private Teacher instructor;
    private Student student; // Added: Reference to a student (extremely limited)

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = null;
        this.student = null;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Course{" +
               "courseName='" + courseName + '\'' +
               ", courseCode='" + courseCode + '\'' +
               ", instructor=" + (instructor != null ? instructor.getName() : "None") +
               ", student=" + (student != null ? student.getName() : "None") +
               '}';
    }
}

class SchoolTest {
    public static void main(String[] args) {
        // Create instances directly
        // Teacher teacher1 = new Teacher("Mr. Smith", 201);
        // Teacher teacher2 = new Teacher("Jane Doe", 202);
        // Student student1 = new Student("Alice", 101);
        // Student student2 = new Student("Bob", 102);
        // Course mathCourse = new Course("Mathematics", "MATH101");
        // Course scienceCourse = new Course("Science", "SCI201");

        // // Demonstrate copy constructor
        // Student student1Copy = new Student(student1);
        // System.out.println("Original Student: " + student1);
        // System.out.println("Copied Student: " + student1Copy);
        // System.out.println("Are original and copy the same object? " + (student1 == student1Copy));
        // System.out.println("Are original and copy equal? " + student1.equals(student1Copy));

        // // Demonstrate teacher comparisons
        // System.out.println("\nComparing teachers by name:");
        // System.out.println(teacher1.getName() + " and " + teacher2.getName() + " (by name): " + teacher1.compareTeacherByName(teacher2));

        // System.out.println("\nComparing teachers by ID:");
        // System.out.println(teacher1.getName() + " (ID: " + teacher1.getTeacherId() + ") and " + teacher2.getName() + " (ID: " + teacher2.getTeacherId() + ") (by ID): " + teacher1.compareTeacherById(teacher2));

        // // Establish relationships directly (this is where it gets ugly)
        // student1.enrollCourse(mathCourse);
        // student1.setTeacher(teacher1);
        // mathCourse.setInstructor(teacher1);
        // mathCourse.setStudent(student1);
        // teacher1.setStudent(student1);

        // student2.enrollCourse(scienceCourse);
        // student2.setTeacher(teacher2);
        // scienceCourse.setInstructor(teacher2);
        // scienceCourse.setStudent(student2);
        // teacher2.setStudent(student2);


        // // Print results (very manual)
        // System.out.println("\nStudent Details:");
        // System.out.println(student1);
        // System.out.println(student2);

        // System.out.println("\nTeacher Details:");
        // System.out.println(teacher1);
        // System.out.println(teacher2);

        // System.out.println("\nCourse Details:");
        // System.out.println(mathCourse);
        // System.out.println(scienceCourse);
        Course c1 = new Course("Math", "MATH101");
        Course c2 = new Course("Math", "MATH101");
        Course c3 = new Course("Math", "MATH101");
        System.out.println("Are courses equal? " + c1.equals(c2));
        Teacher t1 = new Teacher("Ali", 101);
        Teacher t2 = new Teacher("Ali", 101);
        System.out.println("Are teachers equal? " + t1.equals(t2));

        c1.setInstructor(t2);
        c2.setInstructor(t1);
        System.out.println("Are instructors equal? " + c1.getInstructor().equals(c2.getInstructor()));
        Course c4 = new Course("Math", "MATH101");
        t1.assignCourse(c3);
        t2.assignCourse(c4);
        System.out.println("Are assigned courses equal? " + c3.equals(c4));
    }
}