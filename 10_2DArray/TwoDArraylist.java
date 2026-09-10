import java.util.ArrayList;

public class TwoDArraylist{
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        ArrayList<Integer>row1=new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        ArrayList<Integer>row2=new ArrayList<>();
        row2.add(7);
        row2.add(9);
        row2.add(13);
        row2.add(27);
        ArrayList<Integer>row3=new ArrayList<>();
        row3.add(-8);
        row3.add(-17);


        arr.add(row1);
        arr.add(row2);
        arr.add(row3);
        // System.out.println(arr.get(1).get(3));


        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }

System.out.println();
        for(ArrayList<Integer>list:arr){
            for(int element:list){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}