package OOP6.Generic;

import java.util.Arrays;

public class wildcCardEx<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public wildcCardEx() {
        data = new Object[DEFAULT_SIZE];
    }
//
//    //wild class
//    public void getList(List <? extends Number> list){
//        /
//    }

    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        //copying the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        T removed = (T) data[--size];
        return removed;
    }

    public T get (int index){
        return (T) data[index];
    }

    public int size(){
        return  size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        wildcCardEx<Number> list = new wildcCardEx<>();
        list.add(100);



        System.out.println(list);

    }

}
