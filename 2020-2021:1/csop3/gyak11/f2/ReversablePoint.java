public class ReversablePoint extends Point implements Reversable {
    private int prevX;
    private int prevY;

    public ReversablePoint(int x, int y) {
        super(x, y);
        this.prevX = x;
        this.prevY = y;
    }

    @Override
    public void setX(int x) {
        prevX = this.x;
        super.setX(x);
    }

    @Override
    public void setY(int y) {
        prevY = this.y;
        super.setY(y);
    }

    @Override
    public void reverse() {
        x = prevX;
        y = prevY;
    }
    
}
