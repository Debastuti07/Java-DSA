import java.util.Scanner;

public class CompositeNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0){
                System.out.println("composite key");
                break;
            }else{
                System.out.println("not a composite key");
                break;
            }
            
        }
    }
}