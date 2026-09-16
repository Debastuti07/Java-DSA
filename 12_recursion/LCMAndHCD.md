```java
class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int hcf=1;
        for(int i=2;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0) {
                hcf=i;
            }
        }
        int lcm=a*b/hcf;
        return new int[]{lcm,hcf};
    }
}
```