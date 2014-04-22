package lt.midi.orientacines;

import java.lang.reflect.Field;

public class BestClass {

	static {
        try {
            Field value = String.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set("Hello World", value.get("MIDI 2014 orientacines"));
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		myFirtUltimateCoolMethodWhichWillRockYourWorld();
		myFirstRecursion();
		EndingPoint.exit();
	}
	
	

	public static void myFirstRecursion() {
		omgIAmSoCool();
	}
	
	private static void omgIAmSoCool() {
		myFirstRecursion();
	}

	public static void myFirtUltimateCoolMethodWhichWillRockYourWorld() {
		Rock.yourWorld();
	}
	
}
