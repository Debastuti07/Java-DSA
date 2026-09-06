

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[]a={2,5,6,9,20};
        int[]b={1,3,4,5,7,8};

        int[]c=new int[a.length+b.length];

        merge(a, b, c);
        for(int element:c){
            System.out.print(element+" ");
        }

    }

    public static void merge(int[]a,int[]b,int[]c){
         int i=0,j=0,k=0;

         while (i<a.length && j<b.length) {
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
           
               while(j<b.length){//i completed 
                  c[k++]=b[j++];
               }
            
            while(i<a.length){//j completed
                c[k++]=a[i++];
            }
            
         }
    }
}
