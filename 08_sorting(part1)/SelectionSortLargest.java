public class SelectionSortLargest {
    public static void main(String[] args) {
        int[]arr={5,-2,6,7,2,0,7,2};

        for(int i=arr.length-1;i>0;i--){
            int max=Integer.MIN_VALUE;

            int maxIndex=-1;

            for(int j=0;j<=i;j++){
                if(arr[j]>max){
                    max=arr[j];
                    maxIndex=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[maxIndex];
            arr[maxIndex]=temp;
        }

        for(int element:arr){
            System.out.print(element+" ");
        }

    }
}

// Selection Sort Is Unstable