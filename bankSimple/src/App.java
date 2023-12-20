public class App {
    public static void main(String[] args) throws Exception {
        BankAccount bankAccount = new BankAccount();

        System.out.println("====== Saldo inicial ======");
        bankAccount.setName("Vini");
        bankAccount.setBalance(2000.00);
        System.out.println(bankAccount.accontStatus());

        System.out.println("====== pós deposito ======");
        bankAccount.deposit(20.55);
        System.out.println(bankAccount.accontStatus());

        System.out.println("====== pós saque ======");
        bankAccount.withdraw(10.00);
        System.out.println(bankAccount.accontStatus());

    }
}
