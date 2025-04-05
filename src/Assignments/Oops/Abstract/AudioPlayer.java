package Assignments.Oops.Abstract;

public class AudioPlayer extends MediaDevice{

    private String songName;
    private String artist;



    public AudioPlayer(String name, String songName, String artist) {
        super(name);
        this.songName = songName;
        this.artist = artist;
    }

    @Override
    public void displayDetails() {
        System.out.println("audio player : " + name);
        System.out.println("song name : " + songName);
        System.out.println("artist name : " + artist);
    }

    public void play(){
        System.out.println( name + " is playing " + "" + songName + "" + " by artist " + artist);
    }
}
