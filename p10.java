import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        int num=0,flg=0;
        System.out.println("Enter number:");
        Scanner inp = new Scanner(System.in);
        num=inp.nextInt();    
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flg=1;
            }
        }
        if(flg==1)
        {
            System.out.println("Not a Prime:");
        }
        else
        {
            System.out.println("Prime:");
        }
    }
}
