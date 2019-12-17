//Midterm Review for APCSA
import java.util.*;
public class ArrayPractice {
    public static void main(String[] args) {
        int[] practice = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(practice));
        practice[2] = 6;
        System.out.println(Arrays.toString(practice));
        reverseArray(practice, practice.length);
        System.out.println(Arrays.toString(practice));
        forEach(practice);
  
    }
    public static void forEach(int []a){
        int count = 0;
        for (int n : a){
          if (n == a) {
            count++;
          }
         
        }
        System.out.println("There are " + n + "spots");
    }
    public static void reverseArray(int a[], int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
           b[j - 1] = a[i];
           j = j - 1;
    }
    }
}