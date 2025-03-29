package mar25.Static2;

public class Calculator {


    static class Addition{

        public void Add(){
            System.out.println("do addition calculation");
        }
    }

    static class Subtraction{

        public void Sub(){
            System.out.println("do sub calculation");
        }
    }

    static class Multiply{

        public void Multi(){
            System.out.println("do multiply calculation");


            class Percentage{

                public void Percent(){
                    System.out.println("do percentage calculation");
                }
            }

            Percentage percentage = new Percentage();
            percentage.Percent();

            /// YOU HAVE TO CREATE OBJECT OF THE CLASS INSIDE THE METHOD IF YOU ARE MAKING CLASS INSIDE THE METHOD
        }
    }

    /// creating static inner class
    static class Division {

        ///  CREATING STATIC METHOD(ScientificCalculation) UNDER STATIC INNER CLASS(StatClass)
        /// UNDER INNER STATIC INNER(Division) CLASS UNDER PUBLIC OUTER CLASS(Calculator)
        static class StatClass {

            static void ScientificCalculation(){
                System.out.println("doing scientific calculation");
            }
        }

        /// creating static method
        static void Div(){
            System.out.println("do divide calculation");


            class Modulus {

                public void Mod(){
                    System.out.println("do modulus calculation");
                }

            }

            Modulus modulus = new Modulus();
            modulus.Mod();
        }
    }
}
