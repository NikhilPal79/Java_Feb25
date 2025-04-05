package Assignments.Oops.Abstract;

public abstract class MediaDevice {

    /// creating attributes

    protected String name ;

    public MediaDevice(String name) {
        this.name = name;
    }

    ///  creating method
    public abstract void displayDetails();
}
