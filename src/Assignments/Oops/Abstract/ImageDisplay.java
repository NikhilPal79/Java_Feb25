package Assignments.Oops.Abstract;

public class ImageDisplay extends MediaDevice {

    private String imageName;
    private double resolution;


    public ImageDisplay(String name, String imageName, double resolution) {
        super(name);
        this.imageName = imageName;
        this.resolution = resolution;
    }

    @Override
    public void displayDetails() {
        System.out.println("image plyaer : " + name );
        System.out.println("image name : " + imageName);
        System.out.println("image resolution : " + resolution);
    }

    public void displayImage() {
        System.out.println( name + " showing "+ imageName + " of " + resolution + " resolution");
    }
}