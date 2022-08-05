package Solutions.Decorator.TextFormat;

public class Main {

    public static void main(String[] args) {
        TextFormatter underline = new Underline(new SimpleFormatter());
        TextFormatter italicAndBold = new Italic(new Bold(new SimpleFormatter()));
        TextFormatter spongeBob = new SpongeBobMeme(new Italic(new SimpleFormatter()));

        System.out.println("Underlined: " + underline.render("I am underlined!"));
        System.out.println("Underlined: " + italicAndBold.render("I am itallicked and bolded!"));
        System.out.println("Sponge Bob: " + spongeBob.render("I am very rich, and I'm much smarter than you, ahahaha"));


        TextFormatter boldAndCaps = new Bold(new AllCaps(new SimpleFormatter()));

        System.out.println("Bold and All Caps: " + boldAndCaps.render("Am I screaming?"));


        TextFormatter boldedUnderlinedEncrypter = new Encrypter(new Bold(new Underline(new SimpleFormatter())));
        String unencryptedText = "Hello there!";
        String encryptedText = boldedUnderlinedEncrypter.render(unencryptedText);

        System.out.println("Encrypted: " + encryptedText);

        TextFormatter decrypted = new Decrypter(new SimpleFormatter());

        System.out.println("Decrypted: " + decrypted.render(encryptedText));
    }
}
