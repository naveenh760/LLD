package design.patterns.creational;

public class Singleton {
	
	private Singleton() {
		System.out.println("Inside constructor");
	}
	
	private static Singleton instance;
	synchronized public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	

	public static void main(String[] args) {
		Singleton object  = Singleton.getInstance();
		Singleton object1 = Singleton.getInstance();
		if(object == object1) {
			System.out.println("Validated singleton");
		}
	}

}
