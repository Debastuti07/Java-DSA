public class Sum {
    public static void main(String[] args) {
        int[][]arr={{6,0,2,7},{1,3,7,2},{9,9,4,5}}; 
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
