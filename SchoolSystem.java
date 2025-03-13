import java.util.ArrayList;

// School class demonstrating Aggregation
class School {
    private String schoolName;
    private ArrayList<Student> students; // Aggregation: School contains Students

    // Constructor
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to display school details
    public void displaySchoolDetails() {
        System.out.println("School: " + schoolName);
        for (Student student : students) {
            student.displayStudentDetails();
        }
    }
}

// Student class demonstrating Association with Course
class Student {
    String name;
    private ArrayList<Course> courses; // A Student can enroll in multiple courses

    // Constructor
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method to enroll in a course
    public void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student: " + name);
        System.out.print("Enrolled Courses: ");
        for (Course course : courses) {
            System.out.print(course.getCourseName() + " ");
        }
        System.out.println();
    }
}

// Course class demonstrating Association with Student
class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents; // A Course can have multiple students

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Method to add a student to the course
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    // Method to get course name
    public String getCourseName() {
        return courseName;
    }

    // Method to display enrolled students
    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName + " - Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println(student.name);
        }
    }
}

// Main class to demonstrate association and aggregation
public class SchoolSystem {
    public static void main(String[] args) {
        // Creating a school
        School school = new School("Greenwood High School");

        // Creating students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Adding students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Creating courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Enrolling students in courses
        student1.enrollInCourse(math);
        student1.enrollInCourse(science);
        student2.enrollInCourse(science);

        // Displaying school details
        school.displaySchoolDetails();

        // Displaying enrolled students for each course
        math.displayEnrolledStudents();
        science.displayEnrolledStudents();
    }
}
