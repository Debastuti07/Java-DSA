public class ReturnType {
    public static int hello(int a){
        System.out.println("hello");
        // return 5;//finished
        if(a>0) return 5;
        else return 10;
    }
    public static void main(String[] args) {
        int x=hello(7);
        System.out.println(3+x);
    }
}
// works in two ways one value another any printing value 