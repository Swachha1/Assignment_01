// Level 4: Extends AcademicStaff
public class Professor extends AcademicStaff {
    private String researchArea;
    private int publications;
    private double researchGrant;

    public Professor(String memberId, String name, double salary,
                     String department, String researchArea,
                     int publications, double researchGrant) {
        super(memberId, name, salary, department);
        this.researchArea = researchArea;
        this.publications = publications;
        this.researchGrant = researchGrant;
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is teaching and conducting research in " + researchArea + ".");
    }

    // Professor-specific method (accessed via downcasting)
    public void showResearchProfile() {
        System.out.println("--- Research Profile ---");
        System.out.println("Research Area  : " + researchArea);
        System.out.println("Publications   : " + publications);
        System.out.println("Research Grant : $" + researchGrant);
    }
}
