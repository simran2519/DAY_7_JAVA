//3.Problem statement
//        Given an array of length N, you need to find and return the sum of all elements of the array.
//
//        Do this recursively.
//        Sample Input 1 :
//        3
//        9 8 9
//        Sample Output 1 :
//        26
//        Sample Input 2 :
//        3
//        4 2 1
//        Sample Output 2 :
//        7
        package DAY_7.Assignment2;

import java.util.Scanner;

public class Q3
{
    public static int fun(int arr[],int n,int sum)
    {
        if(n>0)     //5
        {
            sum=arr[n-1]+ fun(arr,n-1,sum);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of array");
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int ans=fun(arr,n,sum);
        System.out.println(ans);

    }
}
