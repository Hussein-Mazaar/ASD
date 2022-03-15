package backend.commons;

import backend.creditcard.observer.EmailSender;
import framework.AccountServiceBak;

public class BankAccountServiceBak extends AccountServiceBak {
    private static volatile BankAccountServiceBak instance;

    private BankAccountServiceBak() {
        super(BankAccountDAO.getInstance());
        this.registerObserver(new EmailSender(this));
    }

    public static BankAccountServiceBak getInstance() {
        if (instance == null) {
            synchronized (BankAccountServiceBak.class) {
                if (instance == null) {
                    instance = new BankAccountServiceBak();
                }
            }
        }

        return instance;
    }

    @Override
    public Account initAccount(String accountType, Customer customer) {
        return null;
    }

    public void withdraw(String accountNumber, double amount) {
        Log.getLogger().write("withdraw");
    }

    public void deposit(String accountNumber, double amount) {
        Log.getLogger().write("deposit");
    }
}
