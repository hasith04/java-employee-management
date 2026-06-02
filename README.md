# Employee Management System

A lightweight, console-based Employee Management System built in Java. This application provides a simple yet functional CRUD (Create, Read, Update, Delete) interface for managing employee records efficiently.

## Features

✨ **Core Functionality**
- **Add Employee**: Register new employees with unique IDs and complete details
- **View Employee**: Retrieve and display individual employee information by ID
- **Update Employee**: Modify existing employee records with optional field updates
- **Delete Employee**: Remove employees from the system
- **View All Employees**: Display a complete list of all registered employees

🎯 **Key Characteristics**
- Clean, intuitive console-based user interface
- Robust input validation and error handling
- In-memory data storage using HashMap for fast lookups
- Professional code structure with separation of concerns
- No external dependencies required

## Project Structure

```
java-employee-management/
├── src/
│   └── main/
│       └── java/
│           ├── Employee.java           # Employee data model
│           ├── EmployeeService.java    # Business logic and CRUD operations
│           └── Main.java               # Entry point and menu controller
├── bin/                                 # Compiled class files
├── docs/                                # Documentation
├── .gitignore                          # Git ignore rules
├── README.md                           # This file
├── requirements.txt                    # Project requirements
└── instructions.txt                    # User instructions
```

## Prerequisites

- **Java Runtime Environment (JRE)**: Java 8 or higher
- **Java Development Kit (JDK)**: For compilation (optional)
- **Operating System**: Windows, macOS, or Linux
- **Terminal/Command Prompt**: For running the application

## Installation & Setup

### Option 1: Using Command Line (Windows)

1. **Navigate to the project directory**:
   ```powershell
   cd "path\to\java-employee-management"
   ```

2. **Compile the Java files**:
   ```powershell
   cd src\main\java
   javac Employee.java EmployeeService.java Main.java
   ```

3. **Run the application**:
   ```powershell
   java Main
   ```

### Option 2: Using Command Line (macOS/Linux)

1. **Navigate to the project directory**:
   ```bash
   cd path/to/java-employee-management
   ```

2. **Compile the Java files**:
   ```bash
   cd src/main/java
   javac Employee.java EmployeeService.java Main.java
   ```

3. **Run the application**:
   ```bash
   java Main
   ```

### Option 3: Using an IDE

1. Open your IDE (Eclipse, IntelliJ IDEA, VS Code, etc.)
2. Create a new Java project
3. Copy the source files from `src/main/java/` to your project's source directory
4. Build and run the project from your IDE

## Usage Guide

### Main Menu

When you launch the application, you'll see the following menu:

```
**************** Welcome To Employee Management System ****************
1. Add Employee
2. View Employee
3. Update Employee
4. Delete Employee
5. View All Employees
6. Exit
Enter your choice:
```

### Menu Operations

#### 1. Add Employee
- Prompts you to enter a unique employee ID
- Collects employee details: name, age, designation, department, and salary
- Validates input to ensure data integrity
- Confirms successful addition

**Example**:
```
--- Add Employee ---
Enter employee ID: 105
Enter employee name: John Doe
Enter employee age: 28
Enter designation: Senior Developer
Enter department: IT
Enter salary: 75000
Employee added successfully.
```

#### 2. View Employee
- Prompts for an employee ID
- Displays the employee's complete information if found
- Shows an error message if the ID doesn't exist

**Example**:
```
--- View Employee ---
Enter employee ID: 101
Employee{id=101, name='Shital', age=24, designation='Developer', department='IT', salary=25000.00}
```

#### 3. Update Employee
- Prompts for the employee ID to update
- Allows optional updates to each field (press Enter to skip)
- Confirms the update with new employee details

**Example**:
```
--- Update Employee ---
Enter employee ID to update: 101
Enter new name (or press Enter to keep current): Shital Kumar
Enter new age (or press Enter to keep current): 
Enter new designation (or press Enter to keep current): Senior Developer
Enter new department (or press Enter to keep current): 
Enter new salary (or press Enter to keep current): 30000
Employee details updated successfully.
Employee{id=101, name='Shital Kumar', age=24, designation='Senior Developer', department='IT', salary=30000.00}
```

#### 4. Delete Employee
- Prompts for the employee ID to remove
- Confirms deletion and removes the employee from the system
- Shows an error if the ID doesn't exist

**Example**:
```
--- Delete Employee ---
Enter employee ID to delete: 105
Employee deleted successfully.
```

#### 5. View All Employees
- Displays a complete list of all registered employees
- Shows employee details in a consistent format

