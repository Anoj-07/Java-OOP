package OOP5.AbstractClass;

//* abstract static method cannot be used in abstract class because abstract class need to be over ride but static method cannot be over ride.
//*You can't use abstract constructor in abstract class like, abstract abstractclass ();
//* You can create static method in abstract class.
//* Ypu can also create normal method

abstract class abstractclass {
    //constructor
    int Class;
    public abstractclass(int aClass) {
        Class = aClass;
    }

    //without using constructor in super class
    int age;
    //abstract method
    abstract String A(String name);
    abstract void B();
}

//first child
public class B extends abstractclass{
    //constructor
    public B(int aClass) {
        super(aClass);
        this.age = 20;
    }

    //using abstract method of super class
    @Override
    String A(String name) {
        return name;
    }

    @Override
    void B() {
    }
}

//second child
class c extends abstractclass{

//Constructor
    public c(int aClass) {
        super(aClass);
        this.age = 15;
    }

    @Override
    String A(String name) {

        return name;
    }

    @Override
    void B() {

    }
}

class test{
    public static void main(String[] args) {
        B obj = new B(10);
        //constructor call
        int age = obj.Class;
        System.out.println(age);
        System.out.println(obj.A("anoj"));
        System.out.println(obj.age);

        //method call
        obj.A("hello");


        abstractclass obj1 = new c(12);

//        abstractclass obj3 = new abstractclass() ;  you can't create object class
    }
}
