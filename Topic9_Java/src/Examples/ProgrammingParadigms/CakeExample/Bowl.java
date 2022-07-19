package Examples.ProgrammingParadigms.BadCakeExample.CakeExample;

public class Bowl {

    private double flourWeight;
    private double eggs;
    private double milkLiters;
    private int blueberryAmount;
    private boolean isMixed = false;

    public double getFlourWeight() {
        return flourWeight;
    }

    public void addFlourWeight(double flourWeight) {
        this.flourWeight += flourWeight;
    }

    public double getEggs() {
        return eggs;
    }

    public void addEggs(double eggs) {
        this.eggs += eggs;
    }

    public double getMilkLiters() {
        return milkLiters;
    }

    public void addMilkLiters(double milkLiters) {
        this.milkLiters += milkLiters;
    }

    public int getBlueberryAmount() {
        return blueberryAmount;
    }

    public void addBlueberryAmount(int blueberryAmount) {
        this.blueberryAmount += blueberryAmount;
    }

    public boolean isMixed() {
        return isMixed;
    }

    public void setMixed(boolean mixed) {
        isMixed = mixed;
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
