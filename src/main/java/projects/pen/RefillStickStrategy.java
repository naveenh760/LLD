package projects.pen;

public class RefillStickStrategy implements RefillStrategy{
    @Override
    public void refill() {
        System.out.println("adding new refill stick");
    }
}
