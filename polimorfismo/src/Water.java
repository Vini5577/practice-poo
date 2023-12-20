public class Water extends Pokemon {

    private String name;
    private String describe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String apresetation(String name) {

        return "O nome desse pokémon é " + getName()
                + ", ele é " + getGenre()
                + ", sua altura é " + getHeight()
                + ", sua principal caracteristica é " + getDescribe();
    }
}
