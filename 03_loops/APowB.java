import java.util.Scanner;

public class APowB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int result=1;

        // System.out.println((int)Math.pow(a,b));


        for(int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println(result);
    }
}
