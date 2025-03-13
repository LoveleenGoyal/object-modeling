import java.util.ArrayList;

// Student class representing a student in the university system
class UniStudent {
    private String name;
    private ArrayList<UniCourse> courses;

    // Constructor
    public UniStudent(String name) {

        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method to enroll in a course
    public void enrollCourse(UniCourse course) {
        courses.add(course);
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student: " + name);
        for (UniCourse course : courses) {
            System.out.println("Enrolled in: " + course.getCourseName());
        }
    }
}

// Professor class representing a professor in the university system
class Professor {
    private String name;
    private ArrayList<UniCourse> courses;

    // Constructor
    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method to assign a professor to a course
    public void assignCourse(UniCourse course) {
        courses.add(course);
    }

    // Method to display professor details
    public void displayProfessorDetails() {
        System.out.println("Professor: " + name);
        for (UniCourse course : courses) {
            System.out.println("Teaches: " + course.getCourseName());
        }
    }
}

// Course class representing a course in the university system
class UniCourse {
    private String courseName;


    // Constructor
    public UniCourse(String courseName) {
        this.courseName = courseName;
    }

    // Method to get the course name
    public String getCourseName() {
        return courseName;
    }
}

// Main class to demonstrate the university management system
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating students
        UniStudent student1 = new UniStudent("Alice");
        UniStudent student2 = new UniStudent("Bob");

        // Creating professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Creating courses
        UniCourse course1 = new UniCourse("Mathematics");
        UniCourse course2 = new UniCourse("Computer Science");

        // Students enrolling in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course2);

        // Professors assigning courses
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        // Display details
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        professor1.displayProfessorDetails();
        professor2.displayProfessorDetails();
    }
}
