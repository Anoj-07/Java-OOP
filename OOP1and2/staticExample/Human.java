package OOP1and2.staticExample;

public class Human {
        int age;
        String name;
        int salary;
        boolean married;
        static long population; // This is not directly related with Object


    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
       Human.population += 1; // this is

    }
}
