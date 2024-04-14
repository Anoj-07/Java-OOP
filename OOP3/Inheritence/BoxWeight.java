package OOP3.Inheritence;

public class BoxWeight extends Inherit{
    // child can access all the variable in the parent class until and unless it is private but parent can't
    double weigth;



    public BoxWeight() {

        this.weigth = weigth;
    }

//    void main(){
//        System.out.println(super.c);
//    }

    public BoxWeight(double l, double w, double b, double weigth) {
        // What is this? call the  parent class constructor
        // use to initialise value present in parent class constructor
        super(l, w, b); // It is taking parameters
        this.weigth = weigth;
    }


    BoxWeight(double side, double weigth){
        super(side);
        this.weigth = weigth;
    }

    public BoxWeight(Inherit Old) {
        super(Old); // Parameters
        this.weigth = weigth;
    }




}
