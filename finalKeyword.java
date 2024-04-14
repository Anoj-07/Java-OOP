public class finalKeyword {
    public static void main(String[] args) {
      final A anoj = new A("anoj");
        System.out.println(anoj.name);

        anoj.name ="Rawal";
        System.out.println(anoj.name);

//        anoj = new A("ram");


    }
}
class A{
    final int num = 12;
    String name;

   public A(String name){

       this.name = name;
    }

}