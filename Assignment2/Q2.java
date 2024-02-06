//2.Problem statement
//        You are given a number 'n'.
//
//        Return number of digits in ‘n’.
//
//        Example:
//        Input: 'n' = 123
//        Output: 3
//        Explanation:
//        The 3 digits in ‘123’ are 1, 2 and 3.
        package DAY_7.Assignment2;

import java.util.Scanner;

public class Q2
{
    public  static int fun(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return  fun(n/10)+1;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a digit");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int ans=fun(n);
        System.out.println(ans);
    }
}
