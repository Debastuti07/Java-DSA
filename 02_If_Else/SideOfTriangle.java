import java.util.Scanner;

public class SideOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();


        if(a+b>c && b+c>a && a+c>b){
            System.out.println("the side can make a triangle");
        }

        else{
            System.out.println("the side can not make a triangle");
        }
    }
}
