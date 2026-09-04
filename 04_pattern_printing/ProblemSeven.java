import java.util.Scanner;

public class ProblemSeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                     ch=((char)(96+i));
                 }
                 else{
                     ch=((char)(64+i));
                 }

            for(int j=1;j<=n;j++){
                 System.out.print(ch);
                 
                 
            }
            System.out.println();
        }
    }
}
