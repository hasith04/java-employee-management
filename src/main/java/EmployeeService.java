import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeService {
    private final Map<Integer, Employee> employees = new HashMap<>();

    public EmployeeService() {
        addEmployee(new Employee(101, "Shital", 24, "Developer", "IT", 25000));
        addEmployee(new Employee(102, "Meena", 26, "Tester", "CO", 57000));
        addEmployee(new Employee(103, "Bob", 20, "DevOps Engineer", "Admin", 5000));
        addEmployee(new Employee(104, "Max", 27, "System Engineer", "CO", 70000));
    }

    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public void addEmployeeInteractive(Scanner scanner) {
        int id = readInt(scanner, "Enter employee ID: ");
        if (employees.containsKey(id)) {
            System.out.println("An employee with that ID already exists.");
            return;
        }

        String name = readString(scanner, "Enter employee name: ");
        int age = readInt(scanner, "Enter employee age: ");
        String designation = readString(scanner, "Enter designation: ");
        String department = readString(scanner, "Enter department: ");
        double salary = readDouble(scanner, "Enter salary: ");

        Employee employee = new Employee(id, name, age, designation, department, salary);
        addEmployee(employee);
        System.out.println("Employee added successfully.");
    }

    public void viewEmployeeInteractive(Scanner scanner) {
        int id = readInt(scanner, "Enter employee ID: ");
        Employee employee = employees.get(id);
        if (employee == null) {
            System.out.println("Employee with this ID is not present.");
            return;
        }
        System.out.println(employee);
    }

    public void updateEmployeeInteractive(Scanner scanner) {
        int id = readInt(scanner, "Enter employee ID to update: ");
        Employee employee = employees.get(id);
        if (employee == null) {
            System.out.println("Employee with this ID is not present.");
            return;
        }

        String name = readString(scanner, "Enter new name (or press Enter to keep current): ");
        if (!name.trim().isEmpty()) {
            employee.setName(name);
        }

        String ageInput = readString(scanner, "Enter new age (or press Enter to keep current): ");
        if (!ageInput.trim().isEmpty()) {
            employee.setAge(parseIntOrDefault(ageInput, employee.getAge()));
        }

        String designation = readString(scanner, "Enter new designation (or press Enter to keep current): ");
        if (!designation.trim().isEmpty()) {
            employee.setDesignation(designation);
        }

        String department = readString(scanner, "Enter new department (or press Enter to keep current): ");
        if (!department.trim().isEmpty()) {
            employee.setDepartment(department);
        }

        String salaryInput = readString(scanner, "Enter new salary (or press Enter to keep current): ");
        if (!salaryInput.trim().isEmpty()) {
            employee.setSalary(parseDoubleOrDefault(salaryInput, employee.getSalary()));
        }

        System.out.println("Employee details updated successfully.");
        System.out.println(employee);
    }

    public void deleteEmployeeInteractive(Scanner scanner) {
        int id = readInt(scanner, "Enter employee ID to delete: ");
        Employee removed = employees.remove(id);
        if (removed == null) {
            System.out.println("Employee with this ID is not present.");
            return;
        }
        System.out.println("Employee deleted successfully.");
    }

    public void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees are currently registered.");
            return;
        }
        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
    }

    private String readString(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid integer value.");
            }
        }
    }

    private double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim();
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a valid numeric value.");
            }
        }
    }

    private int parseIntOrDefault(String value, int defaultValue) {
        try {
            return Integer.parseInt(value.trim());
        } catch (NumberFormatException exception) {
            return defaultValue;
        }
    }

    private double parseDoubleOrDefault(String value, double defaultValue) {
        try {
            return Double.parseDouble(value.trim());
        } catch (NumberFormatException exception) {
            return defaultValue;
        }
    }
}
