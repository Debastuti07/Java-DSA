import java.util.Scanner;

public class SpecialQues {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n%5==0 && n%3!=0)
        {
            System.out.println("Riya");
        }
        else if(n%3==0 && n%5!=0)
        {
            System.out.println("Banu");
        }
        else if(n%3==0 && n%5==0)
        {
            System.out.println("Apurva");
        }
        else{
            System.out.println("Isha");
        }
    }
}