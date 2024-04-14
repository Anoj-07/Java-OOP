package OOP5.Interface2SeperateClassSameInterface;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric start");
    }

    @Override
    public void stop() {
        System.out.println("Electric stop");
    }

    @Override
    public void acc() {

    }
}
