package OOP5.Interface2SeperateClassSameInterface;

public class CDplayer implements Media{
    @Override
    public void start() {
        System.out.println("music start");
    }

    @Override
    public void stop() {
        System.out.println("music stop");
    }
}
