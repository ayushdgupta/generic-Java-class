package mainPackage;

import mainPackage.accountClases.Account;
import mainPackage.accountClases.Gold;
import mainPackage.accountClases.Platinum;

public class GenericClass {

    public static void main(String[] args) {

        // for golden account
        Gold goldenAccountObject = new Gold();
        Account<Gold> account1 = new Account<>();
        account1.setAccountType(goldenAccountObject);

        System.out.println("----------------------- Account1 details --------------------");
        account1.showClass();
        System.out.println(account1.getAccountType());
        System.out.println(account1.getAccountType().getAccountType());
        System.out.println(account1.getAccountType().getCreditLimit());
        System.out.println(account1.getAccountType().getDescription());
        account1.getAccountType().setCreditLimit(1000);
        System.out.println(account1.getAccountType().increaseCreditLimit(2000));

        // for platinum account
        Platinum platinumAccount = new Platinum();
        Account<Platinum> account2 = new Account<>(platinumAccount);

        System.out.println("----------------------- Account2 details --------------------");
        account2.showClass();
        account2.getAccountType().setCreditLimit(2000);
        System.out.println(account2.getAccountType());
        System.out.println(account2.getAccountType().getAccountType());
        System.out.println(account2.getAccountType().getCreditLimit());
        System.out.println(account2.getAccountType().getDescription());
        System.out.println(account2.getAccountType().increaseCreditLimit(2000));
    }
}
