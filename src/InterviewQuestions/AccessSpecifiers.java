package InterviewQuestions;

public class AccessSpecifiers {

    ///  also known as access modifiers

    // Access specifiers (a.k.a. access modifiers) in Java define the visibility or accessibility of classes, methods,
    // and variables. There are four main types:

    /// 1. PRIVATE

    /// Accessible only within the same class.
    /// Not accessible from any other class—even subclasses.( Hide internal logic or sensitive data.)
    /*private int age;

    private void display() {
        System.out.println("Private Method");
    }*/

    /// 2. DEFAULT (no modifier)

    /// When no specifier is declared, it's package-private.
    /// Accessible only within the same package.
    /// Not accessible from outside its package.(Allow access only within the same package.)
    /*int age; // default access
    void display() {
        System.out.println("Default Access");
    }*/

    ///  3. PUBLIC

    /// Accessible from any other class, anywhere (any package)
    ///  use case(APIs, services, or classes meant for external use.)
    public String name;

    public void show() {
        System.out.println("Public Method");
    }

    /// 4. PROTECTED

    /// Accessible within the same package and also in subclasses (even in different packages).
    protected int id;

    protected void print() {
        System.out.println("Protected Method");
    }


    /// COMPARISON

    /*

    Modifier        | Same Class | Same Package | Subclass (diff pkg) | Other Packages
    private             | ✅ |       ❌ |              ❌ |                 ❌
    default             | ✅ |       ✅ |              ❌ |                 ❌
    protected           | ✅ |       ✅ |              ✅ |                 ❌
    public              | ✅ |       ✅ |              ✅ |                 ✅

    */






}
