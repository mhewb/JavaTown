package Main;

public class Outlaw extends Human {

    private String look;
    private int nbOfCaptives;
    private float reward;
    private boolean isCaught;

    public Outlaw(String name) {
        super(name);
        this.look = "dangerous";
        this.nbOfCaptives = 0;
        this.reward = 100.0f;
        this.isCaught = false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOutlaw{" +
                "look='" + look + '\'' +
                ", nbOfCaptives=" + nbOfCaptives +
                ", reward=" + reward +
                ", isCaught=" + isCaught +
                '}';
    }

    // GETTER
    public String getLook() {
        return look;
    }

    public int getNbOfCaptives() {
        return nbOfCaptives;
    }

    public float getReward() {
        return reward;
    }

    public boolean getCaught() {
        return isCaught;
    }

    public void addCaptive() {
        this.nbOfCaptives++;
        this.reward += 100.1f;
    }

    public void setFree() {
        this.isCaught = false;
    }

    public void isCaptured() {
        this.isCaught = true;
    }

    public void capture(Woman woman) {
        this.speak("Krkr! " + woman.getName() + ", you are my prisoner now!");
        woman.speak("Ho no please deliver me !");
        woman.isCaptured();
        this.addCaptive();
    }
}


