import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    User user = new User();

    public Menu() {
        int op;
        do {
            System.out.println("O que você quer fazer? ");
            System.out.println("1 - login");
            System.out.println("2 - Cadastro");
            op = sc.nextInt();

            if (op == 1) {
                login();
            }

            if (op == 2) {
                singIN();
            }
        } while (op != 0);
    }

    public void login() {
        System.out.println("Usúario: ");
        String username = sc.next();

        System.out.println("Senha: ");
        String password = sc.next();

        user.login(username, password);
    }

    public void singIN() {
        System.out.println("Usúario: ");
        String username = sc.next();

        System.out.println("Senha: ");
        String password = sc.next();

        user.singIN(username, password);
    }
}
