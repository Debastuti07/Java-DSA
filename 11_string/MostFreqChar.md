```java
class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        char []arr=s.toCharArray();
        int maxCount=Integer.MIN_VALUE;
        char mostCountNum=arr[0];
        for(int i=0;i<s.length();i++){
        int count =0;
            for(int j=0;j<s.length();j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        if(count>maxCount||count==maxCount && arr[i]<mostCountNum){
            maxCount=count;
            mostCountNum=arr[i];
        }
        }
        return mostCountNum;
    }
}
```


```java
class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        int maxFreq=-1;
        char ans=s.charAt(0);
        char[]arr=s.toCharArray();
        Arrays.sort(arr);
        
        int i=0;
        int j=0;
        while(j<s.length()){
            if(arr[i]==arr[j]){
                j++;
            }
            else{
                int freq=j-i;
            if(freq>maxFreq){
                maxFreq=freq;
                ans=arr[i];
            }
            i=j;
            }
        }
        int freq=j-i;
        if(freq>maxFreq){
            maxFreq=freq;
            ans=arr[i];
        }
        return ans;
    }
}
```

```java
class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        int n=s.length();
        int maxFreq=-1;
        int[]freq=new int[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int index=ch-97;
            freq[index]++;
        }
        char ans=s.charAt(0);
        for(int i=0;i<26;i++){
            if(freq[i]>maxFreq){
                maxFreq=freq[i];
                ans=(char)(i+97);
            }
        }
        return ans;
    }
}
```