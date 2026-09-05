public class PassByValueAndRef {
    public static void change(int x){
        x=10;
    }
    public static void main(String[] args) {
        int x=6;
        System.out.println(x);//6
        change(x);//here x is a value and it will store in change(int x)...but that is diff box
        System.out.println(x);//6 ...not 10 cz they r two diff box with same variable name ...so when we change it changes in the original box 
    }
}
