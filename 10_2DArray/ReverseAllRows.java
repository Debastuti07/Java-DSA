public class ReverseAllRows {
    public static void main(String[] args) {
        int[][]arr={{6,0,2,7},{1,3,7,2},{9,9,4,5}};
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].length-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
