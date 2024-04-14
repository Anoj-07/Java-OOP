package OOP5.NestedInterfaces;

public class C {
     interface NestedInterface{
        boolean isOdd(int num);
    }
}

class D implements C.NestedInterface{
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

class main{
    public static void main(String[] args) {
        D obj = new D();
        System.out.println(obj.isOdd(4));
    }
}
