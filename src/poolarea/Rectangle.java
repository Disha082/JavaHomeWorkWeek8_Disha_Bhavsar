package poolarea;

public class Rectangle {
        double width;
        double length;

        //constructor with param
        Rectangle(double width, double length) {
            this.length = length;
            this.width = width;
            if (width < 0)
                width = 0;
            if (length < 0)
                length = 0;
        }

        public Rectangle() {

        }

        // 1) get width no param
        public double getWidth() {

            return width;
        }

        //2) method get length no param
        public double getLength() {
            return length;
        }

        //3) get area method with no param
        public double getArea() {
            double area = (width * length);
            return area;
        }


    }

