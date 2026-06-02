# User Guide - Employee Management System

## Table of Contents
1. [Getting Started](#getting-started)
2. [Menu Navigation](#menu-navigation)
3. [Detailed Operations](#detailed-operations)
4. [Tips & Tricks](#tips--tricks)
5. [Troubleshooting](#troubleshooting)
6. [Data Entry Examples](#data-entry-examples)

## Getting Started

### Requirements
- Java Runtime Environment (JRE) version 8 or higher
- Command line interface (Terminal, CMD, PowerShell)
- Basic understanding of Java applications

### Starting the Application

#### Windows
```powershell
cd path\to\java-employee-management\src\main\java
java Main
```

#### macOS/Linux
```bash
cd path/to/java-employee-management/src/main/java
java Main
```

After launching, you'll see the main menu.

## Menu Navigation

### Main Menu Structure
```
████████████████████████████████████████████████████████████████
         Welcome To Employee Management System
████████████████████████████████████████████████████████████████
1. Add Employee
2. View Employee
3. Update Employee
4. Delete Employee
5. View All Employees
6. Exit

Enter your choice: _
```

### How to Choose Options
1. Read all available options
2. Enter the number (1-6) corresponding to your choice
3. Press Enter
4. Follow the prompts

### Example Navigation
```
Enter your choice: 1
--- Add Employee ---
[System will then guide you through adding an employee]
```

## Detailed Operations

### 1. Add Employee

**Purpose**: Register a new employee in the system

**When to Use**: 
- Hiring new employees
- Onboarding new staff members
- Testing the system with new data

**Step-by-Step Process**:

1. Select option `1` from main menu
2. Enter unique employee ID (must not exist)
   - Example: `105`, `206`, `1001`
   - Validation: Must be a whole number
3. Enter employee name
   - Example: `John Doe`, `Raj Kumar`, `Alice Smith`
4. Enter age
   - Example: `28`, `35`, `24`
   - Validation: Must be a whole number
5. Enter designation (job title)
   - Example: `Senior Developer`, `QA Engineer`, `Team Lead`
6. Enter department
   - Example: `IT`, `Finance`, `HR`, `Sales`
7. Enter salary
   - Example: `50000`, `75000.50`, `100000`
   - Validation: Must be a number (can include decimals)

**What Happens Next**:
- System confirms: "Employee added successfully."
- Returns to main menu
- Employee is now available in the system

**Example Session**:
```
--- Add Employee ---
Enter employee ID: 105
Enter employee name: John Doe
Enter employee age: 28
Enter designation: Senior Developer
Enter department: IT
Enter salary: 75000
Employee added successfully.

*** Menu returns ***
```

**Error Scenarios**:
- **Invalid ID**: Already exists
  ```
  An employee with that ID already exists.
  (Returns to main menu)
  ```
- **Invalid Age/Salary**: Not a number
  ```
  Please enter a valid integer value. / numeric value.
  (Prompts again for input)
  ```

---

### 2. View Employee

**Purpose**: Display details of a specific employee

**When to Use**:
- Look up individual employee information
- Verify employee details
- Check single employee's record

**Step-by-Step Process**:

1. Select option `2` from main menu
2. Enter the employee ID to search for
   - Example: `101`, `105`, `102`

**What Happens**:
- If found: Displays employee information in format
  ```
  Employee{id=101, name='John', age=28, designation='Senior Developer', department='IT', salary=75000.00}
  ```
- If not found: Shows error message
  ```
  Employee with this ID is not present.
  ```
- Returns to main menu

**Example Session - Success**:
```
--- View Employee ---
Enter employee ID: 101
Employee{id=101, name='Shital', age=24, designation='Developer', department='IT', salary=25000.00}

*** Menu returns ***
```

**Example Session - Not Found**:
```
--- View Employee ---
Enter employee ID: 999
Employee with this ID is not present.

*** Menu returns ***
```

---

### 3. Update Employee

**Purpose**: Modify existing employee information

**When to Use**:
- Update salary after promotion
- Change department assignment
- Correct employee information
- Modify job designation

**Step-by-Step Process**:

1. Select option `3` from main menu
2. Enter the employee ID to update
   - Example: `101`
3. For each field, enter new value or press Enter to keep current:
   - Name: Press Enter to skip
   - Age: Press Enter to skip
   - Designation: Press Enter to skip
   - Department: Press Enter to skip
   - Salary: Press Enter to skip

**What Happens**:
- Only changed fields are updated
- Unchanged fields retain their original values
- System confirms: "Employee details updated successfully."
- Shows updated employee information
- Returns to main menu

**Example Session - Partial Update**:
```
--- Update Employee ---
Enter employee ID to update: 101
Enter new name (or press Enter to keep current): 
Enter new age (or press Enter to keep current): 
Enter new designation (or press Enter to keep current): Senior Developer
Enter new department (or press Enter to keep current): 
Enter new salary (or press Enter to keep current): 30000
Employee details updated successfully.
Employee{id=101, name='Shital', age=24, designation='Senior Developer', department='IT', salary=30000.00}

*** Menu returns ***
```

**Example Session - Full Update**:
```
--- Update Employee ---
Enter employee ID to update: 102
Enter new name (or press Enter to keep current): Meena Sharma
Enter new age (or press Enter to keep current): 27
Enter new designation (or press Enter to keep current): Senior Tester
Enter new department (or press Enter to keep current): QA
Enter new salary (or press Enter to keep current): 65000
Employee details updated successfully.
Employee{id=102, name='Meena Sharma', age=27, designation='Senior Tester', department='QA', salary=65000.00}

*** Menu returns ***
```

**Error Scenarios**:
```
--- Update Employee ---
Enter employee ID to update: 999
Employee with this ID is not present.

*** Menu returns ***
```

---

### 4. Delete Employee

**Purpose**: Remove an employee from the system

**When to Use**:
- Employee resignation/termination
- Remove duplicate records
- Clean up test data

**⚠️ Warning**: This action cannot be undone! Data is permanently removed.

**Step-by-Step Process**:

1. Select option `4` from main menu
2. Enter the employee ID to delete
   - Example: `105`

**What Happens**:
- If found: Removes employee and shows "Employee deleted successfully."
- If not found: Shows "Employee with this ID is not present."
- Returns to main menu

**Example Session - Successful Deletion**:
```
--- Delete Employee ---
Enter employee ID to delete: 105
Employee deleted successfully.

*** Menu returns ***
```

**Example Session - Employee Not Found**:
```
--- Delete Employee ---
Enter employee ID to delete: 999
Employee with this ID is not present.

*** Menu returns ***
```

---

### 5. View All Employees

**Purpose**: Display complete list of all registered employees

**When to Use**:
- Review entire employee database
- Generate staff report
- Check all department members
- System audit

**Step-by-Step Process**:

1. Select option `5` from main menu
2. No additional input required
3. All employees display automatically

**What Happens**:
- Lists all registered employees (one per line)
- Shows employee count indirectly (number of lines)
- Returns to main menu

**Example Output**:
```
--- View All Employees ---
Employee{id=101, name='Shital', age=24, designation='Developer', department='IT', salary=25000.00}
Employee{id=102, name='Meena', age=26, designation='Tester', department='CO', salary=57000.00}
Employee{id=103, name='Bob', age=20, designation='DevOps Engineer', department='Admin', salary=5000.00}
Employee{id=104, name='Max', age=27, designation='System Engineer', department='CO', salary=70000.00}

*** Menu returns ***
```

**Empty Database Output**:
```
--- View All Employees ---
No employees are currently registered.

*** Menu returns ***
```

---

### 6. Exit

**Purpose**: Close the application gracefully

**When to Use**:
- Finished with employee management tasks
- End of workday
- System maintenance

**Step-by-Step Process**:

1. Select option `6` from main menu
2. System displays: "Thank you for using the Employee Management System."
3. Application closes

**Example**:
```
Enter your choice: 6
Thank you for using the Employee Management System.

[Application ends - return to command prompt]
```

---

## Tips & Tricks

### Tip 1: Quick Navigation
- Use short, distinct employee IDs (1-100) for easy recall
- Example: 101, 102, 103 instead of 10001, 10002

### Tip 2: Organizing Data Entry
- Name format: "FirstName LastName" for consistency
- Designation: Use standard titles (Developer, Manager, Tester)
- Department: Keep it short (IT, HR, Finance, Sales)

### Tip 3: Salary Entry
- Use round numbers or realistic decimals
- Example: 50000, 75000.50 (not 74999.99)

### Tip 4: Smart Updates
- You don't need to remember exact values
- Use "View Employee" first, then "Update Employee"
- Only change what's necessary

### Tip 5: Review Before Deleting
- "View Employee" to confirm details
- Then "Delete Employee" when sure

### Tip 6: Data Exploration
- Use "View All Employees" to understand current data
- Then perform specific operations

---

## Troubleshooting

### Problem: Application won't start
**Error**: "java: command not found"
**Solution**:
1. Check Java is installed: `java -version`
2. If not, download from oracle.com/java
3. Ensure you're in correct directory

### Problem: Invalid input error keeps appearing
**Example**: 
```
Please enter a valid integer value.
Please enter a valid integer value.
```
**Solution**: 
- Enter only numbers for ID and age
- Press Enter for name and designation
- Use numbers or decimals for salary

### Problem: "Employee with this ID already exists"
**When trying to add**: New employee ID already in system
**Solution**: 
1. Use "View All Employees" to see existing IDs
2. Choose a different ID number

### Problem: Cannot find an employee
**Solution**:
1. Check the exact ID using "View All Employees"
2. Verify correct spelling if searching by other fields
3. Confirm employee wasn't deleted

### Problem: Made a mistake while entering data
**Solution for adding**: Press Ctrl+C to exit, restart application
**Solution for updates**: "Update Employee" to correct the information

---

## Data Entry Examples

### Example 1: Adding Finance Staff
```
Menu choice: 1

--- Add Employee ---
Enter employee ID: 201
Enter employee name: Priya Singh
Enter employee age: 32
Enter designation: Finance Manager
Enter department: Finance
Enter salary: 85000
Employee added successfully.
```

### Example 2: Adding Multiple IT Staff
```
Employee 1:
ID: 301, Name: Arun Kumar, Age: 26, Designation: Junior Developer, Department: IT, Salary: 40000

Employee 2:
ID: 302, Name: Neha Patel, Age: 28, Designation: Senior Developer, Department: IT, Salary: 65000

Employee 3:
ID: 303, Name: Vikram Singh, Age: 30, Designation: Tech Lead, Department: IT, Salary: 95000
```

### Example 3: Update on Promotion
```
Menu choice: 3

--- Update Employee ---
Enter employee ID to update: 102
Enter new name (or press Enter to keep current): 
Enter new age (or press Enter to keep current): 
Enter new designation (or press Enter to keep current): Senior Tester
Enter new department (or press Enter to keep current): QA
Enter new salary (or press Enter to keep current): 60000
Employee details updated successfully.
```

---

## Sample Complete Session

```
Welcome to Employee Management System

--- Session Start ---

Choice: 5
Employee{id=101, name='John', age=24, ...}
Employee{id=102, name='Jane', age=26, ...}

Choice: 1
(Add new employee ID 103)
John Doe, 28, Senior Developer, IT, 75000

Choice: 5
(View all - now shows 3 employees including new one)

Choice: 2
(View employee 103 - confirms it was added)

Choice: 3
(Update employee 103 salary to 80000)

Choice: 6
Thank you!
```

---

## FAQs

**Q: Can I have two employees with the same ID?**
A: No. The system prevents duplicate IDs.

**Q: What happens if I close without saving?**
A: All data is lost. This is a limitation of the current version.

**Q: Can I modify an employee's ID?**
A: No. ID is permanent. You must delete and re-add to change ID.

**Q: Is there a search feature?**
A: Yes, through "View Employee" (searches by ID).

**Q: How many employees can I add?**
A: Theoretically unlimited (up to available memory).

---

**Last Updated**: June 1, 2026
**Version**: 1.0
