import java.util.ArrayList;
import java.util.List;

// Abstract Employee class
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }

    // Getters and Setters
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
}

// Department interface
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

// Full-time employee class
class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

// Part-time employee class
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, int workHours, double hourlyRate) {
        super(employeeId, name, 0);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

// Main class (public)
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee(101, "Alice", 5000);
        fte.assignDepartment("HR");

        PartTimeEmployee pte = new PartTimeEmployee(102, "Bob", 80, 20);
        pte.assignDepartment("IT");

        employees.add(fte);
        employees.add(pte);

        // Polymorphic processing
        for (Employee emp : employees) {
            emp.displayDetails();
            if (emp instanceof Department deptEmp) {
                System.out.println("Department: " + deptEmp.getDepartmentDetails());
            }
            System.out.println("---------------------");
        }
    }
}