import java.util.*;
class Letter_Combinations{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        letter_comb(s,"");
    }
    public static String[] keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void letter_comb(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        String key=keypad[s.charAt(0)-'0'];
        for(int i=0;i<key.length();i++){
            letter_comb(s.substring(1),ans+key.charAt(i));
        }
    }
}
