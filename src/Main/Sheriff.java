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

    public void putInJail(Outlaw outlaw) {
        this.capture(outlaw);
        this.speak("In the name of the law, I arrest you!");
    }

    public void researchOutlaw(Outlaw outlaw) {
        outlaw.doubleReward();
        System.out.println("Sheriff" + this.getName() + "puts up posters all over the city.");
        this.speak(
                "Hear ye, hear ye good people, $" + outlaw.getReward()
                + "to the one who will arrest " + outlaw.getName() + " the outlaw, dead or alive!"
        );
    }





}
