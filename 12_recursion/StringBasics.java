import java.util.ArrayList;

public class StringBasics {
    public static void main(String[] args) {
        String s="Tuti";
        // change(s);
        System.out.println(s);

        String[]arr={"apple","banana","watermelon"};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        ArrayList<String> str=new ArrayList<>();
        str.add("debastuti");
        str.add("mainak");
        str.add("puchu");

        System.out.println(str);
        change(s, str,arr);
         for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(str);
    }
    public static void change(String s,ArrayList<String> str,String[]arr){
        s="megha";
        str.add("bhutu");
        arr[2]="cucumbar";

    }
}
//when i send a value to change the original value ..it doesnot change ....an another copy will be sent 

//in ArrayList updation is possible by pass by reference
