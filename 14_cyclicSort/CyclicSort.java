public class CyclicSort {
    public static void main(String[] args) {
        int[]arr={3,1,5,2,7,0,4,6};
        int i=0;
        while(i<arr.length){
           if(i==arr[i]) i++;
           else{
            int idx=arr[i];
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx] =temp;

            
           }
        }
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
