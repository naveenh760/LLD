package projects.pen;

public class FillInkStrategy implements RefillStrategy{
    @Override
    public void refill() {
        System.out.println("Adding ink in body");
    }
}
