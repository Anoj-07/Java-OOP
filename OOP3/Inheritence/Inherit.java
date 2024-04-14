package OOP3.Inheritence;
public class Inherit {
    double l;
    double w;
    double b;

    int c = 100;

    Inherit(double l, double w, double b) {
        this.l = l;
        this.w = w;
        this.b = b;
    }

    public Inherit() {
        this.l= 6;
        this.b = 2;
        this.w= 4;
    }

    public Inherit(Inherit Old){

        this.l= Old.l;
    }


    public Inherit(double side){
        this.l = side;
        this.b = side;
    }

}

