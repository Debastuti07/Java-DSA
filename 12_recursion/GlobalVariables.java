public class GlobalVariables {
    static int x=25;//global
    public static void main(String[] args) {
        int x=10;
        change(); 
        System.out.println(x);
    }
    public static void change(){
        x=50;//local
        System.out.println(x);
    }
}
