package OOP1and2.staticExample;

public class Main {
    public static void main(String[] args) {
        Human anoj = new Human(20, "Anoj", 1500000, false);
        Human Rai = new Human(20, "Rohit", 100000, false);

        if (anoj.salary > Rai.salary){
            System.out.println("more");
        }else System.out.println("less");

        System.out.println(Human.population);
        System.out.println(Human.population);











    }
}
