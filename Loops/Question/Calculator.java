package Loops.Question;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("HI welcome to calculator the valid operators are +,-,*,/");
        Scanner in = new Scanner(System.in);
        int ans = 0;

        char op = in.next().trim().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/') {
            System.out.println("enter number 1");
            int number1 = in.nextInt();
            System.out.println("enter number 2");
            int number2 = in.nextInt();

            if (op == '+') {
                ans = number1 + number2;
            } else if (op == '-') {
                ans = number1 - number2;
            } else if (op == '*') {
                ans = number1 * number2;
            } else if (op == '/') {
                if (number2 != 0) {
                    ans = number1 / number2;
                } else {
                    System.out.println("Cannot divide by zero");
                    in.close();
                    return;
                }
            }
            System.out.println("Result: " + ans);
        } else {
            System.out.println("Invalid operator, use the given ones and try again!");
        }
        in.close();
    }
}
