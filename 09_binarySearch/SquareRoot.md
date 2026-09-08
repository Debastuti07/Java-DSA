```java
class Solution {
    int floorSqrt(int n) {
        // code here
        return (int) (Math.floor(Math.sqrt(n)));
    }
}
```


```java
class Solution {
    int floorSqrt(int n) {
        // code here
        int root=0;
        for(int i=1;i<=n;i++){
            if(i*i>n){
                break;
            }
            root=i;
        }
        return root;
    }
}
```


```java
class Solution {
    int floorSqrt(int n) {
        // code here
        int start=1;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(mid*mid>n){
                end=mid-1;
            }
            else if(mid*mid<n){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
```