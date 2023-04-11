package Main;

public class Bandit extends Human implements Outlaw {

    private String look;
    private int nbOfCaptives;
    private float reward;
    private boolean isCaught;

    public Bandit(String name) {
        super(name, "hooch");
        this.look = "dangerous";
        this.nbOfCaptives = 0;
        this.reward = 100.0f;
        this.isCaught = false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBandit{" +
                "look='" + look + '\'' +
                ", nbOfCaptives=" + nbOfCaptives +
                ", reward=" + reward +
                ", isCaught=" + isCaught +
                '}';
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
        this.speak("I am a bad guy and I already captured " + this.nbOfCaptives + " women !");
        this.speak("There's a $"+ this.reward + " bounty on my head.");
    }

    @Override
    public String getName() {
        return super.getName() + " the " + this.look ;
    }

    // GETTER
    public String getLook() {
        return look;
    }

    public int getNbOfCaptives() {
        return nbOfCaptives;
    }

    @Override
    public float getReward() {
        return reward;
    }

    public boolean getCaught() {
        return isCaught;
    }

    public void doubleReward() {
        this.reward = this.reward * 2;
    }

    public void addCaptive() {
        this.nbOfCaptives++;
//        this.reward += 100.1f;
    }

    public void setFree() {
        this.isCaught = false;
    }

    @Override
    public void isCaptured() {
        this.isCaught = true;
    }


    @Override
    public void abduct(Woman woman) {
        this.speak("Krkr! " + woman.getName() + ", you are my prisoner now!");
        woman.speak("Ho no please deliver me !");
        woman.isCaptured();
        this.addCaptive();
    }
}


