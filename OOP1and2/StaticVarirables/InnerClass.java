package OOP1and2.StaticVarirables;

//Outside class cannot be statics
public class InnerClass {
    static class A{ // after giving static it is not depend on Class
        // If you donot use static then it give error in main static in reference instances
        String name;

        public A(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        A a = new A("Anoj");
        A b = new A("Rawal");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

//Outsider class cannot be static
//static class A{
//
//}
