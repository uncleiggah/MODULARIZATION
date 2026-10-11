import registration.*;
import tax.*;
import identification.*;
import passport.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(" \n Uganda e-Government Portal");
        NationalIdService ids = new NationalIdService();
        NationalId id = ids.find("CM90012345ABCD");
        if (id != null) {
            System.out.println("National ID: VALID for " + id.getFullName());
        } else {
            System.out.println("National ID: INVALID");
        }
        
        PassportService passports = new PassportService();
        PassportApplication p = passports.apply("CM85098765WXYZ");
        if (p != null) {
            System.out.println("Passport: " + p.getPassportNumber() + " for " + p.getHolderName());
        } else {
            System.out.println("Passport REFUSED: invalid NIN");
        }

        PassportApplication fake = passports.apply("FAKE123");
        if (fake != null) {
            System.out.println("Passport: " + fake.getPassportNumber());
        } else {
            System.out.println("Passport REFUSED: invalid NIN");
        }

        BusinessRegistrationService registry = new BusinessRegistrationService();
        Business b = registry.register("Nakato Coffee Ltd", "CM90012345ABCD");
        if (b != null) {
            System.out.println("Business registered: " + b.getName() + " (owner: " + b.getOwnerName() + ")");
        } else {
            System.out.println("Registration REFUSED: invalid owner NIN");
        }

        TaxService taxService = new TaxService();
        TaxReceipt r = taxService.fileTax(b, 1000000);
        if (r != null) {
            System.out.println("Tax for " + r.getBusinessName() + ": UGX " + r.getAmount());
        } else {
            System.out.println("Tax REFUSED: business not registered");
        }

    }
}
