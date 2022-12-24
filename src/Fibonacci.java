public class Fibonacci {

    public static int[] fibonacciSeries(int n) {
        int[] series = new int[n];
        for (int i = 0; i < n; i++) {
            series[i] = fibonacci(i);
        }
        return series;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
