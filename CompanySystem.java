import java.util.ArrayList;

// Company class demonstrating Composition
class Company {
    private String companyName;
    ArrayList<Department> departments; // Composition: Company owns Departments

    // Constructor
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Method to display company details
    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }
}

// Department class demonstrating Composition
class Department {
    private String departmentName;
    private ArrayList<Employee> employees; // A Department owns Employees

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Method to add an employee to the department
    public void addEmployee(String name, String designation) {
        employees.add(new Employee(name, designation));
    }

    // Method to display department details
    public void displayDepartmentDetails() {
        System.out.println("Department: " + departmentName);
        for (Employee employee : employees) {
            employee.displayEmployeeDetails();
        }
    }
}

// Employee class
class Employee {
    private String name;
    private String designation;

    // Constructor
    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee: " + name + ", Designation: " + designation);
    }
}

// Main class to demonstrate composition
public class CompanySystem {
    public static void main(String[] args) {
        // Creating a company
        Company company = new Company("Tech Innovations Ltd.");

        // Adding departments
        company.addDepartment("Engineering");
        company.addDepartment("Marketing");

        // Adding employees to departments
        company.departments.get(0).addEmployee("Alice Johnson", "Software Engineer");
        company.departments.get(0).addEmployee("Bob Smith", "Data Scientist");
        company.departments.get(1).addEmployee("Charlie Brown", "Marketing Manager");

        // Displaying company details
        company.displayCompanyDetails();
    }
}
