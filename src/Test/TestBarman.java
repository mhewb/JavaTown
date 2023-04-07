package Test;
import Main.Barman;
import Main.Human;

public class TestBarman {

    public static void main(String[] args) {
        System.out.println(testMakeBarman());
        testBarmanSpeaks();
        testBarmanDrinks();
        testBarmanIntroduction();
    }

    public static Barman testMakeBarman() {
        Barman barman = new Barman("Allan");
        return barman;
    }

    public static void testBarmanSpeaks() {
        Barman barman = testMakeBarman();
        barman.speak("this is a test");
    }

    public static void testBarmanDrinks() {
        Barman barman = testMakeBarman();
        barman.drink();
    }

    public static void testBarmanIntroduction() {
        Barman barman = testMakeBarman();
        barman.introduceYourself();
    }

    public static void testBarmanServeFavoriteDrink() {
        Barman barman = testMakeBarman();
        Human human = new Human("Michel");
        barman.serveFavoriteDrink(human);
    }


}
