public class PrintableAndReversablePoint extends Point implements Printable, Reversable {
    private int prevX;
    private int prevY;

    public PrintableAndReversablePoint(int x, int y) {
        super(x, y);
        prevX = x;
        prevY = y;
    }

    @Override
    public void setX(int x) {
        prevX = this.x;
        this.x = x;
    }

    @Override
    public void setY(int y) {
        prevY = this.y;
        this.y = y;
    }

    @Override
    public void reverse() {
        x = prevX;
        y = prevY;
    }

    @Override
    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }
}
