package Examples.State.Semaphores.StateApproach;

public class Red extends Ticking {

    protected Red(Semaphore semaphore) {
        super(semaphore);
    }

    @Override
    public void tick() {
        semaphore.setState(new Green(semaphore));
    }

    @Override
    public String status() {
        return "Red";
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
