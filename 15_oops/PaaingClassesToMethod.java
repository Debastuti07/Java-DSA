public class PaaingClassesToMethod {
    public static class Car {
      int seats;
      String name;
      double length;
      String type;
    

      void print(){
        System.out.println(seats+" "+length+" "+type);
      }
    }

    public static void main(String[] args) {
       Car c=new Car();
       c.length=3.995;
       c.name="Santro";
       c.seats=5;
       c.type="4 wheeler";

       change(c);
       System.out.println(c.seats);

       c.print();
    }

    private static void change(Car x){
        x.seats=4;//pass by reference same car object pointed
    }
}