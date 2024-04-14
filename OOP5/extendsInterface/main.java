package OOP5.extendsInterface;

public class main implements B{
    @Override
    public void fun() {
        System.out.println("hi");
    }

    @Override
    public void greet() {
        System.out.println("hello");
    }
}

class hi{
    public static void main(String[] args) {
        B obj = new main();
        obj.fun();
        obj.greet();
    }
}
