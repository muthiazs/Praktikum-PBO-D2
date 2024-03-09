// Nama : Muthia Zhafira Sahnah 
// NIM : 24060122130071
public class BankAccount {
    private double balance;
    private final double MIN_BALANCE = 100.0; // Saldo minimal

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - amount < MIN_BALANCE) {
            throw new InsufficientFundsException("Saldo tidak mencukupi untuk melakukan penarikan");
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }

    public void transfer(double amount) throws InsufficientFundsException {
        if (balance - amount < MIN_BALANCE) {
            throw new InsufficientFundsException("Saldo tidak mencukupi untuk melakukan transfer");
        }
        balance -= amount;
        System.out.println("Transferred: $" + amount);
    }

    public double getBalance() {
        return balance;
    }
}
  