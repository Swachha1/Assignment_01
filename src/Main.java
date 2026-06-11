import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Populate collection with different personnel types
        ArrayList<UniversityMember> members = new ArrayList<>();

        members.add(new Professor("P001", "Dr. Alice Rahman", 95000,
                "Computer Science", "Machine Learning", 42, 150000.0));

        members.add(new Professor("P002", "Dr. Karim Hossain", 88000,
                "Electrical Engineering", "Renewable Energy", 31, 120000.0));

        members.add(new AcademicStaff("A001", "Mr. Tanvir Ahmed", 55000, "Mathematics"));

        members.add(new AdministrativeOfficer("O001", "Ms. Nadia Islam", 45000,
                "Admin Block B", "HR Manager"));

        members.add(new AdministrativeOfficer("O002", "Mr. Rafiq Uddin", 40000,
                "Finance Wing", "Accounts Officer"));

        // ---- Dynamic Binding Demo ----
        System.out.println("========== DUTY REPORT ==========");
        for (UniversityMember member : members) {
            member.displayBasicInfo();
            member.performDuty(); // Runtime polymorphism
            System.out.println();
        }

        // ---- Downcasting Demo ----
        System.out.println("========== PROFESSOR RESEARCH PROFILES ==========");
        for (UniversityMember member : members) {
            if (member instanceof Professor) {
                Professor p = (Professor) member;
                p.displayBasicInfo();
                p.showResearchProfile();
                System.out.println();
            }
        }
    }
}
