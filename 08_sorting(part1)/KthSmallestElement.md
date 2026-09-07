```java
class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        for(int i=0;i<k;i++){
            int min=Integer.MAX_VALUE;
            int minIndex=-1;
            
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                } 
                
            }
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
        }
        return arr[k-1];
    }
}

```

```java
class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        Arrays.sort(arr);
        return arr[k-1];
        
    }
}

```