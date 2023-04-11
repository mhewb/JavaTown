package Main;

public class Sheriff extends Cowboy {

    private int nbOfCaptives;

    public Sheriff(String name) {
        super(name);
        this.adjective = "honest";
    }

    @Override
    public String getName() {
        return "Sheriff " + super.getName();
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        this.speak("I caught " + this.nbOfCaptives + " outlaws!");
    }

    public void putInJail(Bandit bandit) {
        bandit.isCaptured();
        bandit.speak("Damn, I got caught! " + this.getName() + ", you got me!");
        this.speak("In the name of the law, I arrest you!");
    }

    public void researchOutlaw(Bandit bandit) {
        bandit.doubleReward();
        System.out.println("Sheriff" + this.getName() + "puts up posters all over the city.");
        this.speak(
                "Hear ye, hear ye good people, $" + bandit.getReward()
                + "to the one who will arrest " + bandit.getName() + " the bandit, dead or alive!"
        );
    }





}
