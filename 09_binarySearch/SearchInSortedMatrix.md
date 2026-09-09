```java
class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        // code here
        int n=arr.length;
        int m=arr[0].length;
        int start=0;
        int end=m*n-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            int rowmid=mid/m;
            int colmid=mid%m;
            
            if(arr[rowmid][colmid]<target){
                start=mid+1;
            }
            else if(arr[rowmid][colmid]>target){
                end=mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
```