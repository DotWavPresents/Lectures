package Examples.Strategy.Ducks;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("*silence*");
    }
}
