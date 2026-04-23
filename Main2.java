// Employee.java
class Employee {
    // Data members (Encapsulation)
    private int empId;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters and Setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee details
    public void displayInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
        System.out.println("Salary     : ₹" + salary);
        System.out.println("---------------------------");
    }
}

// Main.java
public class Main2 {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee(101, "Suraj Sauray", "Software", 55000);
        Employee emp2 = new Employee(102, "Ravi Kumar", "HR", 45000);

        // Display employee info
        emp1.displayInfo();
        emp2.displayInfo();

        // Update salary using setter
        emp1.setSalary(60000);
        System.out.println("After salary update:");
        emp1.displayInfo();
    }
}
