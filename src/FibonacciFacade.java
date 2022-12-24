public class FibonacciFacade {

    private Fibonacci fibonacci;

    public FibonacciFacade() {
        this.fibonacci = new Fibonacci();
    }

    public int getNthFibonacciNumber(int n) {
        return fibonacci.fibonacci(n);
    }

    public int[] getFirstNFibonacciNumbers(int n) {
        return fibonacci.fibonacciSeries(n);
    }
}
