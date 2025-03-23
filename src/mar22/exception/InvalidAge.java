package mar22.exception;

public class InvalidAge extends RuntimeException {

    ///  creating object not constructor
    public InvalidAge(String notValidForDriving) {
        super();
    }
}
