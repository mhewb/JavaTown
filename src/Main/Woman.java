package Main;

public class Woman extends Human {

    private String dressColor;
    private boolean isCaught;

    public Woman(String name) {
        super(name);
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

    public String getDressColor() {
        return dressColor;
    }

    public boolean getCaught() {
        return isCaught;
    }

    public void changeDressColor(String newColor){
        this.dressColor = newColor;
        System.out.println("Look at my new " + this.dressColor + " dress!");
    }

    public void setFree() {
        this.isCaught = false;
    }

    public void isCaptured() {
        this.isCaught = true;
    }


}
