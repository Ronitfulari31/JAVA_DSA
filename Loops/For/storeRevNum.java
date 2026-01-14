/*
Store the reverse number in variable and then print the variable
using scanner with while and for loop 

Hint :  for last digit ============================ use moduls % ===== n%10 will give last digit 
and     for remvoing the last digit ================use divide / ===== n /10 will remvoe the last digit 

and in this use formula  int revers= (rev * 10) + lastDigit 
*/

import java.util.*;

public class storeRevNum {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number to be revese ");
    int n = sc.nextInt();
    sc.close();

    int rev = 0;

    /*============================================USIGN WHILE LOOP============================================================================================================================================= */

    // while (n > 0) {
    //   int LastDigit = n % 10;
    //   rev = (rev * 10)+LastDigit;
    //   n = n/10;
    // }
    // System.out.print(rev + " is the reverse");
    /*========================================================================================================================================================================================= */

    /*================================================USING FOR LOOP========================================================================================================================================= */

    for (; n > 0; n = n / 10) {
      int LastDigit = n % 10;
      rev = (rev * 10) + LastDigit;
    }
    System.out.print(rev + " is the reverse");
    /*========================================================================================================================================================================================= */

  }
}
