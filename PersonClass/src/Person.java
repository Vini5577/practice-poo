public class Person {

    private String name;
    private int age;
    private String city;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age < 0)
            throw new RuntimeException("A idade deve ser maior que 0");

        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

}
