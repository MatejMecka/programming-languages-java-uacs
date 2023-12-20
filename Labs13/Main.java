import java.io.*;

public class Main {
    public static void main(String[] args ) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);

        int rows = 0;
        int columns = 0;
        int sum = 0;
        int total_elems = 0;
        
        try {
            System.out.println("Input Rows");
            rows = Integer.parseInt(input.readLine());

            System.out.println("Input Columns");
            columns = Integer.parseInt(input.readLine());

            int[][] arr = new int[rows][]; 
            for (int i = 0; i < rows; i++) { 
                arr[i] = new int[columns]; 
            }
            
            for(int i=0; i < rows; i++) {
                for(int j=0; j < columns; j++) {
                    System.out.println("el. [" + i + "][" + j + "]");
                    arr[i][j] = Integer.parseInt(input.readLine());
                    total_elems++;
                    sum += arr[i][j];
                }
            }

            System.out.println("Total Sum: " + sum);
            System.out.println("Avg: " + sum / total_elems);
        } catch (Exception e) {
            System.out.println("You have done something wrong");
            if(total_elems != 0) {
                System.out.println("Total Sum: " + sum);
            System.out.println("Avg: " + sum / total_elems);
            }
        }
    }
}
