package tax;

public class TaxReceipt {
    private String businessName;
    private double amount;

    public TaxReceipt(String businessName, double amount) {
        this.businessName = businessName;
        if (amount < 0) {
            this.amount = 0;
        } else {
            this.amount = amount;
        }
    }
    public String getBusinessName() {
        return businessName;
    }
    public double getAmount() {
        return amount;
    }
}
