package OOP3.Polimorphisim;

public class ObjectPrint { //internally it is => extends object class
    int num;

    public ObjectPrint(int num){
        this.num = num;
    }

    //it is => overriding to string method internally
    //It will determine at run time

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj); // check println to find how to string is working
    }
}
