public  class finalKeyword {
    public static void main(String[] args) {
      final A anoj = new A("anoj");
        System.out.println(anoj.name);

        anoj.name ="Rawal";
        System.out.println(anoj.name);


//        anoj = new A("ram");

        /*using final keyword we can't override method and constructor or data member*/


    }
}
final class A{
    final int num = 12;
    String name;

   public A(String name){

       this.name = name;
    }

}