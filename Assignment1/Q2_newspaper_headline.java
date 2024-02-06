//2. Assume you are working at a newspaper. Your task is to prepare a page with titles that writers send you. Your cat was walking over your keyboard and accidentally added characters. Now you need to filter out the titles and prepare them for publishing.
//        Assume that titles are in an array of strings. You need to do the following procedures on it:
//        • Create a single string by concatenating the strings in the array
//        • Delete all numeric symbols from the string
//        • Capitalize the first character of each word in the string
//        Don't forget to think through any corner cases.
//        Examples:
//        Input: ["break3ing news5:", "1A 1circle is round!"]
//        Output: "Breaking News: A Circle Is Round!"
//        Input: ["", "Fresh fried fish fried"] - fish fresh
//        Output: "Fresh Fried Fish Fish Fresh - Fried"
//        Input: ["2Here2 ", "is", our STRING"]
//        Output: "Here Is Our STRING"
//        Input: ["123", "eat; sleep; repeat", "321"]
//        Output: "Eat; Sleep; Repeat"
package DAY_7.Assignment1;

import java.util.Scanner;

public class Q2_newspaper_headline
{
    public static String conc(int n)               //1. Concatination of Strings
    {
        Scanner sc= new Scanner(System.in);
        String g="";
        for(int i=1;i<=n;i++)
        {
            String s1=sc.nextLine();
            g=g+s1+" ";
        }
        g.trim();
        return g;
    }

    public static String delnum(String str)
    {
        String g="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>=48 && ch<=57)
            {
                continue;
            }
            g=g+ch;
        }
        return g;
    }

    public static String capt(String str)       //hiii how
    {
        String bigg="";
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            String g="";
            String str1=arr[i];       //hiii
            char newc=' ';
            char ch=str1.charAt(0);
            if(ch>=97 && ch<=122)
            {
                newc=(char)(ch-32);
                g=g+newc;             //H
            }
            else
            {
                g=g+ch;              //H
            }
            for(int j=1;j<str1.length();j++)
            {
                char ch1=str1.charAt(j);
                g=g+ch1;              //Hiii
            }
            bigg=bigg+g+" ";   //Hiii
        }
        bigg.trim();
        return bigg;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of words you want to enter for the title");
        int n=sc.nextInt();
        String g=conc(n);
        String g1=delnum(g);
        String ans=capt(g1);
        System.out.println(ans);
    }
}
