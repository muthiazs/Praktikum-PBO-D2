// Nama : Muthia Zhafira Sahnah 
// NIM : 24060122130071
import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Penarikan Dana");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Transfer");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi yang ingin dilakukan: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan jumlah deposit: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit berhasil.");
                    break;
                case 2:
                    System.out.print("Masukkan jumlah penarikan dana: $");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                        System.out.println("Penarikan berhasil. Saldo saat ini: $" + account.getBalance());
                    } catch (InsufficientFundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Saldo saat ini: $" + account.getBalance());
                    break;
                case 4:
                    System.out.print("Masukkan jumlah transfer: $");
                    double transferAmount = scanner.nextDouble();
                    try {
                        account.transfer(transferAmount);
                        System.out.println("Transfer berhasil. Saldo saat ini: $" + account.getBalance());
                    } catch (InsufficientFundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    exit = true;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
        scanner.close();
    }
}
