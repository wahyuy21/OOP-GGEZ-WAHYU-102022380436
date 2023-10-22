package MODUL1.TPMODUL1_WAHYU;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(String accountNumber) {
     Account toRemove = getAccount(accountNumber);
     if (toRemove != null) {
         accounts.remove(toRemove);
         System.out.println("Akun "+ toRemove.getName() +" Telah Dihapus.");
     }
    }

    public Account getAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public void getAllAccounts() {
        for (Account acc : accounts) {
            System.out.println("Nama : "+acc.getName() + ", " +"Nomor Akun : "+acc.getAccountNumber() + ", " +"Saldo : "+acc.getBalance());
        }
    }
}
