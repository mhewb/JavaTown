package Test;
import Main.Bandit;
import Main.Woman;


public class TestBandit {

    public static void main(String[] args) {

        System.out.println(testMakeBandit());
        testBanditSpeaks();
        testBanditDrinks();
        testBanditIntroduction();
        testBanditSetFree();
        testBanditIsCaptured();
        testBanditCaptureWoman();

    }

    public static Bandit testMakeBandit() {
        Bandit bandit = new Bandit("Gaëtan");
        return bandit;
    }

    public static void testBanditSpeaks() {
        Bandit bandit = testMakeBandit();
        bandit.speak("this is a test");
    }

    public static void testBanditDrinks() {
        Bandit bandit = testMakeBandit();
        bandit.drink();
    }

    public static void testBanditIntroduction() {
        Bandit bandit = testMakeBandit();
        bandit.introduceYourself();
    }

    public static void testBanditSetFree() {
        Bandit bandit = testMakeBandit();
        bandit.setFree();
        System.out.println("false: " + bandit.getCaught());
    }

    public static void testBanditIsCaptured() {
        Bandit bandit = testMakeBandit();
        bandit.isCaptured();
        System.out.println("true: " + bandit.getCaught());
    }

    public static void testBanditCaptureWoman() {
        Bandit bandit = testMakeBandit();
        Woman woman = new Woman("Michelle");
        bandit.abduct(woman);
    }

}
