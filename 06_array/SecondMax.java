import java.util.Scanner;

public class SecondMax {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int maxNum=Integer.MIN_VALUE;
        int secondMaxNum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxNum){
                secondMaxNum=maxNum;
                maxNum=arr[i];
            }
            else if(arr[i]>secondMaxNum && arr[i]!=maxNum){
                secondMaxNum=arr[i];
                
            }
        }
        System.out.println(secondMaxNum);
    }
}
