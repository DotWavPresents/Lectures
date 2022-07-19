package Examples.ProgrammingParadigms.CakeExample;

public class Main {

    public static void main(String[] args) {
        // The cake making algorithm/recipe

        Baker jordan = new Baker();
        // Fetching the baking accessories
        Bowl bowl = new Bowl();
        Mold mold = new Mold();

        // Adding flour, eggs and milk
        jordan.addIngredients(bowl);
        jordan.mix(bowl);
        jordan.pourInMold(bowl, mold);
        jordan.putInOven(mold);
        jordan.letChill(mold, 35);

        System.out.println("Made a lovely cake! The mold contains: " + mold);

        // Making 3 blueberry muffins

        bowl = new Bowl();
        Mold mold1 = new Mold();
        Mold mold2 = new Mold();
        Mold mold3 = new Mold();

        jordan.addIngredients(bowl);
        jordan.addBlueberries(bowl, 30);
        jordan.pourInMold(bowl, mold1);
        jordan.pourInMold(bowl, mold2);
        jordan.pourInMold(bowl, mold3);
        jordan.putInOven(mold1);
        jordan.putInOven(mold2);
        jordan.putInOven(mold3);
        jordan.letChill(mold1, 20);
        jordan.letChill(mold2, 20);
        jordan.letChill(mold3, 20);

        System.out.println("Made 3 lovely muffins!");
    }
}
