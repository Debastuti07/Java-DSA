import java.util.Scanner;

public class CountZeroOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int countZero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                countZero++;
            }
        }
        for(int i=0;i<countZero;i++){
            arr[i]=0;
        }
        for(int i=countZero;i<arr.length;i++){
            arr[i]=1;
        }
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
