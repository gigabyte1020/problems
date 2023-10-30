//Check if armstrong number 

import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        int temp=0,digit=0,len=0,num=0,sum=0;
        System.out.println("Enter a number:");
        Scanner inp = new Scanner(System.in);
        num=inp.nextInt();
        temp=num;
        while(temp>0)
        {
            temp/=10;
            len++;
        }
        temp=num;
        while(temp>0)   
        {      
            digit = temp % 10;   
            sum +=  (Math.pow(digit, len));
            temp = temp/10;   
        }  
        if(num==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
