package OOP4.Access;

public class ObjectClass {
    int num;

    public ObjectClass(int num) {
        this.num = num;
    }

    //unique representation of an object via numbers
    //random integer value
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectClass)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //Give string representation
    @Override
    public String toString() {
        return super.toString();
    }

    //Get called when Garbage collection Hit

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass(1);
        ObjectClass obj2 = new ObjectClass(1);

        //hashcode method
        System.out.println(obj.hashCode());

        //equal method
        //this will give error
        // this will not give any output
        if (obj == obj2){
            System.out.println("hi");
        }

        // this is Good way to compare
        if (obj.equals(obj2)){
            System.out.println("is equal");
        }
    }
}
