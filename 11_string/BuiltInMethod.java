public class BuiltInMethod {
    public static void main(String[] args) {
        String str="megha De";
        System.out.println(str.indexOf(' '));
        System.out.println(str.indexOf('e'));//return first occurance
        System.out.println(str.lastIndexOf('e'));//return last occurance
        System.out.println(str.lastIndexOf('i'));//return -1 for missing letter 
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        
        System.out.println(str.contains("megh"));//true
        System.out.println(str.startsWith("megh"));//true
        System.out.println(str.endsWith("tuti"));//false
        
        String s="meghna";
        s.toUpperCase();
        System.out.println(s);//cant change ..string is immutable 
        System.out.println(str.concat(s));
        System.out.println(str.equals(s));//campare letter by letter
    }
}
