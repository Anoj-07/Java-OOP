package OOP4.Access;

import OOP4.A;

public class subclass extends A {
    public subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        subclass obj = new subclass(39, "anoj");
        String name1 = obj.name;//protected
    }
}
