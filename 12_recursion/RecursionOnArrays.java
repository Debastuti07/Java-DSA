public class RecursionOnArrays {

    public static void main(String[] args) {
        int[]arr={5,3,7,12,16,9,34,5};
        // recPrint(arr,0);
        System.out.println(arrayExists(arr, 9, 0));
    }
    public static void recPrint(int[]arr,int idx){
        if(idx==arr.length) return ;
        System.out.println(arr[idx]);
        recPrint(arr, idx+1);
    }

    public static boolean arrayExists(int[]arr,int element,int idx){
        if(idx==arr.length) return false;
        if (element==arr[idx]) return true;
        return arrayExists(arr, element, idx+1);
    }
}