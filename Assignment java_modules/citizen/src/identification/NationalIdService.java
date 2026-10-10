package identification;

public class NationalIdService {
    public NationalId find(String nin) {
        if ("CM90012345ABCD".equals(nin)) {
            return new NationalId("CM90012345ABCD", "IGGAH MUKHUSIN");
        } else if ("CM85098765WXYZ".equals(nin)) {
            return new NationalId("CM85098765WXYZ", "KIBIRIGE KAUFAH NAJJINGO");
        } else {
            return null;
        }
    }
}
