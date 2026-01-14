package Loops.Question;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println("Enter the number which you want to Reverser should not be so big ");
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();
        int result=n;
        sc.close();

        int reversNo=0;

        while(n>0){
            int rem= n%10;//get the last digit and add in rem;
            n/=10;

            reversNo=reversNo*10+rem;

        }
        System.out.println("the reverse of the "+ result +" is "+ reversNo);

    }
    
}
