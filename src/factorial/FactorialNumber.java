package factorial;

public class FactorialNumber {
    public static void doFactorial (int number)
    {
        int fact =1;
        for(int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }

}
