import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(7);
        arr.add(10);
        arr.add(4);

        System.out.println(arr.get(3));

        arr.set(3,4);
        System.out.println(arr.get(3));
        System.out.println(arr);//[25, 21, 7, 4, 4]

        arr.add(1,100);//mention index and new element both
        //otherwise by default it will add in the end 
        System.out.println(arr);


        arr.remove(3);//put index number not the value

        System.out.println(arr);

        arr.size();//in arraylist we use size() ...not length;

        Collections.reverse(arr);//reverse 
        System.out.println(arr);
        
    }
}
//in array if we print arr it will give something garbage value type things like "@123#abc@3"
// but in arraylist if we directly print array it will give the whole array 