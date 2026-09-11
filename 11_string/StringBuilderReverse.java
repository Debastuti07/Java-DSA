public class StringBuilderReverse {
    public static void main(String[] args) {
        String s="Megha";
        StringBuilder sb=new StringBuilder(s);
        // sb.append("de");
        // System.out.println(sb);
        // sb.reverse();
        int i=0;
        int j=sb.length()-1;
        while(i<=j){
            char temp1=sb.charAt(i);
            char temp2=sb.charAt(j);
            sb.setCharAt(i, temp2);
            sb.setCharAt(j, temp1);

            i++;
            j--;
            
        }
        System.out.println(sb);
    }
}
