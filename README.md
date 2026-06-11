# Assignment 01 – University Management System

**Course:** Object-Oriented Programming Lab (Java)  
**Topic:** Abstract Class, Multilevel Inheritance, Dynamic Binding, Downcasting

## How to Compile & Run

```bash
cd src
javac *.java
java Main
```

## Class Hierarchy

```
UniversityMember (abstract)
    ├── Employee
    │     ├── AcademicStaff
    │     │       └── Professor
    │     └── AdministrativeOfficer
```

## Key Concepts Demonstrated

| Concept | Location |
|---|---|
| Abstract Class | `UniversityMember.java` |
| Multilevel Inheritance | `Employee` → `AcademicStaff` → `Professor` |
| Dynamic Binding | `Main.java` – `performDuty()` loop |
| Downcasting | `Main.java` – `instanceof Professor` block |
