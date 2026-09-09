public class ForEachLoop {
    public static void main(String[] args) {
        int[][]arr={{6,0,2,7},{1,3,7,2},{9,9,4,5}};
         for(int[]a:arr){
            for(int element:a){
                System.out.print(element+" ");
            }
            System.out.println();
         }

    }
}
