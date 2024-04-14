package OOP3.Inheritence;

public class BoxColor extends BoxWeight{
    String red;
    String blue;
    double green;

    public BoxColor(double l, double w, double b, double weigth) {
        super(l, w, b, weigth);
        this.red = "red";
        this.blue = "blue";
        this.green = b;
    }
}
