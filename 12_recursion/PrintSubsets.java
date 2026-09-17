import java.util.ArrayList;
import java.util.List;

public class PrintSubsets {
    public static void main(String[] args) {
        String s="abc";
        List<String>list=new ArrayList<>();
        Subsets("",s,0,list);
        System.out.println(list);
    }
    public static void Subsets(String ans,String s,int idx,List<String>list){
        if(idx==s.length()){
            if(ans.length()!=0){
            list.add(ans);
        }
        return ;
        }
        char ch=s.charAt(idx);
        Subsets(ans+ch,s,idx+1,list);//pick
        Subsets(ans,s,idx+1,list);//skip

    }
}
