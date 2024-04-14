package OOP4;

public class A {
   private int num;
   protected String name;
    int [] arr;

    //getter method
    public int getNum() {
        return num;
    }

    //setter method
    public void setName(String name) {
        this.name = name;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
