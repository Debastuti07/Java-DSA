import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        boolean isPalindrome=true;
        String str=sc.nextLine();
        int start=0;
        int end=str.length()-1;
        while(start<end){
             if(str.charAt(start)!=str.charAt(end)){
                isPalindrome=false;
             }
             start++;
             end--;
        }
        if(isPalindrome){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }
}
