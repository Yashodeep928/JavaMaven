package mca2;



public class Test1 {
    public static String palindrome(String s)
    {
    StringBuffer s1=new StringBuffer(s);
    String str=s1.reverse().toString();
    return str;
    }
 
}