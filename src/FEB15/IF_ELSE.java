package FEB15;

public class IF_ELSE {
    public static void main(String[] args) {


        int NoOfDays = 366;

        if(NoOfDays % 4 ==0){
            System.out.println("is a leap year");
        }else {
            System.out.println("not a leap year");
        }


        int x = 22;
        if (x % 2 == 0){
            System.out.println("is even number");
        }else{
            System.out.println("is odd number");
        }

        int q = 10;
        int w = 20;
        int e = 15;

        if (q > w && w > e)  {
            System.out.println("q is GREATEST");
        }
        else if (w > e) {
            System.out.println("w is Greatest");
        }
        else {
            System.out.println("e is Greatest");
        }

    }
}
