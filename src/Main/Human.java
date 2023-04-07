package Main;

public class Human {

    private final String name;
    private String favoriteDrink;

    public Human(String name) {
        this.name = name;
        this.favoriteDrink = "water";
    }

    public Human(String name, String favoriteDrink) {
        this.name = name;
        this.favoriteDrink = favoriteDrink;
    }


    @Override
    public String toString() {
        return "Main.Human{" +
                "name='" + this.name + '\'' +
                ", favoriteDrink='" + this.favoriteDrink + '\'' +
                ", at='" + this.hashCode() + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getFavoriteDrink() {
        return favoriteDrink;
    }

    public void speak(String sentence) {
        System.out.println(
                " (" + this.getName() + ") - " + sentence);
    }

    public void introduceYourself() {
        this.speak("Hello, my name is " + this.getName() +
                " and I like my " + getFavoriteDrink() + " with some ice.");
    }

    public void drink() {
        this.speak("Ah ! A good ol'" + getFavoriteDrink() + " glass! GLOUPS!");
    }

}
