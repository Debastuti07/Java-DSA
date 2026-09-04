import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        boolean x=false;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0||n==1){
            x= true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
               x=true;
               break;
            }
            
        }
        if(!x){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
