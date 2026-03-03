public class Member {
    private String name;
    private int memberID;
    private String membershipType;
    private int totalVisits;
    private Trainer assignedTrainer;

    public Member(String name, int memberID, String membershipType) {
        this.name = name;
        this.memberID = memberID;
        this.membershipType = membershipType;
        this.assignedTrainer = null;
    }

    public void displayMemberInfo() {
        System.out.println("Name: " + name +
                " | ID: " + memberID +
                " | Type: " + membershipType);
    }

    public String getName() {
        return name;
    }

    public int getMemberID() {
        return memberID;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public int getTotalVisits() {
        return totalVisits;
    }

    public Trainer getAssignedTrainer() {
        return assignedTrainer;
    }

    public void assignTrainer(Trainer trainer){
        this.assignedTrainer = trainer;
        trainer.addClient();
        System.out.println(name + " is training with " + trainer.getName());
    }

    void setName(String name) {
        this.name = name;
    }

    void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public void checkIn(){
        totalVisits++;
        System.out.println(name + " checked in | number check in: " + totalVisits);
    }
}