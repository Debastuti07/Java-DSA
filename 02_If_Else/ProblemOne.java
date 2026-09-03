import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n>0 && n%4==0){
            System.out.println("The number is positive and divisible by 4");
        }

        else{
            System.out.println("The number is not divisible by 4 ");
        }
    }
}
