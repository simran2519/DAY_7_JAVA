//1.Given an array of integers, keep a total score based on the following:
//        1. Add 1 point for every even number in the array
//        2. Add 3 points for every odd number in the array, except for the number 5
//        3. Add 5 points for every time you encounter a 5 in the array
//        If an empty or null array is passed to the function, return 0.
//        Examples:
//        Input: [1,2,3,4,5]
//        Output: 13
//        Input: [17,19,21]
//        Output: 9
//        Input: [5,5,5]
//        Output: 15
package DAY_7.Assignment1;
import java.util.Scanner;
public class Q1_TotalScore
{
    public static int getScore(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                count+=1;
            }
            else if(arr[i]%2!=0 && arr[i]!=5)
            {
                count+=3;
            }
            else if(arr[i]==5)
            {
                count+=5;
            }
        }
        if(arr.length==0)
        {
            return 0;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans=getScore(arr);
        System.out.println(ans);
    }
}
