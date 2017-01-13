public class FizzBuzz{
    public static void main(String args[]){
        fizzbuzz(1);
    }

    public static void fizzbuzz(int n){
        if(n == 100){
            System.out.println(n + "\nBye!");
        } else {
            if(n % 3 == 0 && n % 5 == 0){
                System.out.println("FizzBuzz");
                fizzbuzz(++n);
            } else if(n % 3 == 0){
                System.out.println("Fizz");
                fizzbuzz(++n);
            } else if(n % 5 == 0){
                System.out.println("Buzz");
                fizzbuzz(++n);
            } else {
                System.out.println(n);
                fizzbuzz(++n);
            }
        }
    }
}
