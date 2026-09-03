import java.util.Scanner;

public class RevAP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=99;
        int d=-4;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a+=d;
        }
    }
}
