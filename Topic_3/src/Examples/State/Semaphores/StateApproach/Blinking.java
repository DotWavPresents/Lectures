package Examples.State.Semaphores.StateApproach;

public class Blinking extends State {


    protected Blinking(Semaphore semaphore) {
        super(semaphore);
    }

    @Override
    public void tick() {
        // Ignoring ticks
    }

    @Override
    public void off() {
        // Do nothing. The semaphore is already off
    }

    @Override
    public void on() {
        semaphore.setState(new Red(semaphore));
    }

    @Override
    public String status() {
        return "Blinking";
    }

    @Override
    public String color() {
        return "Blinking Yellow";
    }

    @Override
    public boolean canPeopleCross() {
        return true;
    }

    @Override
    public boolean canCarsPass() {
        return true;
    }
}
