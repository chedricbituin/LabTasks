import java.util.Scanner;
public class Matrix {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String again;
       do {
           int[][] matrix1 = new int[3][3];
           // 1. Input 9 values (0-9)
           System.out.println("Input 9 elements:");
           for (int r = 0; r < 3; r++) {
               for (int c = 0; c < 3; c++) {
                   int value;
                   do {
                       value = sc.nextInt();
                       if (value < 0 || value > 9) {
                           System.out.println("Enter 0-9 only:");
                       }
                   } while (value < 0 || value > 9);
                   matrix1[r][c] = value;
               }
           }
           // 2. Display the table + row sums
           System.out.println("\nHere are the Numbers and the required outputs:");
           System.out.println("==========================================");
           System.out.printf("%38s%n", "Row Sum");
           for (int r = 0; r < 3; r++) {
               int rowSum = 0;
               System.out.printf("\t\t", "");
               for (int c = 0; c < 3; c++) {
                   System.out.printf("%-6d", matrix1[r][c]);
                   rowSum += matrix1[r][c];
               }
               System.out.printf("%d%n", rowSum);
           }
           // 3. Column sums
           System.out.print("Column sum:");
           for (int c = 0; c < 3; c++) {
               int colSum = 0;
               for (int r = 0; r < 3; r++) {
                   colSum += matrix1[r][c];
               }
               System.out.printf("%6d", colSum);
           }
           System.out.println();
           System.out.println("==========================================");
           // 4. Diagonal sums
           int diag1 = 0, diag2 = 0;
           for (int i = 0; i < 3; i++) {
               diag1 += matrix1[i][i];        // top-left to bottom-right
               diag2 += matrix1[i][2 - i];    // top-right to bottom-left
           }
           System.out.println("Diagonal sum 1: " + diag1);
           System.out.println("Diagonal sum 2: " + diag2);
           // 5. Try again?
            while (true) {
        System.out.print("\nTry Again [y|n]: ");
        again = sc.next();
 
        if (again.equalsIgnoreCase("y") || again.equalsIgnoreCase("n")) {
            break;
        }
 
        System.out.println("Invalid input! Please type only y or n");
    }
        } while (again.equalsIgnoreCase("y"));
       sc.close();
   }
}
