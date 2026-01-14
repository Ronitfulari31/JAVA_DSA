import java.util.Scanner;

class marks {

    public void StudentGrade(int marks){
        if(marks>=90){
            System.out.println("Grade A");
        }else if(marks>=70){
            System.out.println("Grade B");
        }else if(marks>=50){
            System.out.println("Grade C");
        }else if(marks>=35){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
        }


    public static void main(String[] args) {
        System.out.println("enter the marks");
        Scanner sc=new Scanner(System.in);
        int marks= sc.nextInt();
        sc.close();

        marks obj=new marks();
        obj.StudentGrade(marks);
        
        
    }

}
