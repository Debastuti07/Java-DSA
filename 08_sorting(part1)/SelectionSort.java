public class SelectionSort {
    //selct the smallest element and swap with first element

    public static void main(String[] args) {

        int[]arr={5,-2,6,7,2,0,7,2};
        
        for(int i=0;i<arr.length-1;i++){
            int min=Integer.MAX_VALUE;
            int minIndex=-1;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
// Time compexity
//Best Case:O(n^2);
//worst Case:O(n^2);
//Avg Case:O(n^2);