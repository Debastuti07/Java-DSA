import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//54321
       
        if(n==0){
            System.out.println(1);
            return ;
        }
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
