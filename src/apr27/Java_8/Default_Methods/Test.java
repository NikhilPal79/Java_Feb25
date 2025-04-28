package apr27.Java_8.Default_Methods;

public class Test implements Left, Right{

    ///  both interface have same method m1 and with same signature m1
    /// so in override method we don't know which method is called


    ///  THIS IS ABIGUITY PROBLEM

    @Override
    public void m1() {
        Right.super.m1();  /// WE CAN CHANGE RIGHT TO LEFT
    }
}
