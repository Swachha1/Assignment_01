# Assignment 01 – Report
## University Management System (OOP in Java)

---

### 1. Abstract Class Usage

`UniversityMember` is declared abstract and contains:
- Shared attributes: `memberId`, `name`
- Concrete method: `displayBasicInfo()`
- Abstract method: `performDuty()` — forces every subclass to provide its own implementation

No object of `UniversityMember` can be instantiated directly, ensuring it acts only as a blueprint.

---

### 2. Multilevel Inheritance

```
UniversityMember  (abstract)
      └── Employee             [+ salary]
              └── AcademicStaff        [+ department]
                      └── Professor            [+ researchArea, publications, researchGrant]
```

Each level adds new attributes and methods while reusing the parent's constructor via `super(...)`.

Additionally, `AdministrativeOfficer` extends `Employee` directly (separate branch).

---

### 3. Dynamic Binding (Runtime Polymorphism)

In `Main.java`, all objects are stored in:
```java
ArrayList<UniversityMember> members;
```

When `member.performDuty()` is called in a loop, Java's JVM resolves the correct overridden version at **runtime** based on the actual object type — not the reference type. This is dynamic binding.

---

### 4. Why Downcasting is Necessary

`showResearchProfile()` is **only defined in `Professor`**, not in `UniversityMember` or `Employee`. Since the collection holds `UniversityMember` references, the compiler does not know the object is a `Professor`.

Downcasting with `instanceof` check safely converts the reference:
```java
if (member instanceof Professor) {
    Professor p = (Professor) member;
    p.showResearchProfile();
}
```

Without downcasting, professor-specific data is inaccessible through the superclass reference.

---

### 5. Future Extensibility

| Extension | How |
|---|---|
| Add `LabEngineer` or `Librarian` | Extend `Employee`, override `performDuty()` |
| Add leave/attendance system | Add abstract `applyLeave()` to `UniversityMember` |
| Persist data | Implement `Serializable` on each class |
| GUI integration | Wrap objects in MVC controllers |
| Role-based access | Add `getRole()` in `UniversityMember`, use in auth layer |

The design follows **Open/Closed Principle** — open for extension, closed for modification.
