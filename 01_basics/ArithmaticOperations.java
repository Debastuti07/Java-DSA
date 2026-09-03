public class ArithmaticOperations {
    public static void main(String[] args) {
        int x=5,y=2;
        System.out.println(x+y);//7
        System.out.println(x-y);//3
        System.out.println(x*y);//10
        System.out.println(x/y);//2

        //if we give int value then the calculation will be also come in int format by default ..
        // decimal part will be removed

        double a=39;
        double b=10;
        System.out.println(a/b);//3.9 
        System.out.println(a%b);//9
    }

}

//modullus operator 
// if a%b and a<b the "a" will be the answer 

//  a%(-b) = a%b 
// (-a)%b= -(a%b)