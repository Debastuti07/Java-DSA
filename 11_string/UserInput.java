import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String s=sc.next();
        // System.out.println(s);//only prints the things before a space
        String a=sc.nextLine();
        System.out.println(a);//prints full line
        

        String b="Tuti";
        System.out.println(b.charAt(2));
        System.out.println(b.length());
    }
}
