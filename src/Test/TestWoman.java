package Test;
import Main.Woman;


public class TestWoman {

    public static void main(String[] args) {
        System.out.println(testMakeWoman());
        testWomanSpeaks();
        testWomanDrinks();
        testWomanIntroduction();
        testWomanChangeDressColor();
        testWomanSetFree();
        testWomanIsCaptured();
    }

    public static Woman testMakeWoman() {
        Woman woman = new Woman("Michelle");
        return woman;
    }

    public static void testWomanSpeaks() {
        Woman woman = testMakeWoman();
        woman.speak("this is a test");
    }

    public static void testWomanDrinks() {
        Woman woman = testMakeWoman();
        woman.drink();
    }

    public static void testWomanIntroduction() {
        Woman woman = testMakeWoman();
        woman.introduceYourself();
    }

    public static void testWomanChangeDressColor() {
        Woman woman = testMakeWoman();
        woman.changeDressColor("blue");
    }

    public static void testWomanSetFree() {
        Woman woman = testMakeWoman();
        woman.setFree();
        System.out.println("false: " + woman.getCaught());
    }

    public static void testWomanIsCaptured() {
        Woman woman = testMakeWoman();
        woman.isCaptured();
        System.out.println("true: " +woman.getCaught());
    }

}
