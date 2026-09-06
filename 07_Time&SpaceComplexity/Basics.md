```java

public class One {

    public static void main(String[] args) {
        int[]arr={5,1,3,4,2,4};
        
        //method 1

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

    }
}
```


```java
public class Two {
    public static void main(String[] args) {
        int[]arr={5,1,3,4,2,4};
        
        //method 2
        boolean[]flag=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(flag[element]==true){
                System.out.println(element);
            }
            else{
                flag[element]=true;
            }
        }
}
}
```


```java
public class Basicsone {
    public static void main(String[] args) {
        int[]arr={5,1,3,4,2,4};
        
        //method 3
        int actualSum=0;
        int totalSum=(arr.length-1)*(arr.length)/2;

        for(int i=0;i<arr.length;i++){
            actualSum+=arr[i];
        }
        System.out.println(actualSum-totalSum);
}
}
```