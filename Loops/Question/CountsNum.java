package Loops.Question;

import java.util.Scanner;

public class CountsNum {
    public static void main(String[] args) {
        System.out.println("Enter the number that you want give");
        Scanner sc= new Scanner(System.in);
        long n= sc.nextLong();
        long result=n;
        System.out.println("enter for which number you want the count");
        int check=sc.nextInt();
        sc.close();
        int count=0;

        while(n>0){
            long rem= n % 10;//get the last digit 
            if(rem==check){
                count++;
            };
            n= n/10;//remove the last digit
        }
        System.out.println("the count of the "+ check+ " in "+ result +" is "+ count);

    }
    
}
