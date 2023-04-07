package Main;

public class Barman extends Human {

    private String barName;


    public Barman(String name) {
        super(name, "wine");
        this.barName = this.getName() + "'s";
    }

    public Barman(String name, String barName) {
        super(name, "wine");
        this.barName = barName;
    }

    @Override
    public void speak(String sentence) {
        System.out.println(
                " (" + this.getName() + ") - " + sentence + " coco.");
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        this.speak("My bar is called " + this.barName);
    }

    public void serveFavoriteDrink(Human human) {
        this.speak("Here is your glass of" + human.getFavoriteDrink());
    }

}
