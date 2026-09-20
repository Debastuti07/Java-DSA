import java.util.Scanner;

class Student{
   String name;
   int roll;
   double cgpa;
   void print(){
    System.out.println(name+" "+roll+" "+cgpa);
   }
}
public class UserDefinedDataType{


        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s1=new Student();//declaration
        s1.name="tuti";
        s1.roll=63;
        s1.cgpa=9.41;
        
        Student s2=new Student();//declaration
        s2.name="megha";
        s2.roll=111;
        s2.cgpa=9.00;

        Student s3=new Student();//declaration
        s3.name="debastuti";
        s3.roll=sc.nextInt();//user input
        s3.cgpa=9.82;


        // System.out.println(s1.name + " "+ s1.roll+" "+s1.cgpa);
        s2.cgpa=9.02;//update
        System.out.println(s2.cgpa);
        System.out.println(s3.roll);
        

        s1.print();
        s2.print();
        s3.print();

    }
}
//Scanner is a class 
//sc is an object