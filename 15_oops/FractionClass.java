class Fraction{
    int num;
    int dem;
    Fraction(int num,int dem){
         this.num=num;
         this.dem=dem;
         simplify(hcf(num, dem));
    }
    void print(){
        System.out.println(num+"/"+dem);
    }
    void add(Fraction f){
       num=num*f.dem+dem*f.num;
       dem=f.dem*dem;
       simplify(hcf(num, dem));
    }
    void divide(Fraction f){
       num=num*f.dem;
       dem=dem*f.num;
       simplify(hcf(num, dem));
    }
    void simplify(int hcf){
      
       num/=hcf;
       dem/=hcf;

       if (dem < 0) {
        num = -num;
        dem = -dem;
       }
    }

   int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    
}
public class FractionClass {
    public static void main(String[] args) {
        Fraction f1=new Fraction(3, 7);
        f1.print();
        Fraction f2=new Fraction(3, -7);
        f2.print();

        // f1.add(f2);
        // f1.print();

        f1.divide(f2);
        f1.print();
}
}
