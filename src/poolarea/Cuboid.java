package poolarea;

public class Cuboid extends Rectangle {
    double height;
    // parent class constructor
    Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
        if (height < 0) {
            height = 0;
        }
    }
    //1 get height with no param
    public double getHeight() {
        return height;
    }
    //2 get volume method no param
    public double getVolume() {
        double sum = (getArea() * height);
        return sum;
    }
}


