import java.util.ArrayList;

public class Primes {

    //sera usado em ambas funcoes
    private boolean is_prime(int num, ArrayList<Integer> primos) {

        for (Integer div : primos) {
            if (num % div == 0) { //se o numero for divisivel por algum outro numero primo
                return false;     //retornar falso
            }
        }
        return true;
    }

    public ArrayList<Integer> recursive_function(int N) {
        if (N <= 1) {
            System.out.println("Número inválido!");
        }
        ArrayList<Integer> primes = new ArrayList<>(); //lista de numeros primos
        return find_primes(2, N, primes); //funcao recursiva
    }

    private ArrayList<Integer> find_primes(int current, int N, ArrayList<Integer> primes) {
        if (current > N) { //checa condicao de parada
            return primes; //retorna lista de todos os numeros primos ate o p
        } else {
            if (is_prime(current, primes)) {
                primes.add(current);
            }
            return find_primes(current + 1, N, primes);
        }
    }

    public ArrayList<Integer> linear_function(int N) {

        if (N <= 1) {
            System.out.println("Número inválido!");
            return null;
        } else {
            ArrayList<Integer> primes = new ArrayList<Integer>(); //lista de numeros primos

            primes.add(2); //comeca adcionando o 2, por ser o primeiro numero primo e o unico par

            if (N == 2) {
                return primes; }

            for (int i = 3; i <= N; i = i + 2) { //testando apenas os numeros impares

                if (is_prime(i, primes)) {
                    primes.add(i);
                }
            }
            return primes;
        }
    }
}
