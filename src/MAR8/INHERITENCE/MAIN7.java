package MAR8.INHERITENCE;

public class MAIN7 {
    public static void main(String[] args) {

        COMPUTER5 computer5 = new COMPUTER5();
        computer5.color = "blue";
        System.out.println(computer5.color);
        System.out.println();


        LAPTOPS6 laptops6 = new LAPTOPS6();
        laptops6.color = "white";
        System.out.println(laptops6.color);
        laptops6.prize = 2500.0;
        System.out.println(laptops6.prize);
        laptops6.company = "dell";
        System.out.println(laptops6.company);
        System.out.println();


        TABLETS tablets = new TABLETS();
        tablets.color ="green";
        System.out.println(tablets.color);
        tablets.company = "windows";
        System.out.println(tablets.company);
        System.out.println(tablets.prize = 1590.0);


    }
}
