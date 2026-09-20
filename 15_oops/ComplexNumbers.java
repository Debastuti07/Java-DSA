class Complex{
    int x;
    int y;

    Complex(int x,int y){
         this.x=x;
         this.y=y;
    }
    //print two number 
    void print(){
       if(y>=0) System.out.println(x+" + "+y+"i");
       else {
        System.out.println(x+" - "+(-y)+"i");
       }
    }
//add two number 
    void add(Complex c2)
    {
        this.x+=c2.x;
        this.y+=c2.y;
    }
}
public class ComplexNumbers {
    public static void main(String[] args) {
        Complex c1=new Complex(2,-5);
        Complex c2=new Complex(3,5);
        c1.print();
        c2.print();

        c1.add(c2);

        c1.print();

    }
}
