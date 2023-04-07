package Test;
import Main.Woman;


public class TestWoman {

    public static void main(String[] args) {
        System.out.println(testMakeWoman());
        testWomanSpeaks();
        testWomanDrinks();
        testWomanIntroduction();
        testWomanChangeDressColor();
    }

    public static Woman testMakeWoman() {
        Woman woman = new Woman("Michelle");
        return woman;
    }

    public static void testWomanSpeaks() {
        Woman woman = new Woman("Michelle");
        woman.speak("this is a test");
    }

    public static void testWomanDrinks() {
        Woman woman = new Woman("Michelle");
        woman.drink();
    }

    public static void testWomanIntroduction() {
        Woman woman = new Woman("Michelle");
        woman.introduceYourself();
    }

    public static void testWomanChangeDressColor() {
        Woman woman = new Woman("Michelle");
        woman.changeDressColor("blue");
    }

}
