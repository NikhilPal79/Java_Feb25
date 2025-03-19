package MAR18.INTERFACE2;

public interface SmartPhone extends Clock, Caclulator,Camera,MusicPlayer,InternetOperator {

    @Override
    void makeCalculation();

    @Override
    void clickPictures();

    @Override
    void showTime();

    @Override
    void internetOperator();

    @Override
    void musicPlayer();
}
