import java.util.*;
public class Main {
    public static void main(String[] args) {

        // Initialize the Rest service
        SpringApplication.run(FibonacciController.class, args);

        // Calculate the 5th Fibonacci number using the Facade
        FibonacciFacade facade = new FibonacciFacade();
        int n = 5;
        int fibonacci = facade.getNthFibonacciNumber(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci);

        // Calculate the first 5 Fibonacci numbers using the Facade
        int[] series = facade.getFirstNFibonacciNumbers(n);
        System.out.println("The first " + n + " Fibonacci numbers are: " + Arrays.toString(series));
    }
}
