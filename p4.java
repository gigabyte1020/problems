//Multiplication table of a given number upto 10
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+" x "+num+" = "+ i*num);

        }
    }
}
