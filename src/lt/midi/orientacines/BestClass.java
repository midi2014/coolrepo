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
		howMuch();
		myFirstRecursion();
		EndingPoint.exit();
	}
	
	private static String youBetterGiveMeSomeLongitude() {
		return "25.297699"; 
	}

	private static String youBetterGiveMeSomeLatitude() {
		return "54.678422";
	}
	
	public static void myFirstRecursion() {
		youBetterGiveMeSomeLongitude();
		youBetterGiveMeSomeLatitude();
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
