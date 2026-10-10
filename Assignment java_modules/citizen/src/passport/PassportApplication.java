package passport;

public class PassportApplication {
    private String passportNumber;
    private String holderName;

    public PassportApplication(String passportNumber, String holderName) {
        this.passportNumber = passportNumber;
        if (holderName == null) {
            this.holderName = "Unknown";
        } else {
            this.holderName = holderName;
        }
    }
    public String getPassportNumber() {
        return passportNumber;
    }
    public String getHolderName() {
        return holderName;
    }
}
