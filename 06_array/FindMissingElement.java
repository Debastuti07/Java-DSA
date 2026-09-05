import java.util.Scanner;

public class FindMissingElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
       
        }

        n=arr.length+1;
        int Totalsum=n*(n+1)/2;
        int ActualSum=0;
        for(int element:arr){
            ActualSum+=element;
        }
        System.out.println(Totalsum-ActualSum);
    }
}
