package AssignmentsOops.Abstract;

public class Main {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer("APPLE MUSIC PLAYER","BEAUTIFUL TINGS","BENSON BOONE");
        audioPlayer.play();
        audioPlayer.displayDetails();
        System.out.println();

        VideoPlayer videoPlayer = new VideoPlayer("YOUTUBE","TENSION",3.19);
        videoPlayer.play();
        videoPlayer.displayDetails();
        System.out.println();

        ImageDisplay imageDisplay = new ImageDisplay("ZIBLI POTRAIT","ANIMATED",1080*1920);
        imageDisplay.displayImage();
        imageDisplay.displayDetails();

    }
}
