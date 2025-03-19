package MAR18.INTERFACE;

import MAR1.S_BLOCK_MAIN;

public class MAIN {
    public static void main(String[] args) {


        BANK bmo = new BMO();
        bmo.rateOfInterest();

        BANK rbc = new RBC();
        rbc.rateOfInterest();

        BANK scotia = new SCOTIA();
        scotia.rateOfInterest();

    }
}
