//5.Given a string S, remove consecutive duplicates from it recursively.
//        Sample Input 1 :
//        aabccba
//        Sample Output 1 :
//        abcba
//        Sample Input 2 :
//        xxxyyyzwwzzz
//        Sample Output 2 :
//        xyzwz
package DAY_7.Assignment2;

import java.util.Scanner;

public class Q5
{
    public static String removeDuplicate(String s  )
    {
        if(s.length()==1){
            return s;
        }
        if(s.charAt(0)==s.charAt(1)){
            return removeDuplicate(s.substring(1));
        }else{
            return s.charAt(0) + removeDuplicate(s.substring(1));
        }

    }
//    public static String fun(String str,int n,String g)
//    {
//        if(n<str.length()-1)
//        {
//            char ch=str.charAt(n);
//            char ch1=str.charAt(n+1);
//            if(ch!=ch1)
//            {
//                g=ch+fun(str,n+1,g);
//            }
//            else
//            {
//                g=fun(str,n+1,g);
//            }
//        }
//
//        return g;
//    }
    public static void main(String[] args)
    {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String ");
        String s = sc.next();
        String g = "";
        int i =s.length();
        System.out.println( removeDuplicate(s ));
//        Scanner sc = new Scanner(System.in);
//        String str=sc.next();
//        int n=0;
//        String g="";
////        g=g+str.charAt(0);
//        String ans=fun(str,n,g);
//
//        if(str.charAt(str.length()-1)!=str.charAt(str.length()-2))
//        {
//            ans=ans+str.charAt(str.length()-1);
//        }
//        System.out.println(ans);
    }
}
