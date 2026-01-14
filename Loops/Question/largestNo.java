package Loops.Question;

import java.util.Scanner;

public class largestNo {
    public static void main(String[] args) {
        System.out.println("enter the value of A: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter the value of B: ");
        int b= sc.nextInt();
        System.out.println("enter the value of C: ");
        int c=sc.nextInt();

        sc.close();

//=========Easy if else condtion======================
        // int max=a;
        // if(b>max){
        //     max=b;
        // }
        // if(c>max){
        //     max=c;
        // }
        // else{
        //     System.out.println( a + " is max ");
        // }
//=======================================================

//============= lets use the math import now============================= 
        int largestNo = Math.max(c ,(Math.max(a, b)));
        System.out.println("the largest numebr among A,B,C is " + largestNo);

    }
}
