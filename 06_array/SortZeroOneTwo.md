```java
class Solution {
    public void sort012(int[] arr) {
        // code here
        int countZero=0;
        int countOne=0;
        int countTwo=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                countZero++;
            }
            else if(arr[i]==1){
                countOne++;
            }
            else if(arr[i]==2){
                countTwo++;
            }
        }
        
        for(int i=0;i<countZero;i++){
            arr[i]=0;
        }
        for(int i=countZero;i<countOne+countZero;i++){
            arr[i]=1;
        }
        for(int i=countOne+countZero;i<arr.length;i++){
            arr[i]=2;
        }
        
    }
   
    
}
```