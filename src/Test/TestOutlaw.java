package Test;
import Main.Outlaw;
import Main.Woman;


public class TestOutlaw {

    public static void main(String[] args) {

        System.out.println(testMakeOutlaw());
        testOutlawSpeaks();
        testOutlawDrinks();
        testOutlawIntroduction();
        testOutlawSetFree();
        testOutlawIsCaptured();
        testOutlawCaptureWoman();

    }

    public static Outlaw testMakeOutlaw() {
        Outlaw outlaw = new Outlaw("Gaëtan");
        return outlaw;
    }

    public static void testOutlawSpeaks() {
        Outlaw outlaw = testMakeOutlaw();
        outlaw.speak("this is a test");
    }

    public static void testOutlawDrinks() {
        Outlaw outlaw = testMakeOutlaw();
        outlaw.drink();
    }

    public static void testOutlawIntroduction() {
        Outlaw outlaw = testMakeOutlaw();
        outlaw.introduceYourself();
    }

    public static void testOutlawSetFree() {
        Outlaw outlaw = testMakeOutlaw();
        outlaw.setFree();
        System.out.println("false: " + outlaw.getCaught());
    }

    public static void testOutlawIsCaptured() {
        Outlaw outlaw = testMakeOutlaw();
        outlaw.isCaptured();
        System.out.println("true: " + outlaw.getCaught());
    }

    public static void testOutlawCaptureWoman() {
        Outlaw outlaw = testMakeOutlaw();
        Woman woman = new Woman("Michelle");
        outlaw.capture(woman);
    }

}
