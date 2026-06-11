// Abstract base class for all university personnel
public abstract class UniversityMember {
    protected String memberId;
    protected String name;

    public UniversityMember(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public void displayBasicInfo() {
        System.out.println("ID: " + memberId + " | Name: " + name);
    }

    public abstract void performDuty();
}
