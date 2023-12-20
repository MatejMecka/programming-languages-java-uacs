import java.io.*;

public class Main2 {
    public static void main(String[] args ) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);
        
        String text = "";
        try {
            do {
                System.out.println("Input a line, input END to terminate ");
                text = input.readLine();
                System.out.println("The Text size is: " + text.length());
            } while( !text.equals("END"));
            System.out.println("goodbye!");
        } catch (Exception e) {
            System.out.println("Something sucks");
        }
            
    }
}
