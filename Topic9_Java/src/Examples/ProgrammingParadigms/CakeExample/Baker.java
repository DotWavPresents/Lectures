package Examples.ProgrammingParadigms.CakeExample;

public class Baker {

    public void addIngredients(Bowl bowl) {
        System.out.println("Adding flour!");
        bowl.addFlourWeight(1); // Adding 1kg of flour
        System.out.println("Cracking eggs!");
        bowl.addEggs(2); // Adding 2 eggs
        System.out.println("Adding milk!");
        bowl.addMilkLiters(0.5); // Adding half a liter of milk
    }

    public void addBlueberries(Bowl bowl, int amount) {
        System.out.println("Adding blueberries to the bowl!");
    }

    public void mix(Bowl bowl) {
        System.out.println("Mixing the bowl's ingredients!");

        bowl.setMixed(true);
    }

    public void pourInMold(Bowl bowl, Mold mold) {
        System.out.println("Pouring the bowl's contents into a mold!");

        mold.setMixture(bowl.toString());
    }

    public void putInOven(Mold mold) {
        System.out.println("Putting the mold inside the oven!");

        mold.setHot(true);
    }

    public void letChill(Mold mold, int minutes) {
        System.out.println("Letting the mold chill for " + minutes + " minutes!");

        mold.setHot(false);
    }
}
