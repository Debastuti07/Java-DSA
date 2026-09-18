public class MergeSort {
    public static void main(String[] args) {
        int []arr={5,2,8,4,1,6,7,3};
        sort(arr);
        for(int element:arr){
            System.out.print(element+" ");
        }
    }   
    public static void sort(int[]arr){
        int n=arr.length;
        if(n==1) return ;//for length 1 
        //create two new empty arrays of size n/2 each
        int[]a=new int[n/2];
        int[]b=new int[n-n/2]; 

        //copy paste arr into a and b
        int idx=0;
        for(int i=0;i<a.length;i++){
            a[i]=arr[idx++];
        }
        for(int i=0;i<b.length;i++){
            b[i]=arr[idx++];
        }
        //step 3 is magic sort the small array
        sort(a);
        sort(b);
        //step 4 merge a and b into arr 
        merge(a, b, arr);

        
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
           
            
        }
        while(j<b.length){//i completed 
           c[k++]=b[j++];
        }
     
     while(i<a.length){//j completed
         c[k++]=a[i++];
     }
    }
}
