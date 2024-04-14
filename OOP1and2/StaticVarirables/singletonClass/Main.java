package OOP1and2.StaticVarirables.singletonClass;

public class Main {
    public static void main(String[] args) {
        singleton obj = singleton.getInstances();

        singleton obj1 = singleton.getInstances();

        singleton obj2 = singleton.getInstances();

        // all three ref var are pointing to just one object
    }
}
