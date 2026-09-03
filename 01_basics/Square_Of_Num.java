import java.util.Scanner;

public class Square_Of_Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        float a=sc.nextFloat();
        System.out.println("The square of "+a+" is: "+Math.pow(a, 2));
    }
}
