```java
class Solution {
    public ArrayList<Integer> addArrays(int[] arr1, int[] arr2) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        int n1=arr1.length-1;
        int n2=arr2.length-1;
        int carry =0;
         while(n1>=0||n2>=0||carry!=0){
             int sum=carry;
             
             if(n1>=0){
                 sum+=arr1[n1];
                 n1--;
             }
             
             if(n2>=0){
                 sum+=arr2[n2];
                 n2--;
             }
             ans.add(sum%10);
             carry=sum/10;
             
         }
         Collections.reverse(ans);
         
        return ans;
    }
}
```