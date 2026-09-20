public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow Meow");
        }
        
    }
    public static class Lion{
        void speak(){
            System.out.println("Grrrrrr");
        }
        
    }
    public static class Pikachu{
        void speak(){
            System.out.println("Pika pika");
        }
        
    }
    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
        
    }
    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c=new Cat();
        Human h=new Human();
        Pikachu p=new Pikachu();
        Lion l=new Lion();


        d.speak();
        c.speak();
        l.speak();
        p.speak();
        h.speak();
    }
}
