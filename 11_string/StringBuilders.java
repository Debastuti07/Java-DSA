import java.util.ArrayList;

public class StringBuilders {
    public static void main(String[] args) {
    //    ArrayList <Character>str=new ArrayList<>();
    //    str.add('a');
    //    str.set(0,'r');
    StringBuilder s=new StringBuilder();//by default 16 
    System.out.println(s.length()+" "+s.capacity());
    s.append("de");
    System.out.println(s.length()+" "+s.capacity());

    // String t=s;//error
    String t=s.toString();//stringbuilder to string 
    s.append("hello megha is a cute girl and good girl");
    System.out.println(s.length()+" "+s.capacity());
    

    }
}
//we can give size in string builder also ...and also if wee add something the new string doesnot create it is modified just 
