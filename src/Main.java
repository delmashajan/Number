public class Main {

    public static double largest(double a, double b, double c ){

        double largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        return largest;

    }
    public static double smallest(double a, double b, double c){

        double smallest = c < (a < b ? a : b) ? c : ((a < b) ? a : b);
        return smallest;

    }
    public static int  reverse(int number)
    {
        {
            if (number < 10)
            {
                //prints the same number if the number is less than 10
                System.out.println(number);
                return;
            }
            else
            {
                System.out.print(number % 10);
                reverse(number/10);
            }
        }


    }


    public static void main(String[] args)
    {
        System.out.println("Check Number!");

    }
}