```java
class Solution {
    int search(int[] arr, int target) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
          
            }
        }
        return -1;
    }
}
```

```java
class Solution {
    int search(int[] arr, int target) {
        // code here
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[start]<=arr[mid]){
                if(target>=arr[start] && target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target<=arr[end] && target>arr[mid]){
                    start=mid+1;
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