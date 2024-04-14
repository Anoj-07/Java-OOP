package OOP3.Inheritence;



public class MainInheit {
    public static void main(String[] args) {

//    Inherit in1= new Inherit(6, 3, 4);
//    Inherit in2 = new Inherit();
//        System.out.println(in1.b +" "+ in1.l+" "+ in1.w);
//        System.out.println(in2.b+ " "+ in2.l);


//        Inherit box5 = new BoxWeight(2, 3, 4, 8); // only Inherit class variable can access here not inheritanceExtend
//        System.out.println(box5.w);


//        InheritenceExtend box = new InheritenceExtend();
//        System.out.println(box.l + " " + box.w);

//        Inherit hi = new BoxWeight();

        BoxPrice box = new BoxPrice(6, 12, 22);
        System.out.println(box.cost + "" + box.b);

        Inherit hi = new Inherit(box);
        System.out.println(hi.b);




    }

}
