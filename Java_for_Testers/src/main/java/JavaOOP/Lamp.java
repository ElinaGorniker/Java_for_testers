package JavaOOP;

public class Lamp {
    boolean lightStatus = false;
    private String roomName;

    public Lamp (String room) {
        System.out.println("Create the object");
        roomName = room;

    } // Constructor

    public boolean isLightStatus() {
        if(lightStatus) {
            System.out.println("The lamp os ON");
        } else {
            System.out.println("The lamp os OFF");
        }


        return false;
    }
}
