import java.io.*;

public class input2 {
    public static void main(String[] args ) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);
        String text = "";

        String name="";
        int year=0;
        int height=0;
        double weight=0;
        try {
            System.out.println("Input Name");
            name = input.readLine();

            System.out.println("Input Year");
            year = Integer.parseInt(input.readLine());

            System.out.println("Input Height");
            height = Integer.parseInt(input.readLine());

            System.out.println("Input Weight");
            weight = Integer.parseInt(input.readLine());
        } catch (Exception e) {
            System.out.println("You have done something wrong");
        }
    }
}
