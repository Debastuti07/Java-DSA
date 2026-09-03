import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        if(x==0 && y==0){
            System.out.println("lies in origin ");
        }
        else if(x<0 && y>0){
            System.out.println("lies in second quadrant ");
        }
        else if(x>0 && y<0){
            System.out.println("lies in forth quadrant ");
        }
        else if(x>0 && y>0){
            System.out.println("lies in first quadrant ");
        }
        else{
        System.out.println("lies in third quadrant ");

        }
    }
}
