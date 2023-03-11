public class Square extends Rectangle {
    double side = 2.0;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super.getColor();
        super.isFilled();
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    public String toString() {
        return "Square [Rectangle [Shape [color = " + color + ", filled = " + filled + "], width = " + side
                + ", length = "
                + side + "]]";
    }
}
