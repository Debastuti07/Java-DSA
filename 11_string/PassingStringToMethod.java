public class PassingStringToMethod {
    public  static void changer(String x){
       x="tuti";
    }
    public static void main(String[] args) {
        String x="megha";
        changer(x);
        System.out.println(x);//does not change ..pass by value 
    }
}
//string is immutable 