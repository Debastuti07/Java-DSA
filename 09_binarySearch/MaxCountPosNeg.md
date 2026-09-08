```java
class Solution {
    public int maximumCount(int[] arr) {
        int neg=0;
        int pos=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]<0){
            neg++;
           }
           else if(arr[i]>0){
            pos++;
           }
        }
        return Math.max(neg,pos);
    }
}
```


```java
class Solution {
    public int maximumCount(int[] arr) {
        int start=0;
        int FirstNeg=arr.length;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<0){
                start=mid+1;
            }
            else{
                FirstNeg=mid;
                end=mid-1;
            }
        }
        int neg=FirstNeg;


        start=0;
        int FirstPos=arr.length;
        end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>0){
                FirstPos=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        int pos=arr.length-FirstPos;
        return Math.max(neg, pos);

    }
}
```