package OOP3.Inheritence;

public  class FinalForInheit { // of we put final in class then method would be final too
    void hello(){

    }

    static void greet(){
        System.out.println("hey I am greet and static method");
    }


}

class A extends FinalForInheit{
    int a ;
    int b ;


    public A(int a, int b) {
        this.a = a;
        this.b = b;

    }
}

class B extends FinalForInheit{
    int c;
    int d;

    public B(int c, int d) {
        this.c = c;
        this.d = d;
    }

//    @Override
    static void greet(){
        System.out.println("hey I am B");
    }


}
class main{
    public static void main(String[] args) {
        B b = new B(1, 4);

        FinalForInheit.greet();
        FinalForInheit obj = new B(1, 3);
        obj.greet();  //you can inherit but you cannot override
    }
}

