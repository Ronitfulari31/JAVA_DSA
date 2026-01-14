import java.util.*;

public class LeapY {

  public static void main(String args[]) {
    System.out.println("type the year to be checked");
    Scanner input = new Scanner(System.in);
    int year = input.nextInt();
    input.close();

    boolean divisibleby4 = (year % 4) == 0;
    boolean notdivisibleby100 = (year % 100) != 0;
    boolean divisibleby100_divsibleby400 =
      (year % 100 == 0) && (year % 400 == 0);
  

  if(divisibleby4 && (notdivisibleby100 || divisibleby100_divsibleby400)){
    System.out.println(year + " is leap year");
  }else{
    System.out.println(year + " is not leap year");
  }
}

}