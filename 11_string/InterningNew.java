public class InterningNew {
    public static void main(String[] args) {
        String s="tuti";
        // s+="de";
        System.out.println(s);
        String t="tuti";// no new string created ...just s and t both pointed the same thing 
        String a=new String("tuti");//new string
        System.out.println(s==a);//false cz both r diff string 
        System.out.println(s==t);//true cz both denote same string 
        System.out.println(s.equals(a));//true cz equals method compare letter by letter doesnot compare the memory address
        
    }
}
