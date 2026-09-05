import java.util.*;

public class ArrayNeg {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        //input 
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }

        //print
        for(int i=0;i<arr.length;i++){
           if(arr[i]<0){
            System.out.print(arr[i]+" ");
           }
        }
    }
}
//47:33