public class MaxOfTwo {
    public static int maxNum (int a,int b,int c){
          if(a>=b && a>=c){
            return a;
        }
        else if(b>=a && b>=c){
            return b;
        }
        else{
           return c;
        }
    }
    public static void main(String[] args) {
        System.out.println(maxNum(4, 9,4 ));
    }
}
