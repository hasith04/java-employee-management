import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();

        while (true) {
            printMenu();
            int choice = readChoice(scanner);

            switch (choice) {
                case 1:
                    System.out.println("\n--- Add Employee ---");
                    employeeService.addEmployeeInteractive(scanner);
                    break;
                case 2:
                    System.out.println("\n--- View Employee ---");
                    employeeService.viewEmployeeInteractive(scanner);
                    break;
                case 3:
                    System.out.println("\n--- Update Employee ---");
                    employeeService.updateEmployeeInteractive(scanner);
                    break;
                case 4:
                    System.out.println("\n--- Delete Employee ---");
                    employeeService.deleteEmployeeInteractive(scanner);
                    break;
                case 5:
                    System.out.println("\n--- View All Employees ---");
                    employeeService.viewAllEmployees();
                    break;
                case 6:
                    System.out.println("Thank you for using the Employee Management System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Please enter a valid choice from 1 to 6.");
                    break;
            }
            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("**************** Welcome To Employee Management System ****************");
        System.out.println("1. Add Employee");
        System.out.println("2. View Employee");
        System.out.println("3. Update Employee");
        System.out.println("4. Delete Employee");
        System.out.println("5. View All Employees");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int readChoice(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.out.print("Invalid choice. Please enter a number between 1 and 6: ");
            }
        }
    }
}
