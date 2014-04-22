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
		try {
			System.out.println("Hello World");
			myFirtUltimateCoolMethodWhichWillRockYourWorld();
			howMuch();
			myFirstRecursion();
		} finally { //should never happen
			commitHistory();
			EndingPoint.exit();
		}
	}
	
	public static String commitHistory() {
		return "9c7ffb4d64c2dd6c928ca5a11127883f3a273e04";
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
	
	private static int howMuch() {
		return (byte) + (char) - (int) + (long) - 1;
	}
	
}
