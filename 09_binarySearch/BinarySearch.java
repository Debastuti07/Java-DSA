
public class BinarySearch {
    public static void main(String[] args) {
        int target=280;
        int[]arr={-111,-29,-8,55,98,176,280};
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                System.out.println(mid);
                return ;
            }
            
        }
        System.out.println("element not found");
        
    }
}
