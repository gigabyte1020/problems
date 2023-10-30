//Print natural numbers upto 50 and show if odd or even
public class p2 {
    public static void main(String[] args) {
        int i=1;
        while (i<=50)
        {
            if (i%2==0)
            {
                System.out.println(i + " is even");
            }
            else
            {
                System.out.println(i + " is odd");
            }
            i++;
        }
    }
}
