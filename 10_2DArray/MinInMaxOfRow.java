public class MinInMaxOfRow {
    public static void main(String[] args) {
        int minOfAll=Integer.MAX_VALUE;
        int[][]arr={{6,0,2,12},{1,3,10,2},{9,9,4,5}}; 
        for(int i=0;i<arr.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            if(max<minOfAll){
                minOfAll=max;
            }

        }
        System.out.println(minOfAll);

    }
}
