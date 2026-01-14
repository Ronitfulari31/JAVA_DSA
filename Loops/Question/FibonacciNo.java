package Loops.Question;

import java.util.Scanner;

public class FibonacciNo {
    public static void main(String[] args) {
        System.out.print("Enter the Fibonacci number you want : ");
        Scanner sc= new Scanner(System.in);
        // the n number is the number of fibonacci we want
        int n=sc.nextInt();
        sc.close();
        // so here we use prevfrom 0 , current from 1, count(means no of iteration start from 2 as we have 0,1 prev and current) , and a temp int
        int prev=0;
        int current=1;
        int count=2;

        // now we use the while as we know the number of loops will be n 
        while(count<=n){
            // temp to store old value of current to assing for prev in further steps
            int temp=current;
            current=prev+current;
            prev=temp;
            count++;
        }
        // now print the current as the last iteration we will have the result on current 
        System.out.println("the fibonacci number on "+ n +"th index is "+  current);
    }

}
