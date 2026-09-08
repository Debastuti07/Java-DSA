
public class DecendingOrderSearch {
    public static void main(String[] args) {
        int target=76;
        int[]arr={100,91,87,76,66,52,43,35,29,13,5};
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                start=mid+1;
            }
            else if(arr[mid]<target){
                end=mid-1;
            }
            else{
                System.out.println(mid);
                return ;
            }
            
        }
        System.out.println("element not found");
        
    }
}
