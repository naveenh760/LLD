package projects.pen;

public class RefillStick {
    Ink ink;
    Nib nib;

    public RefillStick(Ink ink, Nib nib) {
        this.ink = ink;
        this.nib = nib;
    }

    public void write(){
        ink.moveInk();
        nib.applyPressure();
        System.out.println("Writing using refill stick");
    }
}
