public class factorial
{
    public static void main(String[] args)
    {
        int ans = factorial(12);
        System.out.println(ans);
    }
    public static int factorial(int n)
    {
        System.out.println("DEGBUG"+n);
        if(n<=1)
        {
            return 1;
        }
        return n * factorial(n-1);
    }
}