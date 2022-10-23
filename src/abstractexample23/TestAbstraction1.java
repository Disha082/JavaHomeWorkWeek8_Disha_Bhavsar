package abstractexample23;

public class TestAbstraction1 {
    public static void main(String args[]) {
        Shape s = new Circle1() {

            public void drow() {
            }

        };
        s.draw();

    }
}

