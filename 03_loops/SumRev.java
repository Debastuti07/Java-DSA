import java.util.Scanner;

public class SumRev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int remainder;
        int rev=0;
        int sum=0;
        while(n!=0){
            remainder=n%10;
            rev=rev*10+remainder;
            n=n/10;
            sum+=remainder;
        }
        System.out.println(sum);
        System.out.println(rev);
    }
}
