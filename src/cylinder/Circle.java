package cylinder;

public class Circle {
    double radius = 0;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    //1 get radius with no param
    public double getRadius() {
        if(radius<0)
            radius=0;

        return radius;
    }

    //2 ger area method  no param
    public double getArea() {
        double area = (radius * radius * Math.PI);
        return area;
    }
}

