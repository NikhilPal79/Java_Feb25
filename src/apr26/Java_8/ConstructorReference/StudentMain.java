package apr26.Java_8.ConstructorReference;

public class StudentMain {
    public static void main(String[] args) {

        ///  implementation of StudentInter Interface that will return student object with the help of lambda

        StudentInter studentInter = ()->{
            return new Student();

        };

        Student student = studentInter.getStudent();
        student.display();
        System.out.println();



        /// using constructor reference

        StudentInter studentInter1 = Student::new;

        Student student1 = studentInter.getStudent();     ///calling constructor
        student1.display();                               /// calling method



    }
}
