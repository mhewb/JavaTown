package Test;
import Main.Bandit;
import Main.Sheriff;
import Main.Woman;


public class TestSheriff {

    public static void main(String[] args) {

        System.out.println(testMakeSheriff());
        testSheriffSpeaks();
        testSheriffDrinks();
        testSheriffIntroduction();
        testSheriffShout();
        testSheriffShotBandit();
        testSheriffSetFreeWoman();
        testSheriffCaptureBandit();

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

    public static void testSheriffShotBandit() {
        Sheriff sheriff = testMakeSheriff();
        Bandit bandit = new Bandit("Gaëtan");
        sheriff.shot(bandit);
    }

    public static void testSheriffSetFreeWoman() {
        Sheriff sheriff = testMakeSheriff();
        Woman woman = new Woman("Michelle");
        sheriff.setFree(woman);
    }

    public static void testSheriffCaptureBandit() {
        Sheriff sheriff = testMakeSheriff();
        Bandit bandit = new Bandit("Gaëtan");
        sheriff.putInJail(bandit);
    }
}
