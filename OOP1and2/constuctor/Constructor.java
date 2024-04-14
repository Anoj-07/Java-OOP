package OOP1and2.constuctor;

public class Constructor {
    public static void main(String[] args) {
        Student anoj = new Student(12, "anoj", 93.f);
//        Packages.constuctor.Student ram = new Packages.constuctor.Student();
//        ram.greet();
//        ram.changeName("ram");
//
//        System.out.println(anoj.mark);
        System.out.println();
        Student rand = new Student(anoj);
        System.out.println(rand.name);

    }
}
class Student{
        int rno;
        String name;
        float mark;

        //function
        void greet() {
            System.out.println("hello " + name);
        }

        void changeName(String name){
            this.name = name;
            System.out.println(this.name);
        }

        //Packages.constuctor.Constructor
        Student () {
           this.rno = 39;
           this.name = "Anoj Rawal";
           this.mark = 93.5f;
        }

        //Another method of creating Packages.constuctor.Constructor
        Student (int ro, String name, float marks) {
            rno = ro;
            this.name = name;
            mark = marks;
        }

        Student(Student other){
            this.name = other.name;
            this.mark = other.mark;
        }

}