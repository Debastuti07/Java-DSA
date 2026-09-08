```java
class Solution {
    ArrayList<Integer> find(int arr[], int target) {
        // code here
        int FirstIndex=-1;
        int LastIndex=-1;
        
        ArrayList<Integer>ans=new ArrayList<>();
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                FirstIndex=mid;
                end=mid-1;
            }
        }
        
        
        start=0;
        end=arr.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                LastIndex=mid;
                start=mid+1;
            }
        }
        ans.add(FirstIndex);
        ans.add(LastIndex);
        return ans;
        
    }
}

```