package DAY_7.Assignment2;

import java.util.Scanner;

public class Q9
{
    public static int lastx(int[] arr,int n,int x)
    {
        if(n==0)return -1;
        if(arr[n-1]==x)return n-1;
        return (lastx(arr,n,x));
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.println(lastx(arr,n,x));
    }
}
