package Examples.State.Semaphores.StateApproach;

public class Panic extends State {

    protected Panic(Semaphore semaphore) {
        super(semaphore);
    }

    @Override
    public void tick() {
        // Ignoring ticks
    }

    @Override
    public void off() {
        // Do nothing
    }

    @Override
    public void on() {
        semaphore.setState(new Red(semaphore));
    }

    @Override
    public void panic() {
        // Do nothing. Already in panic
    }

    @Override
    public String status() {
        return "Panic";
    }

    @Override
    public String color() {
        return "Red";
    }

    @Override
    public boolean canPeopleCross() {
        return true;
    }

    @Override
    public boolean canCarsPass() {
        return false;
    }
}
