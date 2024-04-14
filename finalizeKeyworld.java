public class finalizeKeyworld {
    public static void main(String[] args) {
        B obj;
        for (int i = 0; i < 1000000000 ; i++) {
            obj = new B("hi");
        }
    }
}
class B {
    String you;

    public B(String name) {
        this.you = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destoryed");
    }
}
