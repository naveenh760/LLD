package projects.pen;

public abstract class Pen implements Writable{
    public String body;
    RefillStrategy refillStrategy;

    public Pen(String body, RefillStrategy refillStrategy) {
        this.body = body;
        this.refillStrategy = refillStrategy;
    }

    void refill(){
        refillStrategy.refill();
    }
}
