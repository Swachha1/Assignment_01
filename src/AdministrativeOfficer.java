// Additional subclass derived from Employee
public class AdministrativeOfficer extends Employee {
    private String officeLocation;
    private String role;

    public AdministrativeOfficer(String memberId, String name, double salary,
                                  String officeLocation, String role) {
        super(memberId, name, salary);
        this.officeLocation = officeLocation;
        this.role = role;
    }

    public void showOfficeInfo() {
        System.out.println("Role: " + role + " | Office: " + officeLocation);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is managing administrative operations as " + role + ".");
    }
}
