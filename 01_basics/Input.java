import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double r=sc.nextDouble();//user input 
        double area=Math.PI*r*r;;
        System.out.println("Area is : "+ area);


    }
}
