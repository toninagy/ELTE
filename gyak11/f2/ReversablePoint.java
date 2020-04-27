public class ReversablePoint extends Point implements Reversable {
    private int prevX, prevY;

    public ReversablePoint(int x,int y) {
        super(x, y);
        prevX = x;
        prevY = y;
    }

    @Override
    public void reverse() {
        x = prevX;
        y = prevY;
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
}