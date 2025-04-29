package apr26.Java_8.MethodReference;

import java.util.Arrays;
import java.util.List;

/// CASE --2
/// if the function is not static then create a object of the class

public class Demo {


    public void beta(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {


        Demo demo = new Demo();
        List<String> students = Arrays.asList("nik","rid","harp","saw","moh");
        students.forEach(demo::beta); ///go inside the Demo and call beta
    }
}
