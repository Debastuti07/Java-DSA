class Pokemon{
    private int power;
    String type;
    Pokemon (String type,int power){//setter
       this.power=power;
       this.type=type;
    }
    Pokemon(){

    }
    void print(){
        System.out.println(this.power+" "+this.type);
    }
}

class StrongPokemon extends Pokemon{//child class 
     int speed;
}
class LegendaryPokemon extends Pokemon{//child class 
     String ability;
}
class GodPokemon extends LegendaryPokemon{//child class 
    char tag;
}
public class Inheritance {
    public static void main(String[] args) {
        LegendaryPokemon p=new LegendaryPokemon(); 
        p.ability="pressure";
        Pokemon pikachu=new Pokemon();
        GodPokemon gd=new GodPokemon();
        gd.ability="run";
    }
}
