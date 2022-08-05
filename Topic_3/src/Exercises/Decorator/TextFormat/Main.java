package Exercises.Decorator.TextFormat;

public class Main {

    public static void main(String[] args) {
        // TODO: Implement the missing behavior in the classes that are being used here
        TextFormatter underline = new Underline(new SimpleFormatter());
        TextFormatter italicAndBold = new Italic(new Bold(new SimpleFormatter()));
        TextFormatter spongeBob = new SpongeBobMeme(new Italic(new SimpleFormatter()));

        System.out.println("Underlined: " + underline.render("I am underlined!"));
        System.out.println("Underlined: " + italicAndBold.render("I am itallicked and bolded!"));
        System.out.println("Sponge Bob: " + spongeBob.render("I am very rich, and I'm much smarter than you, ahahaha"));

        // TODO: Create a formatter that formats text such that it appears bolded and in all caps!
        TextFormatter boldAndCaps = new SimpleFormatter();

        System.out.println("Bold and All Caps: " + boldAndCaps.render("Am I screaming?"));

        // TODO: Create a formatter that formats text such that it appears bolded and is encrypted
        TextFormatter boldedUnderlinedEncrypter = new SimpleFormatter();
        String unencryptedText = "Hello there!";
        String encryptedText = boldedUnderlinedEncrypter.render(unencryptedText);

        System.out.println("Encrypted: " + encryptedText);

        // TODO: Create a formatter that formats text such that it gets decrypted
        TextFormatter decrypted = new SimpleFormatter();

        System.out.println("Decrypted: " + decrypted.render(encryptedText));
    }
}
