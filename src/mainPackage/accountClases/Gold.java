package mainPackage.accountClases;

// this is a golden tier account
public class Gold {

    private int creditLimit;
    private final String AccountType = "Gold";
    private String description = "Tu kutta bhar sakta hai duniya ke andar";

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getAccountType() {
        return AccountType;
    }

    public String getDescription() {
        return description;
    }

    public String increaseCreditLimit(int amount) {
        this.creditLimit = this.creditLimit + amount;
        return ("your credit limit is increased to " + this.creditLimit);
    }
}
