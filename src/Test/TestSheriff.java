package Test;
import Main.Sheriff;
import Main.Outlaw;
import Main.Woman;


public class TestSheriff {

    public static void main(String[] args) {

        System.out.println(testMakeSheriff());
        testSheriffSpeaks();
        testSheriffDrinks();
        testSheriffIntroduction();
        testSheriffShout();
        testSheriffShotOutlaw();
        testSheriffSetFreeWoman();
        testSheriffCaptureOutlaw();

    }

    public static Sheriff testMakeSheriff() {
        Sheriff sheriff = new Sheriff("Gustaf");
        return sheriff;
    }

    public static void testSheriffSpeaks() {
        Sheriff sheriff = testMakeSheriff();
        sheriff.speak("this is a test");
    }

    public static void testSheriffDrinks() {
        Sheriff sheriff = testMakeSheriff();
        sheriff.drink();
    }

    public static void testSheriffIntroduction() {
        Sheriff sheriff = testMakeSheriff();
        sheriff.introduceYourself();
    }

    public static void testSheriffShout() {
        Sheriff sheriff = testMakeSheriff();
        sheriff.shout();
    }

    public static void testSheriffShotOutlaw() {
        Sheriff sheriff = testMakeSheriff();
        Outlaw outlaw = new Outlaw("Gaëtan");
        sheriff.shot(outlaw);
    }

    public static void testSheriffSetFreeWoman() {
        Sheriff sheriff = testMakeSheriff();
        Woman woman = new Woman("Michelle");
        sheriff.setFree(woman);
    }

    public static void testSheriffCaptureOutlaw() {
        Sheriff sheriff = testMakeSheriff();
        Outlaw outlaw = new Outlaw("Gaëtan");
        sheriff.capture(outlaw);
    }
}
