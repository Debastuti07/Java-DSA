import java.util.Arrays;

public class Marks {
    public static class StudentData{
         String name ="Megha";
         int roll;
         int Arrsize;
         int[]marks;
         StudentData(int []s){
            marks=s;
         }
    }
    public static void main(String[] args) {
        int []arr={59,78,63,35};
        StudentData s1=new StudentData(arr);
        // StudentData s2=new StudentData(5);

        s1.marks[0]=90; 
        s1.marks[1]=95;
        s1.marks[2]=93;
        s1.marks[3]=94;
        System.out.println(Arrays.toString(s1.marks));
    }
}
