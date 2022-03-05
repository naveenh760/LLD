package projects.pen;

public class InkPen extends Pen{
    Ink ink;
    Nib nib;

    public InkPen(String body, RefillStrategy refillStrategy,Ink ink, Nib nib) {
        super(body,refillStrategy);
        this.ink = ink;
        this.nib = nib;
    }

    @Override
    public void write() {
        ink.moveInk();
        nib.applyPressure();
        System.out.println("writing using ink pen");
    }
}
