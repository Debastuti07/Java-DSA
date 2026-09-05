import java.util.*;
public class PassingArrayToMethods {

    public static void main(String[] args) {
        int []arr={10,3,29,38};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
    }
    public static void change(int[]arr1){
        arr1[2]=20;
    }
}
//pass by reference