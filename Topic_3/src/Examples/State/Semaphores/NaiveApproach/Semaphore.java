package Examples.State.Semaphores.NaiveApproach;

public class Semaphore {

    private State state;

    public Semaphore() {
        state = State.BLINKING;
    }

    public void on() {
        System.out.print("[" + status() + "]");

        if(state == State.BLINKING || state == State.PANIC) {
            setState(State.RED);
        }

        System.out.println(" --(on)-> [" + status() + "]");
    }

    public void off() {
        System.out.print("[" + status() + "]");

        if(state != State.PANIC) {
            setState(State.BLINKING);
        }

        System.out.println(" --(off)-> [" + status() + "]");
    }

    public void panic() {
        System.out.print("[" + status() + "]");

        setState(State.PANIC);

        System.out.println(" --(panic)-> [" + status() + "]");
    }

    public void tick() {
        System.out.print("[" + status() + "]");

        switch (state) {
            case GREEN -> setState(State.YELLOW);
            case YELLOW -> setState(State.RED);
            case RED -> setState(State.GREEN);
        }

        System.out.println(" --(tick)-> [" + status() + "]");
    }

    public void canPeopleCross() {
        System.out.println("Can people pass? " + (state == State.RED || state == State.PANIC || state == State.BLINKING));
    }

    public void canCarsPass() {
        System.out.println("Can cars pass? " + (state == State.GREEN || state == State.YELLOW || state == State.BLINKING));
    }

    private void setState(State state) {
        this.state = state;
    }

    public String status() {
        return state.getName();
    }
}
