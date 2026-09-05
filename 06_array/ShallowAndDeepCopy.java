import java.util.Arrays;

public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        int a=4;//takes 4 bytes
        int[]arr={10,20,30,40};//takes 16 bytes 
        int[]x=arr;//x is shallow copy of arr=> change the actual value also 
        x[0]=100;
        System.out.println(arr[0]);//100
        int[]deep=Arrays.copyOf(arr, arr.length);//this is deep copy=> dont change the original array values  
        deep[0]=200;
        System.out.println(arr[0]);//200
    }
}
