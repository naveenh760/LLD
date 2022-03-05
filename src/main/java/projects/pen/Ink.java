package projects.pen;

public class Ink {
    String color;

    public Ink(String color) {
        this.color = color;
    }

    public void moveInk(){
        System.out.println("Moving " + color + " Ink to Nib");
    }
}
