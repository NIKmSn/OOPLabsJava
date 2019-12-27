
public class Recursion {
    public static void main(String[] args) {
        System.out.println(digitSum(74));
        System.out.println(isPrime(17));
        recursion(156, 2);
    }
    private static int digitSum(int n)
    {
        if (n < 10) {
            return n;
        }
        else {
            /*
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
                sum += digitSum(n);
            }
            */
            return n%10 + digitSum(n/10);
        }
    }

    private static boolean isPrime(int number) {
        if (number == 0 || number == 1)
            return true;
        return div(number, 2);
    }

    private static boolean div(int number, int divider) {
        if (number == divider)
            return true;

        if (number % divider == 0)
            return false;
        else
            return div(number, divider + 1);
    }

    public static void recursion(int number, int divider) {

        if (divider > number / 2) {
            System.out.println(number);
            return;
        }

        if (isPrime(divider) && (number % divider == 0)){
            System.out.println(divider);
            recursion(number/divider, divider);
        }
        else {
            recursion(number, divider + 1);
        }
    }
}
