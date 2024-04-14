package OOP3.Inheritence;

public class BoxPrice extends BoxWeight{

    double cost;

    BoxPrice(){
        super(); // it will call default constructor
        this.cost = - 1;
    }

    BoxPrice (BoxPrice other){
        super(other); // it will call old parameter of BoxWeight constructor
        this.cost = other.cost;
    }

    public BoxPrice(double l, double w, double b, double weigth, double cost) {
        super(l, w, b, weigth);
        this.cost = cost;
    }

    BoxPrice(double side, double weight, double cost){
        super(side, weight);
        this.cost = cost;


    }
}
