```java
class Solution {
    public int kthMissing(int[] arr, int target) {
        // code here
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int correctNum=mid+1;
            int noOfMissingTerm=arr[mid]-correctNum;
            if(noOfMissingTerm<target){
                start=mid+1;
            }
            else if(noOfMissingTerm>=target){
                end=mid-1;
            }
        }
        return start+target;
    }
}
```