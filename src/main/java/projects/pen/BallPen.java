package projects.pen;

public class BallPen extends Pen{
    RefillStick refillStick;

    public BallPen(String body, RefillStrategy refillStrategy,RefillStick refillStick) {
        super(body,refillStrategy);
        this.refillStick = refillStick;
    }

    @Override
    public void write() {
        refillStick.write();
        System.out.println("Writing using ball pen");
    }
}
