
import java.util.*;


public class Main {

    public static ArrayList<Character> list;


    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sorted(s);

    }
    public static void sorted(String s){
        int i;String str="";
       list = new ArrayList<>();
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3')
                list.add(s.charAt(i));
        }
               Collections.sort(list);
        for(Character in:list){
            str = str+in+"+";

        }
        System.out.print( str.substring(0,str.length()-1).trim());
        }
    }

