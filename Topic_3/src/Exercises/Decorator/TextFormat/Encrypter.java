package Exercises.Decorator.TextFormat;

public class Encrypter extends FormatDecorator {

    public Encrypter(TextFormatter item) {
        super(item);
    }

    @Override
    public String render(String text) {
        String unencrypted = super.render(text);
        StringBuilder encrypted = new StringBuilder();

        for(int i = 0; i < unencrypted.length(); i++) {
            encrypted.append((char) (unencrypted.charAt(i) + 5));
        }

        return encrypted.toString();
    }
}
