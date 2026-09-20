class Students{
    String name;//null
    private int roll;//0
    double cgpa;//0.0

    public  void print(){//getter 
        System.out.println(name+" "+cgpa+" "+roll);
    }
    
}
public class PrivateKeyword {

    public static void main(String[] args) {
        Students s1=new Students();
        // s1.roll=12;//throws error ..we cannot change private data 

        // System.out.println(s1.roll);//cant print private data 
        System.out.println(s1.cgpa);//0.0 by default  

        s1.print();
        s1.cgpa=9.00;
        s1.name="tuti";
        s1.print();
    }
}
