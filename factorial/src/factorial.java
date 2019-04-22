import java.util.Scanner;

// This program calculates the factorial of a number.
public class factorial
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number you'd like to calculate its factorial then press enter: ");
        int n = scanner.nextInt();
        System.out.println("The factorial of the number "+n+" is : "+fact(n));
    }

    public static int fact(int n) {
        if (n == 0)
            return 1;
        else
            return(n * fact(n-1));
    }

}
