import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        String nesho = "Computer";
        System.out.println("Original: " + nesho);
        System.out.println("In small letters: " + nesho.toLowerCase(Locale.ROOT));
        System.out.println("In capital letters: " + nesho.toUpperCase(Locale.ROOT));
        System.out.println("length: " + nesho.length());
        System.out.println("First Letter: " + nesho.charAt(0));
        System.out.println("Last Letter: " + nesho.charAt(nesho.length()-1));
        System.out.println("Middle Letter: " + nesho.charAt(nesho.length()/2));

        if(nesho.startsWith("Com")) {
            System.out.println("The word starts with 'Com': true");
        } else {
            System.out.println("The word starts with 'Com': false");
        }

        if(nesho.endsWith("ion")) {
            System.out.println("The word ends with 'ion': true");
        } else {
            System.out.println("The word ends with 'ion': false");
        }

        String other = nesho.substring(0,1);
        System.out.println("The first two letters are: " + other);

        nesho = nesho.replace("e", "o");
        System.out.println("Swapping e with o: " + nesho);

        nesho = nesho.replace("Compu", "Calcula");
        System.out.println("Swapping Comp with Calcula: " + nesho);
    }
}
