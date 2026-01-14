import java.util.*;

public class OneToN {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
   // System.out.println("input the number want to print" );
    int n = sc.nextInt();
    sc.close();
    int i = 0;

    while (i <= n) {
      System.out.println(i + " ");
      i++;
    }
  }
}
