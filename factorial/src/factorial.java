// This program calculates the factorial of a number.
public class factorial
{
    public static void main(String[] args) {
        System.out.println(fact(7));
    }

    public static int fact(int n) {
        if (n == 0)
            return 1;
        else
            return(n * fact(n-1));

    }

}
