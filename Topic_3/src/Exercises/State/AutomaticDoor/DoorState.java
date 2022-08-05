package Exercises.State.AutomaticDoor;

public abstract class DoorState {
    protected Door door;

    public DoorState(Door door) { this.door = door; }

    // TODO Create missing methods



    // Inner classes:

    public static class DoorOpen extends DoorState {
        public DoorOpen(Door door) {
            super(door);
        }

        // TODO
    }

    public static class DoorOpening extends DoorState {
        public DoorOpening(Door door) {
            super(door);
        }

        // TODO
    }

    public static class DoorClosed extends DoorState {
        public DoorClosed(Door door) {
            super(door);
        }

        // TODO
    }

    public static class DoorClosing extends DoorState {
        public DoorClosing(Door door) { super(door); }

        // TODO
    }

    public static class DoorStayOpen extends DoorState {
        public DoorStayOpen(Door door) {
            super(door);
        }

        // TODO
    }
}
