import java.util.Scanner;

public class Sum_Of_Three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 inputs: ");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

        System.out.println("The sum is: "+ (a+b+c));
    }
}
