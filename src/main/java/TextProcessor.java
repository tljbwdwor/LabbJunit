

public class TextProcessor {

    public String upper(String string) {
        return string.toUpperCase();
    }

    public String lower(String string) {
        return string.toLowerCase();
    }

    public String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }


    public static void main(String[] args) {

        String string = "Hello there!";

        System.out.println(string);
        System.out.println(new TextProcessor().upper(string));
        System.out.println(new TextProcessor().lower(string));
        System.out.println(new TextProcessor().reverse(string));

    }

}

