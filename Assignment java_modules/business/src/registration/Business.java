package registration;

public class Business {
    private String name;
    private String ownerName;

    public Business(String name, String ownerName) {
        if (name == null) {
            this.name = "Unnamed Business";
        } else {
            this.name = name;
        }
        this.ownerName = ownerName;
    }
    public String getName() {
        return name;
    }
    public String getOwnerName() {
        return ownerName;
    }
}
