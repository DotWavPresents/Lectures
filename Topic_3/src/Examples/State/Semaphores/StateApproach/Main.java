package Examples.State.Semaphores.StateApproach;

public class Main {

    public static void main(String[] args) {
        Semaphore light = new Semaphore();
        System.out.println("Light status: " + light.status());
        light.off();
        light.panic();
        light.on();
        light.tick();
        light.tick();
        light.tick();
        light.tick();
        light.canPeopleCross();
        light.canCarsPass();
        light.panic();
        light.canPeopleCross();
        light.canCarsPass();
        light.off();
        light.on();
        light.off();
    }
}
