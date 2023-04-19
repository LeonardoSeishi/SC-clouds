public class Fibonacci {

    public int recursive_function(int N) {
        if (N < 0) {
            System.out.println("Numero invalido");
            return 0;
        } else if (N == 0) {
            return 0;
        } else if (N <= 2) {
            return 1;
        } else {
            return find_fibonnaci(N);
        }
    }

    private int find_fibonnaci(int N) {
        if (N <= 2) {
            return 1;
        }
        return find_fibonnaci(N - 1) + find_fibonnaci(N - 2);

    }

    public int linear_function(int N) {
        if (N < 0) {
            System.out.println("Numero invalido");
            return 0;
        } else if (N == 0) {
            return 0;
        } else if (N <= 2) {
            return 1;
        } else {
           int fib = 0;  //valor atual
           int fib1 = 1; //valor fib(atual - 1)
           int fib2 = 1; //valor fib(atual - 2)
           for (int i = 3; i<=N; i++) {
               fib = fib1 + fib2;
               fib2 = fib1;
               fib1 = fib;
           }
           return fib;
        }
    }
}