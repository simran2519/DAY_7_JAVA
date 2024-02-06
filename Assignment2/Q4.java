//4.Problem statement
//        Given a string, compute recursively a new string where all 'x' chars have been removed.
//
//        Sample Input 1 :
//        xaxb
//        Sample Output 1:
//        ab
//        Sample Input 2 :
//        abc
//        Sample Output 2:
//        abc
//        Sample Input 3 :
//        xx
//        Sample Output 3:
package DAY_7.Assignment2;

public class Q4
{
    public static String fun(String str,int n,String g)
    {
        if(n<str.length())
        {
            if(str.charAt(n)!='x')
            {
                g=str.charAt(n)+fun(str,n+1,g);
            }
            else
            {
                g= fun(str,n+1,g);
            }
        }
        return g;
    }
    public static void main(String[] args)
    {
        String str="axbcx";
        int n=0;
        String g="";
        String ans=fun(str,n,g);
        System.out.println(ans);
    }

}
