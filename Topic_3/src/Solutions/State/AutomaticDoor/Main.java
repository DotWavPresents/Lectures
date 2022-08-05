package Solutions.State.AutomaticDoor;

public class Main {

    public static void main(String[] args) {
        Door door = new Door();   // Closed
        door.click();
        door.complete();
        door.timeout();
        door.click();
        door.status();
        door.complete();
        door.click();
        door.click();
        door.click();
        door.complete();
        door.timeout();
        door.complete();
    }
}
