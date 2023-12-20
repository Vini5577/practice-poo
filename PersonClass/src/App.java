public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person();

        person.setName("Vini");
        person.setAge(21);
        person.setCity("Recife");

        System.out.println(
                "Hello, my name is " + person.getName() + ", I am " + person.getAge()
                        + " years old, and I live in the city of " + person.getCity() + ".");
    }
}
