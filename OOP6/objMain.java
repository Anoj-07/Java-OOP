package OOP6;

import java.util.Arrays;

public class objMain  {
    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectCloning anoj = new ObjectCloning(20, "anoj Rawal");

        /*it is actually making the copy of anoj
        the problem is it taking alot of time that why we are using cloning*/

//        ObjectCloning kunal = new ObjectCloning(anoj);

        //so we use clone,
        //this is a shallow cloning
      /*  ObjectCloning twins = (ObjectCloning) anoj.clone();
        System.out.println(twins.age +" " + twins.name);
        System.out.println(Arrays.toString(twins.arr));
        twins.arr[0] = 100;
        System.out.println(Arrays.toString(anoj.arr));*/


        //deep copy
        ObjectCloning twins = (ObjectCloning) anoj.clone();
        System.out.println(twins.age +" " + twins.name);
        System.out.println(Arrays.toString(twins.arr));
        twins.arr[0] = 100;
        System.out.println(Arrays.toString(twins.arr));
        System.out.println(Arrays.toString(anoj.arr));

    }
}
