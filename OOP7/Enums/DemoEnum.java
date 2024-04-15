package OOP7.Enums;

public class DemoEnum {
    enum week implements EnumsInterface{

        //this is enum constant
        //public, static and final
        //so its final you can't create child enum
        //type is week

        SUNDAY,
        MONDAY,
        TUESDAY,
        FRIDAY,
        SATURDAY;


        //Constructor in enum
        /*
        * this is not public or protected, only privite or default
        * why? we don't want to create new object
        * this isnot the enum concept, that why
        * Constructor of enum type is private.
        * If you don't declare private compiler internally creates private constructor
        * internally : public static final week Monday =  new week() */
        week() {
            System.out.println("CONSTRUCTOR " + this);
        }


        //Overriding Interface

        @Override
        public void hello() {
            System.out.println("hi");
        }
    }

   /* Can we create the instance of Enum by new keyword?
    -> No, because it contains private constructors only.*/

    /*Can we have an abstract method in the Enum?
    ->  Yes, Of course! we can have abstract methods and can provide the implementation of these methods.*/

    public static void main(String[] args) {
        week w;
        w = week.MONDAY;
       /* System.out.println(w);
        System.out.println(w.ordinal());*/

        w.hello();


        //this is loop for enums
     /*   for (week day: week.values()){
            System.out.println(day);
        }*/

//        System.out.println(week.valueOf("SUNDAY"));

    }
}
