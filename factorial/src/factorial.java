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
// This is a test comment.
