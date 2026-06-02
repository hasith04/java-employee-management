# Project Structure & Organization Guide

## Directory Layout

```
java-employee-management/
├── src/                                 # Source code directory
│   ├── .gitignore                      # Git ignore for source files
│   └── main/
│       └── java/                       # Java source files
│           ├── Employee.java           # Employee model class
│           ├── EmployeeService.java    # Service/business logic layer
│           └── Main.java               # Application entry point
│
├── bin/                                # Output directory for compiled files
├── docs/                               # Documentation
│   └── STRUCTURE.md                   # This file
│
├── .gitignore                          # Root-level Git ignore rules
├── README.md                           # Main project documentation
├── requirements.txt                    # System requirements
└── instructions.txt                    # User instructions
```

## File Organization

### Source Code (src/main/java/)
- **Employee.java**: Data model representing an employee entity
- **EmployeeService.java**: Business logic for CRUD operations
- **Main.java**: Entry point and menu controller

### Build & Output
- **bin/**: Directory to store compiled .class files (generated after compilation)

### Documentation
- **README.md**: Comprehensive project documentation and user guide
- **STRUCTURE.md**: This file - explains project organization
- **requirements.txt**: System and software requirements
- **instructions.txt**: User operation instructions

### Version Control
- **.gitignore**: Rules to exclude files from Git tracking
- **src/.gitignore**: Additional rules for source files

## Compilation Instructions

### Windows (PowerShell):
```powershell
cd src\main\java
javac Employee.java EmployeeService.java Main.java
```

### macOS/Linux (Bash):
```bash
cd src/main/java
javac Employee.java EmployeeService.java Main.java
```

**Output**: Three .class files generated in the same directory:
- Employee.class
- EmployeeService.class
- Main.class

## Execution Instructions

### From src/main/java directory:

**Windows (PowerShell)**:
```powershell
java Main
```

**macOS/Linux (Bash)**:
```bash
java Main
```

### From root directory:

**Windows (PowerShell)**:
```powershell
cd src\main\java
java Main
```

**macOS/Linux (Bash)**:
```bash
cd src/main/java
java Main
```

## Architecture Overview

### Three-Tier Architecture

```
Main.java (Presentation/UI Layer)
    ↓
EmployeeService.java (Business Logic Layer)
    ↓
Employee.java (Data Model Layer)
```

### Data Flow

1. **User Input** → Main.java (reads from Scanner)
2. **Menu Processing** → Main.java (routes to appropriate method)
3. **Business Logic** → EmployeeService.java (CRUD operations)
4. **Data Model** → Employee.java (data storage)
5. **Output** → System.out (console display)

## Git Workflow

### Files to Ignore (per .gitignore)
- `*.class` - Compiled Java bytecode
- `*.log` - Log files
- `.vscode/`, `.idea/` - IDE configurations
- `bin/`, `build/`, `target/`, `out/` - Build output
- `.env` - Environment variables

### Files to Track
- All `.java` source files
- README.md and documentation
- .gitignore
- Project configuration files

## Adding New Features

### Step 1: Create Java File
Place new .java files in `src/main/java/`

### Step 2: Update Main.java
Modify the menu switch statement to route new operations

### Step 3: Implement Logic
Add methods to EmployeeService.java or create new service classes

### Step 4: Compile
```bash
javac *.java
```

### Step 5: Test
Run `java Main` and verify new functionality

## Best Practices

1. **Keep source files organized** in src/main/java/
2. **Follow Java naming conventions**:
   - Classes: PascalCase (EmployeeService)
   - Methods: camelCase (addEmployeeInteractive)
   - Constants: UPPER_SNAKE_CASE
3. **Add documentation** in README.md when adding features
4. **Run tests** before committing changes
5. **Use meaningful commit messages** in Git

## Dependencies

- **Java 8+** runtime environment
- **No external libraries** required
- Standard Java library (java.util, java.util.Scanner)

## Future Structure Enhancements

For larger projects, consider:
```
src/
├── main/
│   ├── java/
│   │   ├── com/
│   │   │   └── sj/
│   │   │       └── empmanagement/
│   │   │           ├── models/
│   │   │           ├── services/
│   │   │           ├── ui/
│   │   │           └── Main.java
│   │   └── resources/
│   │       └── config.properties
│   └── webapp/
└── test/
    └── java/
        └── com/sj/empmanagement/
```

## Troubleshooting

### "javac: command not found"
- Install JDK: Download from oracle.com/java
- Add Java to PATH environment variable

### "Exception in thread 'main' java.lang.NoClassDefFoundError"
- Ensure you're in the correct directory (src/main/java/)
- Run `javac *.java` to compile first

### "Cannot find symbol"
- Verify all .java files are in the same directory
- Check for typos in class names

## Contact & Support

For questions about project structure or organization:
- Review this STRUCTURE.md file
- Check README.md for additional context
- Refer to source code comments
