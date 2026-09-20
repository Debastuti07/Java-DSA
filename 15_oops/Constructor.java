public class Constructor {
    public static class Car {
      int price;
      String name;
      
      
      Car(){

      }
      Car(int price,String name){
          this.price=price;
          this.name=name;
      }
      Car(String s,int x){
          price=x;
          name=s;
      }

      void print(){
        int price=12;
        System.out.println(this.price+" "+name);
      }
    }



    public static int max(int a,int b){
        return Math.max(a, b);
    }


    public static int max(int a,int b,int c){
        return Math.max(Math.max(a, b),c);
    }


    public static void main(String[] args) {
        //constructor overloading
        Car c1=new Car(1200000,"Santro");
        c1.print();
        

        Car c2=new Car("alto",400000);
        c2.print();

        Car c3=new Car();//error
        c3.name="honda";


        System.out.println(max(4,6));//use first max function 
        System.out.println(max(4,5,6));//use second max function //method overloading 
    }
}
//if we use any defalt constructor then we can use the default one instead of the parameterized => constructer overloading 