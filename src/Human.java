public class Human {

    private String name;
    private String favoriteDrink;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteDrink() {
        return favoriteDrink;
    }

    protected void speaks(String sentence) {
        System.out.println(this.getName() + " - " + sentence);
    }

    protected void introduceYourself() {
        System.out.println(
                "Hello, my name is " + this.getName() +
                " and I like my " + getFavoriteDrink() + "with some ice.");
    }

    protected void drink() {
        System.out.println("Ah ! A good ol'" + getFavoriteDrink() + "! GLOUPS!");
    }

}
