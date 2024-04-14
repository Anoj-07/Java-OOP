package OOP6.customArraylist;

import java.util.Arrays;

public class CustomGernericArrayList<T> { //T is generic

   private Object[] data;
   private static int DEFAULT_SIZE = 10;
   private int size = 0;

    public CustomGernericArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

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
//        ArrayList list = new ArrayList();

        // we can make our own Array list method
//        list.add(40);
//        list.remove(0);
//        list.get(0);
//        list.set(1, 934);
//        list.size();
//        list.isEmpty();


//        CustomArrayList list = new CustomArrayList();
////        list.add(3);
//        list.add(5);
//        list.add(9);

        CustomGernericArrayList list = new CustomGernericArrayList();
        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }



        System.out.println(list);

    }



}
