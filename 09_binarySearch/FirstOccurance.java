public class FirstOccurance {

    public static void main(String[] args) {
        int []arr={1,1,2,2,2,3,4,5,5,5,5,6,7,8,11};
        int start=0;
        int end=arr.length-1;
        int target=5;

        int index=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                index=mid;
                end=mid-1;
            }
        }
        System.out.println(index);
    }
}