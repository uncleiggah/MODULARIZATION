package registration;
import identification.*;
public class BusinessRegistrationService {
    private NationalIdService ids = new NationalIdService();
    public Business register(String businessName, String ownerNin) {
        NationalId owner = ids.find(ownerNin);
        if (owner == null) {
            return null;
        } else {
            return new Business(businessName, owner.getFullName());
        }
    }
}
