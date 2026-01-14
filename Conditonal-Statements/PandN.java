import java.util.*;

public class PandN{
    public static void main (String args[]){
        System.out.println("type a number to be checked");
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        sc.close();

        if(Num<0){
            System.out.println(Num + " is negetive");
        } else{
            System.out.println(Num + " is positive");
        }


    }
}
