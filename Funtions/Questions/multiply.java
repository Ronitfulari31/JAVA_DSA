import java.util.*;

public class multiply {

  public static int multi(int a, int b) {
    int product = a * b;
    return product;
  }

  public static int add (int a,int b){
    int result=a+b;
    return result;
  }

  public static void main(String args[]) {
    // int a = 2;
    // int b = 5

    Scanner sc= new Scanner(System.in);
    System.out.println("enter a ");
    int a= sc.nextInt();
    sc.close();
    System.out.println("enter b ");
    int b = sc.nextInt();
    sc.close();


    //int prod = multi(a, b);
    //System.out.println(a+" x "+b+" = " + prod);
    int result=add(a,b);
    System.out.println(a+"+"+ b+"=" + result);

  }
}
