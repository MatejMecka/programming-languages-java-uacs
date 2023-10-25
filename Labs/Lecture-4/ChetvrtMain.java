import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        try {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");

        int inp = Integer.parseInt(input.nextLine());
        System.out.println("Decimal: " + inp);
        System.out.println("Binary: " + Integer.toBinaryString(inp));
        System.out.println("Octal: " + Integer.toOctalString(inp));
        System.out.println("Hex: " + Integer.toHexString(inp));
        } catch (Exception err) {
            System.out.println("Exception!");
            System.out.println(err);
        }
    }
}
