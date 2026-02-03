class Employee {
    String name;
    double basicSalary;

    // Constructor
    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Method to calculate and display gross salary
    void calculateGrossSalary() {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        double grossSalary = basicSalary + hra + da;

        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (10%): " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class Code5 {
    public static void main(String[] args) {
        Employee emp = new Employee("Yashas", 25000);
        emp.calculateGrossSalary();
    }
}
