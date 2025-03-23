package mar22.exception;

public class null1 {
    public static void main(String[] args) {

        try{String n = "nikhil";

        n = null;

        String x = n.toUpperCase();

        System.out.println(x);
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally {
            System.out.println("Executed always");
        }


    }
}
