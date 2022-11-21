public class Main {

    public static double largest(double a, double b, double c ){

        double largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        return largest;

    }
    public static double smallest(double a, double b, double c){

        double smallest = c < (a < b ? a : b) ? c : ((a < b) ? a : b);
        return smallest;

    }
    public static void  reverse(int number) {
        {
            if (number < 10) {
                //prints the same number if the number is less than 10
                System.out.println(number);
                return;
            } else {
                System.out.print(number % 10);
                reverse(number / 10);
            }
        }


    }
    public static void primeOrNot(int j){
        int flag =0;
        for(int i =1; i<=j; i++){
            if(j%i == 0){
                flag ++;
            }
        }
        if(flag==2){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not prime");
        }
    }



    public static void main(String[] args)
    {
        System.out.println("Check Number!");

    }
}