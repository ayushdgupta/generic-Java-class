package mainPackage.accountClases;

// this is a platinum tier account
public class Platinum {

    private int creditLimit;
    private final String AccountType = "Platinum";
    private String description = "Tu sugar bhar sakta hai duniya ke andar";

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
