//3.Problem statement
//        You are given a string ‘str’ of even length. Your task is to find out if we divide the ‘str’ from the middle, will both the substrings contain an equal number of vowels or not.
//        For Example:
//        You are given, ‘str’= ‘codingninjas’, when we split this string we get, ‘coding’ and ‘ninjas’ which both contain 2 vowels each. Hence the answer is ‘True’.
//        Note :
//        You do not need to print anything. It has already been taken care of. Just implement the given function.
//        Sample Input 1:
//        2
//        codingninjas
//        helloworld
//        Sample Output 2:
//        True
//        False
//        Explanation:
//        For the first test case, ‘str’= ‘codingninjas’, when we split this string we get, ‘coding’ and ‘ninjas’ which both contain 2 vowels each. Hence the answer is ‘True’.
//
//        For the second test case, ‘str’= ‘helloworld’, when we split this string we get ‘hello and ‘world’, which contain 2 and 1 vowels respectively. Hence the answer is ‘False’.
//        Sample Input 2:
//        2
//        Aa
//        AbbaaA
//        Sample Output 2:
//        True
//        False
package DAY_7.Assignment1;
import java.util.Scanner;
public class Q3_ProblemStatement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        if(str.length()%2!=0)
        {
            System.out.println("Enter an even String");
        }
        else
        {
            int mid=(str.length()/2);
//            String str1=str.substring(0,mid);
//            String str2=str.substring(mid,str.length());
            int count1=0;
            int count2=0;
            for(int i=0;i<mid;i++)
            {
                char ch=str.charAt(i);
                if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
                {
                    count1+=1;
                }
            }
            for(int j=mid;j<str.length();j++)
            {
                char ch=str.charAt(j);
                if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
                {
                    count2+=1;
                }
            }
            if(count1==count2)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("NO");
            }
        }

    }
}
