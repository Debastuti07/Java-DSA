import java.util.ArrayList;

class Arraylist{//user defined data structure 
    int[]arr;
    int idx=0;
    int size=0;
    Arraylist(int capacity){
        arr=new int[capacity];
    }
    void add(int ele){
        if(idx==arr.length){
            int[]arr2=new int[arr.length*2];
            for(int i=0;i>arr.length;i++){
                arr2[i]=arr[i];
            }
            arr=arr2;
        }
          arr[idx++]=ele;
          size++;
    }

    void remove(){
        idx--;
        size--;
    }
    int capacity(){
        return  arr.length;
    }

    void display(){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }

    int get(int idx){
        return arr[idx];
    }
    void get(int idx,int val){
        arr[idx]=val;
    }
}
public class OwnArrayList {
    public static void main(String[] args) {
        // ArrayList<Integer>arr=new ArrayList<>();

        Arraylist arr=new Arraylist(8);
        System.out.println(arr.capacity());
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.display();

        System.out.println(arr.get(1));

        arr.add(40);
        arr.remove();
        arr.display();
    }
}
