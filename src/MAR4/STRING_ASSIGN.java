package MAR4;

public class STRING_ASSIGN {
    public static void main(String[] args) {



        ///  CONVERT STIRNG NAME = nikhil IN REVERSE

        ///  HOW TO DO IT
        // CONVERT IT INTO ARRAY THAN REVERSE THE ARRAY

        String s1 = "nikhil";


        char[] charArray = s1.toCharArray(); /// CONVERTING IT STRING INTO ARRAY USING .TOCHARARRAY THAN .VAR


        int n = charArray.length;
        for (int i = 0; i < charArray.length/2; i++) {

            char temp = charArray[i];
            charArray[i] = charArray[n-i-1];
            charArray[n-i-1] = temp;
        }
        System.out.println("reverse array");
        for (char p : charArray ){

            System.out.print(p + " ");/// not using ln in print. //   ( p is just an element )


        }
    }
}
