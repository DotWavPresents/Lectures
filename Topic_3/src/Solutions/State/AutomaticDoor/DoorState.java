package Solutions.State.AutomaticDoor;

public abstract class DoorState {
    protected Door door;

    public DoorState(Door door) { this.door = door; }

    public abstract void click();

    public void timeout()  {
        // Do nothing by default
    }
    public void complete() {
        // Do nothing by default
    }

    public abstract String status();



    // Inner classes:

    public static class DoorOpen extends DoorState {
        public DoorOpen(Door door) {
            super(door);
        }

        @Override
        public void click() {
            door.setState(new DoorStayOpen(door));
        }

        @Override
        public void timeout() {
            door.setState(new DoorClosing(door));
        }

        @Override
        public String status() {
            return "Opened";
        }
    }

    public static class DoorOpening extends DoorState {
        public DoorOpening(Door door) {
            super(door);
        }

        @Override
        public void click() {
            door.setState(new DoorClosing(door));
        }

        @Override
        public void complete() {
            door.setState(new DoorOpen(door));
        }

        @Override
        public String status() {
            return "Opening";
        }
    }

    public static class DoorClosed extends DoorState {
        public DoorClosed(Door door) {
            super(door);
        }

        @Override
        public void click() {
            door.setState(new DoorOpening(door));
        }

        @Override
        public String status() {
            return "Closed";
        }
    }

    public static class DoorClosing extends DoorState {
        public DoorClosing(Door door) { super(door); }

        @Override
        public void click() {
            door.setState(new DoorOpening(door));
        }

        @Override
        public void complete() {
            door.setState(new DoorClosed(door));
        }

        @Override
        public String status() {
            return "Closing";
        }
    }

    public static class DoorStayOpen extends DoorState {
        public DoorStayOpen(Door door) {
            super(door);
        }

        @Override
        public void click() {
            door.setState(new DoorClosing(door));
        }

        @Override
        public String status() {
            return "Staying opened";
        }
    }
}
