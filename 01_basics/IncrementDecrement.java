public class IncrementDecrement {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        a=a+1;// a++ => increment operator or a+=1
        System.out.println(a);
        a+=4;
        System.out.println(a);



        int p=1;
        System.err.println(p++);//1
        int q=1;
        System.out.println(++q);//2
        System.out.println(q);//2
    }
}


//a++ ++a a-- --a

//++a => at first increase then print 
//a++=> at first print the increase 


