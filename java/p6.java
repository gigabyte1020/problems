//Sum of set of numbers

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        
        int size=0,sum=0;
        System.out.println("Enter set size (max 5): ");
        Scanner inp = new Scanner(System.in);
        size=inp.nextInt();
        System.out.println("Enter numbers to be added: ");
        for(int i=0;i<size;i++)
        {
            sum+=inp.nextInt();
        }
        System.out.println("Sum is "+sum);

    }
}
