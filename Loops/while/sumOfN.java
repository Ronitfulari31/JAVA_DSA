import java.util.*;

public class sumOfN {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number which you want to sum");
    int n = sc.nextInt(); //user kadunch input je ki n madhe store kela
    sc.close();
    int i = 1; //he counter je ki compare karayla use karaych ahe while loop madhe

    int sum = 0; //intially sum 0 theval

    while (i <= n) {
      sum = sum + i;//sum vadhavla 
      i++;//counter vadhavla
    }
    System.out.println(" the sum is  " + sum);
  }
}