import java.util.Scanner;

public class PAndC {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nCr=fact(n)/(fact(r)*fact(n-r));
        int nPr=fact(n)/fact(n-r);
        System.out.println(nCr);
        System.out.println(nPr);
    }
}
