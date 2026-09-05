import java.util.*;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        int[]arr={4,3,-8,2,5,7};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
