import java.util.*;

public class weekName {


  public void Week(int day){

    switch(day){
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thrusday");
        break;
      case 5:
        System.out.println("friday");
        break;
      case 6:
        System.out.println("Saturday"); 
        break;
      case 7:
        System.out.println("Sunday");
        break; 
      default:System.out.println("Invalid");
    }
  };

  public static void main(String args[]) {
    Scanner take = new Scanner(System.in);
    System.out.println("type the week in number (1-7)");
    int day = take.nextInt();
    take.close();
    weekName obj=new weekName();
    obj.Week(day);


    // switch (week) {
    //   case 1:
    //     System.out.println("Monday");
    //     break;
    //   case 2:
    //     System.out.println("Tuesday");
    //     break;
    //   case 3:
    //     System.out.println("Wednesday");
    //     break;
    //   case 4:
    //     System.out.println("Thrusday");
    //     break;
    //   case 5:
    //     System.out.println("Friday");
    //     break;
    //   case 6:
    //     System.out.println("Saturday");
    //     break;
    //   case 7:
    //     System.out.println("Sunday");
    //     break;
    // }
  }
}
