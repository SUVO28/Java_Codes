public class MyPoint {
    int x, y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        int a[] = new int[2];
        a[0] = this.x;
        a[1] = this.y;
        return a;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public double distance(int x, int y) {
        double distance = Math.sqrt((Math.pow((x - this.x), 2)) + (Math.pow((y - this.y), 2)));
        return distance;
    }

    public double distance(MyPoint p2) {
        double distance = Math.sqrt((Math.pow((p2.x - this.x), 2)) + (Math.pow((p2.y - this.y), 2)));
        return distance;
    }

    public double distance() {
        double distance = Math.sqrt((Math.pow((0 - this.x), 2)) + (Math.pow((0 - this.y), 2)));
        return distance;
    }

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1.distance(5, 6));

        p1.setXY(5, 6);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(3, 4);
        System.out.println(p2.distance(p1));
        System.out.println(p2.distance());
    }
}
