

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr={5,-2,6,7,2,0,7,2};
        
        boolean isSorted=true;

        for(int i=0;i<arr.length-1;i++){

            for(int j=0;j<arr.length-1-i;j++){//"i" subtract to optimize
                
                
                if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                
                isSorted=false;
            }
            }
            if(isSorted==true){
                break;
            }
        }
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
//time compexity
// best case: O(n)
// worst case: O(n^2)
// avg case: O(n^2)