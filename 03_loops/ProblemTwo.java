import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int start=1;
        int end=n;
        for(int i=1;i<=n;i++)
        {
          if(i%2!=0){
            System.out.println(start);
            start++;
          }
          else{
            System.out.println(end);
            end--;
          }
        }
    }   
}
