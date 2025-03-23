package mar22.exception;

public class DriversMain {
    public static void main(String[] args) {

        LicenceAuthority licenceAuthority = new LicenceAuthority();

        licenceAuthority.checkValidAge();

        /*
        Exception in thread "main" mar22.exception.InvalidAge
        at mar22.exception.LicenceAuthority.checkValidAge(LicenceAuthority.java:21)
        at mar22.exception.DriversMain.main(DriversMain.java:8)
        */

    }
}
