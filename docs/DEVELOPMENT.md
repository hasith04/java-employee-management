# Development Guide

## Quick Start for Developers

### 1. Clone & Setup
```bash
git clone <repository-url>
cd java-employee-management
```

### 2. Compile
```bash
cd src/main/java
javac Employee.java EmployeeService.java Main.java
```

### 3. Run
```bash
java Main
```

## Code Standards

### Java Naming Conventions
- **Classes**: PascalCase, nouns
  - ✅ `EmployeeService`
  - ❌ `employeeService`, `employee_service`

- **Methods**: camelCase, verbs
  - ✅ `addEmployee()`, `deleteEmployee()`
  - ❌ `AddEmployee()`, `add_employee()`

- **Variables**: camelCase, descriptive
  - ✅ `employeeId`, `department`
  - ❌ `id`, `dept`, `d`

- **Constants**: UPPER_SNAKE_CASE
  - ✅ `DEFAULT_SALARY`, `MAX_EMPLOYEES`
  - ❌ `defaultSalary`, `MAX_EMPS`

### Code Style Guidelines

1. **Indentation**: Use 4 spaces (or set IDE to 4-space tabs)
2. **Line Length**: Keep lines ≤100 characters
3. **Braces**: Opening brace on same line
   ```java
   if (condition) {
       // code
   }
   ```
4. **Comments**: Use for complex logic
   ```java
   // Simple validation
   if (age < 0) {
       return false;
   }
   ```

5. **JavaDoc**: Use for public methods
   ```java
   /**
    * Adds a new employee to the system.
    * 
    * @param employee The employee to add
    * @throws IllegalArgumentException if employee ID already exists
    */
   public void addEmployee(Employee employee) {
       // implementation
   }
   ```

### Error Handling Best Practices

- Use meaningful exception messages
- Catch specific exceptions, not generic Exception
- Always clean up resources (close Scanner, etc.)
  ```java
  try {
      // code
  } catch (NumberFormatException e) {
      System.out.println("Invalid input: " + e.getMessage());
  }
  ```

## Git Workflow

### Branch Naming
```
feature/feature-name          # New features
bugfix/bug-description        # Bug fixes
docs/documentation-update     # Documentation
refactor/improvement-area     # Code refactoring
```

### Commit Messages
Use clear, concise commit messages:
```
✅ Good:
  "Add search employees by department feature"
  "Fix input validation for salary field"
  "Update README with installation steps"

❌ Avoid:
  "Update"
  "Fix stuff"
  "asdf"
```

### Pull Request Process
1. Create feature branch
2. Make changes
3. Test locally
4. Commit with clear messages
5. Push to branch
6. Create pull request
7. Address review comments
8. Merge when approved

## Testing Guidelines

### Manual Testing Checklist
- [ ] Add new employee
- [ ] View specific employee
- [ ] Update employee details
- [ ] Delete employee
- [ ] View all employees
- [ ] Test invalid inputs
- [ ] Test edge cases (empty input, duplicate IDs)

### Test Cases
```
Test: Add Employee with Valid Data
Input: ID=105, Name="John", Age=28, Designation="Dev", Department="IT", Salary=50000
Expected: Success message

Test: Add Employee with Duplicate ID
Input: ID=101 (already exists)
Expected: Error message "Employee with that ID already exists"

Test: Add Employee with Invalid Age
Input: Age="abc"
Expected: Error message, retry prompt

Test: Update Non-existent Employee
Input: ID=999
Expected: "Employee with this ID is not present"

Test: Delete Employee
Input: ID=101
Expected: Success message, employee removed

Test: View All Employees
Expected: List of all employees displayed
```

## Building & Packaging

### Create Executable JAR
```bash
cd src/main/java
javac Employee.java EmployeeService.java Main.java
jar cfe ../../bin/EmployeeManagement.jar Main *.class
```

### Run JAR
```bash
java -jar bin/EmployeeManagement.jar
```

## Code Review Checklist

- [ ] Code follows naming conventions
- [ ] Logic is clear and maintainable
- [ ] Error handling is proper
- [ ] No hardcoded values (use constants)
- [ ] Comments explain complex logic
- [ ] Tests pass locally
- [ ] No unused imports or variables
- [ ] Documentation is updated

## Common Issues & Solutions

### Issue: ClassNotFoundException
```
Solution: Ensure .class files are in same directory as Main.class
          Compile all files together: javac *.java
```

### Issue: InputMismatchException
```
Solution: The code uses nextLine() for all input
          User input is properly handled
```

### Issue: Employee data not persisting
```
Solution: This is expected - data is in-memory only
          To persist: Implement file I/O or database
```

## Performance Optimization

Current implementation uses HashMap for O(1) lookups:
- Employee lookup by ID: O(1)
- Adding employee: O(1)
- Deleting employee: O(1)
- Viewing all: O(n)

No optimization needed for current scale.

## Security Considerations

### Current Limitations
- No authentication/authorization
- No input sanitization
- No data encryption

### For Production Use
- Add user authentication
- Validate all inputs
- Encrypt sensitive data (passwords, salaries)
- Use database with proper access control
- Add logging and audit trails

## Documentation Standards

### README Updates
When adding features, update README.md with:
- Feature description
- Usage examples
- New menu option (if applicable)

### Code Comments
```java
// Use single-line comments for brief explanations
// Use multi-line comments for complex logic

/*
 * Use JavaDoc for public classes and methods
 * Include @param, @return, @throws tags
 */
```

## Future Improvements

Priority order:
1. **Database Integration** - Persist data
2. **GUI** - Swing/JavaFX interface
3. **Search/Filter** - Find employees by criteria
4. **Reporting** - Generate reports
5. **REST API** - Web service access
6. **Unit Tests** - JUnit framework

## Resources

- [Java Documentation](https://docs.oracle.com/javase/)
- [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
- [Oracle Naming Conventions](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)
- [Git Branching Model](https://nvie.com/posts/a-successful-git-branching-model/)

## Questions?

- Check existing code for patterns
- Review commit history for similar changes
- Ask in project discussions
- Refer to documentation in /docs folder
