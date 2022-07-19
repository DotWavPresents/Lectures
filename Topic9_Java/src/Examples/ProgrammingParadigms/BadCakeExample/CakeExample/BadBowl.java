package Examples.ProgrammingParadigms.BadCakeExample.CakeExample;

public class BadBowl {

    private double flourWeight;
    private double eggs;
    private double milkLiters;
    private int blueberryAmount;
    private boolean isMixed = false;

    public double getFlourWeight() {
        return flourWeight;
    }

    public void addFlourWeight() {
        System.out.println("It shouldn't be the bowl's responsibility to add flour!");
        this.flourWeight += 1;
    }

    public double getEggs() {
        return eggs;
    }

    public void addEggs() {
        System.out.println("It shouldn't be the bowl's responsibility to add eggs!");
        this.eggs += 2;
    }

    public double getMilkLiters() {
        return milkLiters;
    }

    public void addMilkLiters() {
        System.out.println("It shouldn't be the bowl's responsibility to add milk!");
        this.milkLiters += 0.5;
    }

    public int getBlueberryAmount() {
        return blueberryAmount;
    }

    public void addBlueberryAmount() {
        System.out.println("It shouldn't be the bowl's responsibility to add blueberries!");
        this.blueberryAmount += 30;
    }

    public void addIngredients() {
        System.out.println("Good! Using procedural programming! But this shouldn't be the bowl's responsibility!");

        addFlourWeight();
        addEggs();
        addMilkLiters();
    }

    public boolean isMixed() {
        return isMixed;
    }

    public void mix() {
        System.out.println("It shouldn't be the bowl's responsibility to mix itself!");
        isMixed = true;
    }

    @Override
    public String toString() {
        return "(flourWeight=" + flourWeight +
                ", eggs=" + eggs +
                ", milkLiters=" + milkLiters +
                ", blueberryAmount=" + blueberryAmount +
                ", isMixed=" + isMixed +
                ")";
    }
}
