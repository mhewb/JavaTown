package Main;

public class Woman extends Human {

    private String dressColor;
    private boolean isCaught;

    public Woman(String name) {
        super(name, "milk");
        this.dressColor = "red";
        this.isCaught = false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMain.Women{" +
                "dressColor='" + dressColor + '\'' +
                ", isCaptured=" + isCaught +
                '}';
    }

    @Override
    public String getName() {
        return "Miss " + super.getName();
    }

    public String getDressColor() {
        return dressColor;
    }

    public boolean getCaught() {
        return isCaught;
    }

    public void changeDressColor(String newColor){
        this.dressColor = newColor;
        this.speak("Look at my new " + this.dressColor + " dress!");
    }

    public void setFree() {
        this.isCaught = false;
    }

    public void isCaptured() {
        this.isCaught = true;
    }


}
