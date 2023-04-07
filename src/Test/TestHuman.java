package Test;
import Main.Human;


public class TestHuman {

    public static void main(String[] args) {

        System.out.println(testMakeHuman());
        testHumanSpeaks();
        testHumanDrinks();
        testHumanIntroduction();

    }

    public static Human testMakeHuman() {
        Human human = new Human("Michel");
        return human;
    }

    public static void testHumanSpeaks() {
        Human human = new Human("Michel");
        human.speak("this is a test");
    }

    public static void testHumanDrinks() {
        Human human = new Human("Michel");
        human.drink();
    }

    public static void testHumanIntroduction() {
        Human human = new Human("Michel");
        human.introduceYourself();
    }

}
