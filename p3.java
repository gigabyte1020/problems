//Print factorial of a given number
import java.util.Scanner;

public class p3 {

    static int fact(int n){
        if(n==0)
            return 1;
        return n*fact(n-1);
        
    }
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in); 
        System.out.println("Enter a number: ");
        int num= inp.nextInt();
        System.out.println("Factorial of "+num+" = "+ fact(num));

    }
}
