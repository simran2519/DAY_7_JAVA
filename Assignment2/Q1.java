//1.Reverse a given stack of 'N' integers using recursion. You are required to make changes in the input parameter itself.
//        Note: You are not allowed to use any extra space other than the internal stack space used due to recursion.
//        Example:
//        Input: [1,2,3,4,5]
//        Output: [5,4,3,2,1]
package DAY_7.Assignment2;

import java.util.Scanner;
import java.util.Stack;
public class Q1
{
    public static void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n+ " ");
        fun(n-1);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter n i.e. upto how much element you want to store in stack");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<=n;i++)
        {
            st.push(i);
        }
        fun(n);
    }
}
