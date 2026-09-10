```java
class Solution {
    public ArrayList<ArrayList<Integer>> multiplyMatrices(int[][] a, int[][] b) {
        // code here
        int n=a.length;
        int[][]c=new int[n][n];
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a.length;k++){
                    c[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            ans.add(new ArrayList<>());
            for(int j=0;j<a[i].length;j++){
                ans.get(i).add(c[i][j]);
                
            }
        }
        return ans;
    }
}
```


```java
class Solution {
    public ArrayList<ArrayList<Integer>> multiplyMatrices(int[][] a, int[][] b) {
        // code here
         ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        int n=a.length;
        int[][]c=new int[n][n];
        
        for(int i=0;i<a.length;i++){
             ans.add(new ArrayList<>());
            for(int j=0;j<a[i].length;j++){
                int sum=0;
                for(int k=0;k<a.length;k++){
                    sum+=(a[i][k]*b[k][j]);
                }
            ans.get(i).add(sum);
            }
        }
        
        return ans;
    }
}
```