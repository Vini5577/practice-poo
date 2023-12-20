public class Thunder extends Pokemon {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String apresetation(String name) {

        return "O nome desse pokémon é " + getName() +
                ", ele é " + getGenre()
                + ", sua altura é " + getHeight();
    }
}
