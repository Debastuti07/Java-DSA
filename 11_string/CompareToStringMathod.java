public class CompareToStringMathod {

        public static int compareTo(String a,String b){
            int result=0;
            int min=Math.min(a.length(), b.length());
            for(int i=0;i<min;i++){
                 if(a.charAt(i)!=b.charAt(i)){
                        result=a.charAt(i)-b.charAt(i) ;
                        break;
                    }
                }
                if(result==0){
                    result=a.length()-b.length();
                     
                }
              
            
            return result;
        }
        public static void main(String[] args) {
        String a="tuti";
        String b="stuti";
        System.out.println(compareTo(a, b));//1 cz s then t comes...so difference is one 
        
        String c="stuti";
        String d="tuti";
        System.out.println(compareTo(c,d));//-1 cz s then t comes...so difference is one 
    }
}
