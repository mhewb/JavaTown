package Main;

public class Woman extends Human {

    private String dressColor;
    private boolean isCaptured;

    public Woman(String name) {
        super(name);
        this.dressColor = "red";
        this.isCaptured = false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMain.Women{" +
                "dressColor='" + dressColor + '\'' +
                ", isCaptured=" + isCaptured +
                '}';
    }

    public String getDressColor() {
        return dressColor;
    }

    public boolean isCaptured() {
        return isCaptured;
    }

    public void changeDressColor(String newColor){
        this.dressColor = newColor;
        System.out.println("Look at my new " + this.dressColor + " dress!");
    }


}
