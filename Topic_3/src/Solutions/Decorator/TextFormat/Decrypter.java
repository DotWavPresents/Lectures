package Solutions.Decorator.TextFormat;

public class Decrypter extends FormatDecorator {

    public Decrypter(TextFormatter item) {
        super(item);
    }

    @Override
    public String render(String text) {
        String encrypted = super.render(text);
        StringBuilder decrypted = new StringBuilder();

        for(int i = 0; i < encrypted.length(); i++) {
            decrypted.append((char) (encrypted.charAt(i) - 5));
        }

        return decrypted.toString();
    }
}
