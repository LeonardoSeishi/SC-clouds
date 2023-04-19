import java.util.ArrayList;
import java.util.Scanner;

//o main apenas mostrara as opcoes para o teste das funcoes
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); //scanner que sera usado para ler as resposta no menu

        boolean aux = true;
        while (aux) {
            int option;
            System.out.println("\nMENU DE OPÇOES\n#-------------#");
            System.out.println("1-Fibonacci\n2-Primos\n3-Sair");
            System.out.println("#-------------#");
            System.out.printf("Resposta:");
            option = read.nextInt();

            switch (option) {
                case 1:
                    Fibonacci fibonacci = new Fibonacci();
                    System.out.println("\n1-Recursiva\n2-Linear\n3-voltar");
                    System.out.printf("opcao:");
                    int function = read.nextInt();
                    switch (function) {
                        case 1:
                            System.out.printf("\nnumero da sequencia: ");
                            int N = read.nextInt();
                            int f = fibonacci.recursive_function(N);
                            System.out.println("fibonacci por recursao:");
                            System.out.println("fib("+N+") = "+f);
                            break;
                        case 2:
                            System.out.printf("\nnumero da sequencia: ");
                            int Nl = read.nextInt();
                            int fl = fibonacci.linear_function(Nl);
                            System.out.println("fibonacci por funcao linear:");
                            System.out.println("fib("+Nl+") = "+fl);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    Primes primes = new Primes();
                    System.out.println("\n1-Recursiva\n2-Linear\n3-voltar");
                    System.out.printf("opcao: ");
                    int function_p = read.nextInt();
                    switch (function_p) {
                        case 1:
                            System.out.printf("\nnumeros primos ate: ");
                            int N = read.nextInt();
                            ArrayList<Integer> p = primes.recursive_function(N);
                            System.out.println("primos por recursao:");
                            System.out.println("p("+N+") = "+p);
                            break;
                        case 2:
                            System.out.printf("\nnumeros primos ate: ");
                            int Nl = read.nextInt();
                            ArrayList<Integer> pl = primes.linear_function(Nl);
                            System.out.println("primos por funcao linear:");
                            System.out.println("p("+Nl+") = "+pl);
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    aux = false;
            }
        }
    }
}