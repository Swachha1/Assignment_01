// Level 2: Extends UniversityMember
public class Employee extends UniversityMember {
    protected double salary;

    public Employee(String memberId, String name, double salary) {
        super(memberId, name);
        this.salary = salary;
    }

    public void showSalary() {
        System.out.println("Salary: $" + salary);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is performing general employee duties.");
    }
}
