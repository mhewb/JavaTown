package Main;

public class Cowboy extends Human {

    private int popularity;
    private String adjective;

    public Cowboy(String name) {
        super(name, "whisky");
        this.popularity = 0;
        this.adjective = "Valiant";
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

    public void shot(Outlaw outlaw) {
        this.speak("The " + this.adjective + " " + this.getName() +
                " shot " + outlaw.getName() + ". PAN!");
    }

    public void setFree(Woman woman) {
        woman.setFree();
        this.speak(woman.getName() + " you are now free!");
    }

    public void capture(Outlaw outlaw) {
        outlaw.isCaptured();
        outlaw.speak("Damn, I got caught! " + this.getName() + ", you got me!");
    }



}