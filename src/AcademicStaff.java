// Level 3: Extends Employee
public class AcademicStaff extends Employee {
    protected String department;

    public AcademicStaff(String memberId, String name, double salary, String department) {
        super(memberId, name, salary);
        this.department = department;
    }

    public void showDepartment() {
        System.out.println("Department: " + department);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is conducting academic activities in " + department + ".");
    }
}
