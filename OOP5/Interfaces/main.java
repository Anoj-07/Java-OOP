package OOP5.Interfaces;



public class main{
    public static void main(String[] args) {
        engine Car = new car();
        Brake car2 = new car();
        media car3 = new car();

        Car.acc();
        car2.brake();
        Car.start();
        Car.stop();

        car3.start();

    }
}
