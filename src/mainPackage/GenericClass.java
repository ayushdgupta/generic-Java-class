package mainPackage;

import mainPackage.accountClases.*;

import java.util.ArrayList;
import java.util.List;

public class GenericClass {

    public static void main(String[] args) {

        // possible objects of GenericClassConcept
        GenericClassConcept<Integer> demo1 = new GenericClassConcept<Integer>();
//        GenericClassConcept<String> demo2 = new GenericClassConcept<String>();  // this line wll throw an error
            // bcz String is not the child class of Number class, here we can pass only Object of Either
        // Number or child class.

        // possible objects of GenericInerfaceConcept
        GenericInterfaceConcept<Runnable> demo11 = new GenericInterfaceConcept<Runnable>();
//        GenericInterfaceConcept<String> demo2 =
//                                          new GenericInterfaceConcept<String>();  // this line wll throw an error
        // bcz String is not the implementation class of Runnable Interface, here we can pass only Object of Either
        // Runnable or any implementation class. for e.g.
        GenericInterfaceConcept<Thread> demo12 = new GenericInterfaceConcept<Thread>();

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
