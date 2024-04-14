package OOP5.Interfaces;

public class car implements Brake,engine,media {

    @Override
    public void brake() {
        System.out.println("Brake");
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void acc() {
        System.out.println("acc");
    }
}

