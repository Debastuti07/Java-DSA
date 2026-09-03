import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();

        int area=l*b;
        int perimeter=2*(l+b);

        if(area>perimeter)
        {
            System.out.println("area is greater than perimeter");
        }
        else if(area==perimeter)
        {
            System.out.println("area equals to the perimeter");
        }
        else{
            System.out.println("area is less than the perimeter");
        }


    }
}
