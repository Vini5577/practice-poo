import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Digite um número: ");
        Double n1 = sc.nextDouble();

        System.out.println("Digite outro número: ");
        Double n2 = sc.nextDouble();

        calculator.setNumbers(n1, n2);

        System.out.println("Soma: " + calculator.addition());
        System.out.println("Substração: " + calculator.subtraction());
        System.out.println("Multiplicação: " + calculator.multiplication());
        System.out.println("Divisão: " + calculator.division());

        sc.close();
    }
}
