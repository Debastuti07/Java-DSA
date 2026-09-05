import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        boolean isPresent=false;
        for(int i=0;i<arr.length;i++){
          if(arr[i]==a){
            isPresent=true;
            break;
          }
          
        }
        if(isPresent){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }
    }
}
