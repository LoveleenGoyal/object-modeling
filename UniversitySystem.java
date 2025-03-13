import java.util.ArrayList;

// University class demonstrating Composition with Departments
class University {
    private String universityName;
    private ArrayList<UniDepartment> departments; // Composition: University owns Departments

    // Constructor
    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department
    public void addDepartment(UniDepartment department) {
        departments.add(department);
    }

    // Method to display university details
    public void displayUniversityDetails() {
        System.out.println("University: " + universityName);
        for (UniDepartment department : departments) {
            department.displayDepartmentDetails();
        }
    }
}

// Department class demonstrating Composition with University
class UniDepartment {
    private String departmentName;
    private ArrayList<Faculty> facultyMembers; // Aggregation: Faculty members can exist independently

    // Constructor
    public UniDepartment(String departmentName) {
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>();
    }

    // Method to add a faculty member
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    // Method to display department details
    public void displayDepartmentDetails() {
        System.out.println("Department: " + departmentName);
        if (facultyMembers.isEmpty()) {
            System.out.println("No faculty members in this department.");
        } else {
            for (Faculty faculty : facultyMembers) {
                faculty.displayFacultyDetails();
            }
        }
    }
}

// Faculty class demonstrating Aggregation with Department
class Faculty {
    private String name;

    // Constructor
    public Faculty(String name) {
        this.name = name;
    }

    // Method to display faculty details
    public void displayFacultyDetails() {
        System.out.println("Faculty: " + name);
    }
}

// Main class to demonstrate composition and aggregation
public class UniversitySystem {
    public static void main(String[] args) {
        // Creating a university
        University university = new University("Tech University");

        // Creating departments
        UniDepartment csDepartment = new UniDepartment("Computer Science");
        UniDepartment eeDepartment = new UniDepartment("Electrical Engineering");

        // Creating faculty members (they can exist independently)
        Faculty professorA = new Faculty("Dr. Smith");
        Faculty professorB = new Faculty("Dr. Johnson");
        Faculty professorC = new Faculty("Dr. Williams");

        // Adding faculty members to departments
        csDepartment.addFaculty(professorA);
        csDepartment.addFaculty(professorB);
        eeDepartment.addFaculty(professorC);

        // Adding departments to university (composition)
        university.addDepartment(csDepartment);
        university.addDepartment(eeDepartment);

        // Display university details
        university.displayUniversityDetails();
    }
}
