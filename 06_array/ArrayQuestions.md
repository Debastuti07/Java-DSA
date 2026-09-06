```java
//Segregate 0’s and 1’s
class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int countZero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                countZero++;
            }
        }
        
        for(int i=0;i<countZero;i++){
            arr[i]=0;
        }
        for(int i=countZero;i<arr.length;i++){
            arr[i]=1;
        }
        
        
    }
}

```

```java
//wave array
class Solution {
    public void sortInWave(int arr[]) {
        // code here
        for(int i=0;i<arr.length-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            
            
        }
    }
}

```