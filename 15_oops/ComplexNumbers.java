class Complex{
    double x;
    double y;

    Complex(double x,double y){
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
// add two number 
    void add(Complex c)
    {
        x+=c.x;
        y+=c.y;
    }

    void multiply(Complex c){
        double temp=x;
        x= x*c.x - y*c.y;
        y=temp*c.y + y*c.x;
    }
    void divide(Complex c){
     double denominator = c.x * c.x + c.y * c.y;
      double temp=x;
       x = (x * c.x + y * c.y) /  denominator;
       y=(y*c.x - temp*c.y)/  denominator ;
    }

}
public class ComplexNumbers {
    public static void main(String[] args) {
        Complex c1=new Complex(2,-15);
        Complex c2=new Complex(3,5);
        c1.print();
        c2.print();

        c1.add(c2);

        c1.print();
        c2.print();

        c2.multiply(c1);
        c2.print();


        c1.print();
        c2.print();

        c1.divide(c2);
        c1.print();


    }
}
