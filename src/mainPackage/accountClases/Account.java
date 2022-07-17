package mainPackage.accountClases;

/**
 * this is the geeric class or template which can accept Golden or platinum or any type of account object
 * @param <T>
 */
public class Account<T> {

    T accountType;

    public Account(){
        // this is a default constructor
        // this line added to avoid sonar issues
    }

    public Account(T accountType){
        this.accountType = accountType;
    }

    public T getAccountType(){
        return this.accountType;
    }

    public void setAccountType(T accountType) {
        this.accountType = accountType;
    }

    public void showClass(){
        System.out.println("class of object is " + this.accountType.getClass().getName());
    }

}
