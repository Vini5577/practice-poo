public class BankAccount {

    private String name;
    private Double balance;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return this.balance;
    }

    public Double withdraw(Double value) {
        if (value <= 0) {
            throw new RuntimeException("Erro: Valor não pode ser menor ou igual a 0!!");
        }

        return this.balance -= value;
    }

    public Double deposit(Double value) {
        if (value <= 0) {
            throw new RuntimeException("Erro: Valor não pode ser menor ou igual a 0!!");
        }

        return this.balance += value;
    }

    public String accontStatus() {
        String name = getName();
        Double balance = getBalance();

        return "Nome: " + name + "\nSaldo atual: " + balance;
    }
}
