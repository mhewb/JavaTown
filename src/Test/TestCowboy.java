package Test;
import Main.Bandit;
import Main.Cowboy;
import Main.Sheriff;
import Main.Woman;


public class TestCowboy {

    public static void main(String[] args) {

        System.out.println(testMakeCowboy());
        System.out.println(testMakeCowboyAsSheriff());
        testCowboySpeaks();
        testCowboyDrinks();
        testCowboyIntroduction();
        testCowboyShout();
        testCowboyShotBandit();
        testCowboySetFreeWoman();
//        testCowboyCaptureBandit();

    }

    public static Cowboy testMakeCowboy() {
        Cowboy cowboy = new Cowboy("Marcel");
        return cowboy;
    }

    public static Cowboy testMakeCowboyAsSheriff() {
        Cowboy cowboy = new Sheriff("Marcel");
        return cowboy;
    }

//    public static void testMakeCowboyAsSheriffAndCapture() {
//        Cowboy cowboy = new Sheriff("Marcel");
//        Bandit bandit = new Bandit("Gaëtan");
//        cowboy.capture(bandit);
//    }


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

    public static void testCowboyShotBandit() {
        Cowboy cowboy = testMakeCowboy();
        Bandit bandit = new Bandit("Gaëtan");
        cowboy.shot(bandit);
    }

    public static void testCowboySetFreeWoman() {
        Cowboy cowboy = testMakeCowboy();
        Woman woman = new Woman("Michelle");
        cowboy.setFree(woman);
    }
// TODO: remove ?
//    public static void testCowboyCaptureBandit() {
//        Cowboy cowboy = testMakeCowboy();
//        Bandit bandit = new Bandit("Gaëtan");
//        cowboy.capture(bandit);
//    }
}
