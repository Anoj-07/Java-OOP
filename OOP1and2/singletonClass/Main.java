package OOP1and2.singletonClass;

public class Main {
    public static void main(String[] args) {
        singleton obj = singleton.getInstance();

        singleton obj1 = singleton.getInstance();

        singleton obj2 = singleton.getInstance();

        // all three ref var are pointing to just one object
    }
}
