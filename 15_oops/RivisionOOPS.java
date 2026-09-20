class Pokemon{
    private int power;
    String type;
    Pokemon (String type,int power){//setter
       this.power=power;
       this.type=type;
    }

    void print(){
        System.out.println(this.power+" "+this.type);
    }
}
public class RivisionOOPS {

    public static void main(String[] args) {
        // Pokemon p1=new Pokemon();
        // p1.name="pikachu";
        // p1.type="electric";

        // Pokemon p2=new Pokemon();
        // p2.name="charizard";
        // p2.type="fire";

        // Pokemon p3=p1;//p3 is shallow copy of p1...p3 can control p1 

        // p3.type="water";
        // System.out.println(p1.type);//water 


        Pokemon p1=new Pokemon("Electric",70);
        Pokemon p2=new Pokemon("Fairy",50);
        
        p1.print();
        p2.print();


        final int x=89;//cant be changed 
        // x=70;//error

    }
}
