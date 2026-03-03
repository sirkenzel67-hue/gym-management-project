public class Trainer {
    private String name;
    private int trainerID;
    private String specialty;
    private int clientCount = 0;

    public Trainer(String name, int trainerID, String specialty) {
        this.name = name;
        this.trainerID = trainerID;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getTrainerID() {
        return trainerID;
    }

    public int getClientCount() {
        return clientCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialty() {
        this.specialty = specialty;
    }

    public void addClient() {
        clientCount++;
        System.out.println(name + " now has " + clientCount + " clients!");
    }

    public void removeClient() {
        if (clientCount > 0) {
            clientCount--;
            System.out.println(name + " now has " + clientCount + " clients!");
        } else {
            System.out.println(name + "has no clients yet");
        }
    }

    public void displayTrainerInfo() {
        System.out.println("Trainer: " + name +
                " | ID: " + trainerID +
                " | Specialty: " + specialty +
                " | Clients: " + clientCount);
    }
}