//Sum of digits
import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        int x=0,temp=0,y=0,sum=0;
        System.out.println("Enter a number:");
        Scanner inp = new Scanner(System.in);
        x=inp.nextInt();
        temp=x;
        while(temp!=0)
        {
            sum+=temp%10;
            temp/=10;


        }
        System.out.println("Sum of digits= "+sum);
    }
}
