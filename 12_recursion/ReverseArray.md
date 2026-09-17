```java
class Solution {
    public void reverseArray(int arr[]) {
    reverse(arr,0,arr.length-1);
     
    }
    
    public void reverse(int arr[],int start,int end){
        if(start>end) return ;
        
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        
       
        reverse(arr,start+1,end-1);
    }
}

```