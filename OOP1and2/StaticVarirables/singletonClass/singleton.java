package OOP1and2.StaticVarirables.singletonClass;

public class singleton {
     private singleton() {

    }
    private static singleton instances;

     public static singleton getInstances(){
//check whether 1 obj only is created or nor
         if (instances == null){
             instances = new singleton();
         }
         return instances;
     }

}
