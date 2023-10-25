import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Double nesho = 5.0;

        // Math Functions
        double sin = Math.sin(nesho);
        double cosine = Math.cos(nesho);
        double tangent = Math.tan(nesho);
        double contagent = Math.cos(nesho) / Math.sin(nesho);

        System.out.println("Sine: " + sin);
        System.out.println("Cosine: " + cosine);
        System.out.println("Tangent: " + tangent);
        System.out.println("Cotangent: " + contagent);

        // Square Roots
        double square = Math.pow(nesho, 2);
        System.out.println("Square: " + square);
        System.out.println("Square root: " + Math.sqrt(nesho));
        System.out.println("Cube: " + Math.pow(nesho, 3));

        List<Double> lista = Arrays.asList(sin, cosine, tangent, contagent, square);
        double min = Collections.min(lista);
        double max = Collections.max(lista);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        // Area of a circle
        System.out.println("Area of a Circle: " + Math.PI * nesho * nesho);

        // Constant Values
        System.out.println("Value of pi: " + Math.PI);
        System.out.println("Value of e: " + Math.E);
    }
}
