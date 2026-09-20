class Cricketer{
    static String Country="England";
    int runs;
    String name;
    double avg;

    static void hello(){
        System.out.println("hello java!!");
    }
}  
public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer c1=new Cricketer();
        Cricketer c2=new Cricketer();
        c1.Country="India";//always print india cz county keyword is static so it will be differend from other and england will replace by india....static is common variable
        System.out.println(c2.Country);

        // fun();//error cz their is no static keyword that means that private block is not shareable 
        
        Cricketer.hello();
        
    }
    private  void fun(){
        System.out.println("hello tuti");
    }
}
