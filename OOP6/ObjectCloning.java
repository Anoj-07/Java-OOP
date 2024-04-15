package OOP6;

public class ObjectCloning implements Cloneable {
    int age;
    String name;

    int [] arr;

    //we don't need this for object cloning
//    public ObjectCloning(ObjectCloning other) {
//        this.age = other.age;
//        this.name = other.name;
//
//    }

    public ObjectCloning(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,23, 45, 66 ,2};
    }

   /* //This is shallow coping
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }*/


    /*this is deep copy*/
    @Override
    public Object clone() throws CloneNotSupportedException{

        //this is actually shallow copy
        ObjectCloning twin1 = (ObjectCloning) super.clone();

        //make a deep copy
        twin1.arr = new int[twin1.arr.length];
        for (int i = 0; i < twin1.arr.length; i++) {
            twin1.arr[i] = this.arr[i];
        }
        return twin1;

    }



}
