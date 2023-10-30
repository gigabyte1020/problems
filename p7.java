//Check if palindrome
import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        String str="",rev="";
        System.out.println("Enter string/number: ");
        Scanner inp = new Scanner(System.in);
        str=inp.nextLine();
        char[] ch={};
        ch=str.toCharArray();
        int len=str.length();
        for (int i=len-1;i>=0;i--)
        {
            rev+=ch[i];
        }
        if(rev.equals(str))
        {
        System.out.println("Palindrome ");
        }
        else
        {
        System.out.println("Not Palindrome ");
        }
    }
}
