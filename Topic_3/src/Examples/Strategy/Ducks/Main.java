package Examples.Strategy.Ducks;

public class Main {
    public static void main(String[] args) {
        Duck normalDuck = new Duck(new NormalQuack());
        Duck muteDuck = new Duck(new MuteQuack());
        Duck yoursoleDuck = new Duck(new YoursoleQuack());

        normalDuck.quack();
        muteDuck.quack();
        yoursoleDuck.quack();
    }
}
