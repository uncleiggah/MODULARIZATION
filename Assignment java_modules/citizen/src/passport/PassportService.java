package passport;
import identification.*;
public class PassportService {
    private NationalIdService ids = new NationalIdService();
    private int counter = 1000;
    public PassportApplication apply(String nin) {
        NationalId id = ids.find(nin);
        if (id == null) {
            return null;
        } else {
            counter++;
            return new PassportApplication("B" + counter, id.getFullName());
        }
    }
}
