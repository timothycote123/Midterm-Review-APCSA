import java.util.*;
public class ArrayListPractice {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i <= 9; i++) {
      list.add(i);
    }
    System.out.println(list);
    list.add(10);
    System.out.println(list);
    list.set(2, 6);
    System.out.println(list);
    list.remove(5);
    System.out.println(list);
    }
}
        