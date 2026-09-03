import java.util.Scanner;

public class OrDivisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0 || n%3==0)
        {
            System.out.println("The number is divisible by 5 or 3 ");
        }
        else{
            System.out.println("the number is not divisible by 5 or 3");
        }
    }
}
