```java
class Solution {
    int single(int[] arr) {
        // code here
        int start=0;
        int end =arr.length-1;
        int count=0;
        while(start<=end){
            if(start==end){
                return arr[start];
            }
            int mid=start+(end-start)/2;
            if(mid==0){
                if(arr[mid]!=arr[mid+1]){
                    return arr[mid];
                }
            }
            if(mid==arr.length-1){
                if(arr[mid]!=arr[mid-1]){
                    return arr[mid];
                }
            }
            if(arr[mid]!=arr[mid+1]&&arr[mid]!=arr[mid-1]){
                return arr[mid];
            }
            else if(arr[mid]==arr[mid-1]){
                count=mid-start+1;
                if(count%2==0){
                    start=mid+1;
                }
                else{
                    end=mid-2;
                }
            }
            else if(arr[mid]==arr[mid+1]){
                count=mid-start+2;
                if(count%2==0){
                    start=mid+2;
                }
                else{
                    end=mid-1;
                }
            }
            
        }
        return -1;
    }
}
```