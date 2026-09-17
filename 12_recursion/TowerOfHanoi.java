public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(5,'A','B','C');
    }
    public static void hanoi(int n,char src,char helper,char dest){
        if(n==0) return ;

        //take n-1 disk from A to B via C
        hanoi(n-1, src, dest, helper);
        //take larget disk from A to C 
        System.out.println(src+"->"+dest);
        //take n-1 disk from B to C via A
        hanoi(n-1, helper, src, dest);

    }
}
