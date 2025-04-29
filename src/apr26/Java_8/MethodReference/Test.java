package apr26.Java_8.MethodReference;

import java.util.Arrays;
import java.util.List;

public class Test {

    public  static void alpha(String s){
        System.out.println(s);

    }


    public static void main(String[] args) {


        List<String> students = Arrays.asList("nik","rid","harp","saw","moh");
        students.forEach(Test::alpha);  /// go inside the Test and call alpha

        /// :: ====> method reference operator

    }
}
