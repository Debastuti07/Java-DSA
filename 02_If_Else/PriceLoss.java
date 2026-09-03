import java.util.Scanner;

public class PriceLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter cost price: ");
        int cp=sc.nextInt();
        System.out.print("enter selling price: ");
        int sp=sc.nextInt();
        if(cp==sp){
            System.out.println("no loss no profit");

        }

        else if(cp>sp){
            System.out.println("loss");
        }
        else{
            System.out.println("profit");
        }
    }
}
