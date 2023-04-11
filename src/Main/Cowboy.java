package Main;

public class Cowboy extends Human {

    private int popularity;
    protected String adjective;

    public Cowboy(String name) {
        super(name, "whisky");
        this.popularity = 0;
        this.adjective = "valiant";
    }

    @Override
    public String toString() {
        return super.toString() + "Cowboy{" +
                "popularity=" + popularity +
                ", adjective='" + adjective + '\'' +
                '}';
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        this.speak("People tells me that I am " + this.adjective + ".");
        this.speak("I am quite popular (" + this.popularity + ").");
    }

    public void shout() {
        this.speak("Take this, villain!");
    }

    public void shot(Bandit bandit) {
        this.speak("The " + this.adjective + " " + this.getName() +
                " shot " + bandit.getName() + ". PAN!");
    }

    public void setFree(Woman woman) {
        woman.setFree();
        this.speak(woman.getName() + " you are now free!");
    }


}