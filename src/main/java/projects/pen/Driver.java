package projects.pen;

public class Driver {
    public static void main(String[] args){
        Ink blueInk = new Ink("Blue");
        Nib nib = new Nib();
        RefillStick refillStick = new RefillStick(blueInk,nib);
        RefillStrategy ballPenRefill = new RefillStickStrategy();
        Pen ballPen = new BallPen("Plastic", ballPenRefill,refillStick);
        ballPen.write();

        RefillStrategy refillStrategy = new FillInkStrategy();
        Pen inkPen = new InkPen("Metal", refillStrategy,blueInk,nib);
        inkPen.refill();
        inkPen.write();

    }

}
