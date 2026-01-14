import java.util.*;

public class starsLines {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the number of lines for printng the stars: ");

    int lines = sc.nextInt();
    sc.close();

    for (int i = 1; i <= lines; i++) {
      System.out.println("****"+ "  line no "+ i);
    }
  }
}
