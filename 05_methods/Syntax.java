public class Syntax {
    public static void hello(){
        helloOne();
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        System.out.println("one");
        hello();//function call
        
    }
    public static void helloOne(){
        System.out.println("Hello One");
    }
}
//main method will be executed first

