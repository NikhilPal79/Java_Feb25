package AssignmentsOops.Abstract;

public class VideoPlayer extends MediaDevice{

    private String videoTitle;
    private double duration;

    public VideoPlayer(String name, String videoTitle, double duration) {
        super(name);
        this.videoTitle = videoTitle;
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println(" video player : " + name);
        System.out.println(" video name : " + videoTitle);
        System.out.println(" video duration : " + duration);

    }

    public void play(){
        System.out.println( name + " is playing " + videoTitle + " " + "of duration " + "" + duration );
    }

}
