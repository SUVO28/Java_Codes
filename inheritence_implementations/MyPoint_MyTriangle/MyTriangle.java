import javax.swing.plaf.synth.SynthSplitPaneUI;

public class MyTriangle {
    private MyPoint v1, v2, v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
        // v1.setXY(x1, y1);
        // v2.setXY(x2, y2);
        // v3.setXY(x3, y3);
    }

    public MyTriangle(MyPoint p1, MyPoint p2, MyPoint p3) {
        v1 = p1;
        v2 = p2;
        v3 = p3;
    }

    public String toString() {
        return "MyTriangle[v1=" + v1.toString() + ", v2=" + v2.toString() + ", v3=" + v3.toString() + "]";
    }

    public double getPerimeter() {
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);
        return d1 + d2 + d3;
    }

    public void printType() {
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);

        if (d1 == d2 && d2 == d3)
            System.out.println("It is an Equilateral Triangle");
        else if (d1 == d2 || d2 == d3 || d3 == d1)
            System.out.println("It is an Isoceles Triangle");
        else
            System.out.println("It is a Scalene Triangle");
    }

    public static void main(String args[]) {
        MyTriangle t1 = new MyTriangle(1, 1, 2, 2, 3, 3);
        MyPoint p1 = new MyPoint(4, 4);
        MyPoint p2 = new MyPoint(5, 5);
        MyPoint p3 = new MyPoint(6, 6);

        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        System.out.println(t1);
        System.out.println(t2);

        double distance = t1.getPerimeter();
        System.out.println("Perimeter of the triangle is: " + distance);

        t1.printType();
    }
}
