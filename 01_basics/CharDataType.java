import java.rmi.server.SocketSecurityException;

public class CharDataType {
    public static void main(String[] args) {
        char n='T';
        System.out.println(n);

        char m='D';
        System.out.println(m);

        char num='7';//7 behaves like character
        System.out.println(num);


        //typecasting=> one datatype to another data type 

        // implicit typecasting
        char ch='A';
        int x=ch;
        System.out.println(x);//65

        //explicit typecasting
        char c='a';
        int y=(int)c;
        System.out.println(y);//97

        char h='3';
        System.out.println((int)h);//51

        char a='b';
        System.out.println(a+1);//99//behaves like integer by default 

        //integer to character => only supports explicit type casting 
        int p = 43;
        char q = (char) p;
        System.out.println(q);
    }
}
// a=> 97, A=> 67 and 0=> 48



