import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = input.nextLine();
        System.out.println("Your name is: " + name);

        System.out.println("What is your year of birth?");

        int year = Integer.parseInt(input.nextLine());
        System.out.println("Your year of birth is: " + year);

        System.out.println("What is your height in meters");

        double height = Double.parseDouble(input.nextLine());
        System.out.println("Your height in cm is: " + height * 100);
    }
}
