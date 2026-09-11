import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // String s="";
        // s+=n;
        String s=Integer.toString(n);//integer to string 
        System.out.println(s);


        String str="123458";
        int a=Integer.parseInt(str);//string to integer
        System.out.println(a+1234569);
    }
}
