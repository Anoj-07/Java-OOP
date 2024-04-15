package OOP1and2.singletonClass;

public class singleton {
     private singleton() {

    }
    private static singleton instances;

     public static singleton getInstance(){
//check whether 1 obj only is created or nor
         if (instances == null){
             instances = new singleton();
         }
         return instances;
     }

}
