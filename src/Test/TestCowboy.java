package Test;
import Main.Cowboy;
import Main.Outlaw;
import Main.Woman;


public class TestCowboy {

    public static void main(String[] args) {

        System.out.println(testMakeCowboy());
        testCowboySpeaks();
        testCowboyDrinks();
        testCowboyIntroduction();
        testCowboyShout();
        testCowboyShotOutlaw();
        testCowboySetFreeWoman();
        testCowboyCaptureOutlaw();

    }

    public static Cowboy testMakeCowboy() {
        Cowboy cowboy = new Cowboy("Marcel");
        return cowboy;
    }

    public static void testCowboySpeaks() {
        Cowboy cowboy = testMakeCowboy();
        cowboy.speak("this is a test");
    }

    public static void testCowboyDrinks() {
        Cowboy cowboy = testMakeCowboy();
        cowboy.drink();
    }

    public static void testCowboyIntroduction() {
        Cowboy cowboy = testMakeCowboy();
        cowboy.introduceYourself();
    }

    public static void testCowboyShout() {
        Cowboy cowboy = testMakeCowboy();
        cowboy.shout();
    }

    public static void testCowboyShotOutlaw() {
        Cowboy cowboy = testMakeCowboy();
        Outlaw outlaw = new Outlaw("Gaëtan");
        cowboy.shot(outlaw);
    }

    public static void testCowboySetFreeWoman() {
        Cowboy cowboy = testMakeCowboy();
        Woman woman = new Woman("Michelle");
        cowboy.setFree(woman);
    }

    public static void testCowboyCaptureOutlaw() {
        Cowboy cowboy = testMakeCowboy();
        Outlaw outlaw = new Outlaw("Gaëtan");
        cowboy.capture(outlaw);
    }
}
