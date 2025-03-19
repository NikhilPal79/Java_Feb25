package MAR18.INTERFACE2;

public class Samsung implements SmartPhone{

    @Override
    public void makeCalculation() {
        System.out.println("Samsung have simple calculator ");

    }

    @Override
    public void clickPictures() {
        System.out.println("Samsung have better night mode");

    }

    @Override
    public void showTime() {
        System.out.println("Samsung show time digitally");

    }

    @Override
    public void internetOperator() {
        System.out.println("Samsung have chrome browser");

    }

    @Override
    public void musicPlayer() {
        System.out.println("Samsung have mp3 music player");

    }
}
