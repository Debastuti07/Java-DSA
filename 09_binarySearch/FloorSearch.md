```java
class Solution {
    static int findFloor(int[] arr, int target) {
        // code here
        int start=0;
        int end=arr.length-1;
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<=target){
                index=mid;
                start=mid+1;
            }
            
            
        }
        return index;
    }
}

```