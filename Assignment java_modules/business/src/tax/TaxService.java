package tax;
import registration.Business;
public class TaxService {
    public TaxReceipt fileTax(Business business, double income) {
        if (business == null) {
            return null;
        }
        if (income <= 0) {
            return null;
        }
        return new TaxReceipt(business.getName(), income * 0.30);
    }
}
