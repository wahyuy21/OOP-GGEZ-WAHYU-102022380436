package MODUL1.TPMODUL1_WAHYU;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account acc1 = new Account("Aldean", "120220077");
        Account acc2 = new Account("Tegar", "120220078");
        Account acc3 = new Account("Gemilang", "120220079");

        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        acc1.deposit(100000);
        acc2.deposit(200000);
        acc3.deposit(300000);

        System.out.println("Saldo Akun"+acc1.getName()+": "+acc1.getBalance());
        System.out.println("Saldo Akun"+acc2.getName()+": "+acc2.getBalance());
        System.out.println("Saldo Akun"+acc3.getName()+": "+acc3.getBalance());

        acc1.deposit(50000);
        acc2.deposit(20000);

        bank.removeAccount("120220078");
        
        bank.getAllAccounts();
    }
}
