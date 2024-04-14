package OOP4.Access;

import OOP4.A;

public class InstanceofOperator extends A {
    public InstanceofOperator(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        InstanceofOperator obj = new InstanceofOperator(1, "hi");
        System.out.println(obj instanceof A);

        System.out.println(obj.getClass().getName());
    }
}
