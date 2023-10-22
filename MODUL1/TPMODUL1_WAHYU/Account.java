package MODUL1.TPMODUL1_WAHYU;

public class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Saldo Akun "+this.getName()+" Setelah Menyetor: "+this.getBalance());
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Saldo Akun "+this.getName()+" Setelah Menarik Uang: "+this.getBalance());
            return true;
        } else {
         System.out.println("Saldo "+this.getName()+" Tidak Cukup");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}