**Example**:
```
--- View All Employees ---
Employee{id=101, name='Shital', age=24, designation='Developer', department='IT', salary=25000.00}
Employee{id=102, name='Meena', age=26, designation='Tester', department='CO', salary=57000.00}
Employee{id=103, name='Bob', age=20, designation='DevOps Engineer', department='Admin', salary=5000.00}
Employee{id=104, name='Max', age=27, designation='System Engineer', department='CO', salary=70000.00}
```

#### 6. Exit
- Closes the application gracefully
- Cleans up resources and exits

## Class Documentation

### Employee.java
Represents an employee entity with the following attributes:
- `id` (int): Unique identifier for the employee (immutable)
- `name` (String): Employee's full name
- `age` (int): Employee's age
- `designation` (String): Job title/position
- `department` (String): Department/team assignment
- `salary` (double): Employee's salary

**Methods**:
- Getters and setters for all mutable properties
- `equals()`: Compares employees by ID
- `hashCode()`: Generates hash code based on ID
- `toString()`: Returns formatted employee information

### EmployeeService.java
Handles all employee management operations:
- `addEmployee()`: Adds a new employee to the system
- `addEmployeeInteractive()`: Interactive method to add employee via console input
- `viewEmployeeInteractive()`: Retrieves and displays employee by ID
- `updateEmployeeInteractive()`: Updates employee details
- `deleteEmployeeInteractive()`: Removes an employee from the system
- `viewAllEmployees()`: Displays all employees

**Data Storage**: Uses `HashMap<Integer, Employee>` for O(1) lookups by employee ID

### Main.java
Application entry point and menu controller:
- `main()`: Initializes the application and manages the main menu loop
- `printMenu()`: Displays the main menu options
- `readChoice()`: Handles user input validation for menu selection

## Sample Data

The application comes pre-loaded with sample employees:

| ID  | Name   | Age | Designation      | Department | Salary |
|-----|--------|-----|------------------|------------|--------|
| 101 | Shital | 24  | Developer        | IT         | 25000  |
| 102 | Meena  | 26  | Tester           | CO         | 57000  |
| 103 | Bob    | 20  | DevOps Engineer  | Admin      | 5000   |
| 104 | Max    | 27  | System Engineer  | CO         | 70000  |

## Error Handling

The application includes comprehensive error handling:
- **Duplicate ID Prevention**: Cannot add an employee with an existing ID
- **Invalid Input Handling**: Validates numeric inputs (age, salary, ID)
- **Not Found Errors**: Gracefully handles searches for non-existent employees
- **Input Validation**: Ensures all required fields are properly filled

## Limitations

- **In-Memory Storage**: Data is not persisted to disk; all changes are lost when the application closes
- **Single User**: Console-based application designed for single-user interaction
- **No Database Integration**: Direct Java collections used instead of a database
- **No Concurrent Access**: Not designed for multi-threaded scenarios

## Future Enhancements

Potential improvements for future versions:
- Database integration (SQL/NoSQL) for data persistence
- File-based storage (JSON/CSV export/import)
- Advanced search and filtering capabilities
- Employee roles and permissions management
- Salary calculation and payroll features
- GUI implementation using Swing or JavaFX
- REST API for web-based access
- Unit testing framework integration
- Logging implementation

## Technology Stack

- **Language**: Java 8+
- **Build Tool**: None (Plain Java compilation)
- **Data Structure**: HashMap
- **I/O**: Console (System.in/System.out)

## Compilation & Execution

### Quick Start (Windows PowerShell):
```powershell
cd "src\main\java"
javac Employee.java EmployeeService.java Main.java
java Main
```

### Quick Start (macOS/Linux Bash):
```bash
cd src/main/java
javac Employee.java EmployeeService.java Main.java
java Main
```

## Contributing

This is an educational project developed as part of an internship program. Contributions are welcome! To contribute:

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly
5. Submit a pull request with a clear description

## License

This project is open source and available under the MIT License.

## Author

Developed as an internship project for educational purposes.

## Support & Contact

For issues, questions, or suggestions:
- Check the [instructions.txt](instructions.txt) file for additional information
- Review the [requirements.txt](requirements.txt) file for system requirements
- Refer to the [docs/](docs/) folder for additional documentation

## Changelog

### Version 1.0 (Current)
- Initial release
- Implemented core CRUD operations
- Added comprehensive input validation
- Created clean project structure
- Added detailed documentation

---

**Last Updated**: June 1, 2026
**Status**: Active Development
