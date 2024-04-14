package OOP6.lambdaExprerssion;

import OOP5.NestedInterfaces.B;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lambdaEX {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }


//1.
      /*  arr.forEach(integer -> System.out.println(integer * 2));*/
    //2.
        /*Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);*/

        //3.parameter
        operation sum = (a, b) -> a + b;
        operation sub = (a, b) -> a - b;
        operation div = (a, b) -> a / b;
        operation multi = (a, b) -> a * b;

        lambdaEX mycal = new lambdaEX();
        System.out.println(mycal.oper(5, 6, sum));
        System.out.println(mycal.oper(5, 6, sub));
        System.out.println(mycal.oper(5, 6, div));
        System.out.println(mycal.oper(5, 6, multi));

    }
    private int oper(int a, int b , operation op){
        return op.ope(a, b);
    }
}
interface operation {
    //abstract method
    int ope (int a, int b);
}
