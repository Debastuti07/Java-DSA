//there are two parts of array ...sorted and unsorted part ...pick the first element of unsorted part and comapare with the sorted part's element ...
public class InsertionSort {
    public static void main(String[] args) {
        int[]arr={5,-2,6,7,2,0,7,2};

        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j--;
            }
        }
        for (int element : arr) {
            System.out.print(element+" ");
        }
    }
}
//Time Complexity
//Worst Case:O(n^2)
//Avg Case:O(n^2)
//Best Case:O(n)

//Insertion Sort is Stable 