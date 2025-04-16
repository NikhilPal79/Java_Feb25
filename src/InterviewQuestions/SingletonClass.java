package InterviewQuestions;

public class SingletonClass {


    /// A Singleton Class is a class that allows only one object (instance) to be created for the entire JVM.
    ///
    /// ✅ Why use Singleton?
    /// To save memory — avoid creating multiple objects
    ///
    /// To maintain a single point of control
    ///
    /// Often used for configurations, loggers, database connections, etc.


    /*
    public class Singleton {
        private static Singleton instance;

        private Singleton() {
            // private constructor to prevent instantiation
        }

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton(); // lazy initialization
            }
            return instance;
        }
    }*/

}
