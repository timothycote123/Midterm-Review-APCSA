import java.util.*;
public class InvertibleMatrix {
    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       double[][] A = new double[2][2];
       for (int i = 0; i < 2; i++) {
          for (int j = 0; j < 2; j++) {
             System.out.print("What is A(" + i + " ," + j + ") : ");
             A[i][j] = console.nextDouble();
          }
       }
       System.out.println(Arrays.deepToString(A));
    }
    
}
       
       
       