import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number: ");
        double a=sc.nextDouble();
        int x=(int)a;
        if(a-x>0){
            System.out.println("The number is not integer");
        }
        else {
            System.out.println("The number is integer");
        }
    }
}
