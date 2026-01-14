/*
print the reverse number
using scanner with while and for loop 

Hint :  for last digit ============================ use moduls % ===== n%10 will give last digit 
and     for remvoing the last digit ================use divide / ===== n /10 will remvoe the last digit 
*/

import java.util.*;

public class reversNum {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number to reveres");

    int n = sc.nextInt();
    sc.close();

    /*================================ using while loop ========================================================================================================================================== */
    // while (n > 0) {
    //   /*=============================== taken the lastDigit by using the % moduls = n % 10==================================================== */
    //   int LastDigit = n % 10;
    //   /*================================printed the lastDigit =================================================== */
    //   System.out.print(LastDigit);
    //   /*=================================Removed the lastDigit as it is printed and get the remaining number================================================== */
    //   n = n / 10;
    // }
    /*========================================================================================================================================================================================= */

    /*=======================================using for Loop================================================================================================================================================== */
    for (; n > 0; n = n / 10) { //intailly is blank, condition , updation
      int LastDigit = n % 10; //taken the lastDigit
      System.out.print(LastDigit); //printed LastDigit
    }
    /*========================================================================================================================================================================================= */
  }
}
