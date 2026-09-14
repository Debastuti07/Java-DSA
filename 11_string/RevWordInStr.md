```java
class Solution {
    public String reverseWords(String s) {
        String[]words=s.trim().split("\\s+");
        String result="";
        for(int i=words.length-1;i>=0;i--){
            result+=words[i];
            if(i!=0){
                result+=" ";
            }
        }
        return result;
    }
}
```

```java
//gfg problem solution
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\.+");

        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].isEmpty()) {
                continue;
            }

            if (result.length() > 0) {
                result.append(".");
            }

            result.append(words[i]);
        }

        return result.toString();
    }
}
```