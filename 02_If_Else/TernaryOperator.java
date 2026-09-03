import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        //condition ? true:false
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println((n%2==0)?"even":"odd");
    }
}
