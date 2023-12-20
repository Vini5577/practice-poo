import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Thunder thunder = new Thunder();
        Water water = new Water();

        System.out.println("Digite o nome de um Pokémon do tipo elétrico: ");
        String thunderName = sc.nextLine();
        thunder.setName(thunderName);

        System.out.println("Qual o genêro dele?");
        String thunderGenre = sc.nextLine();
        thunder.setGenre(thunderGenre);

        System.out.println("Qual é a altura dele?");
        String thunderHeight = sc.nextLine();
        thunder.setHeight(thunderHeight);

        /* ===== apresetation thunder pokemon */
        System.out.println(thunder.apresetation(thunderName));

        System.out.println("Digite o nome de um Pokémon do tipo água: ");
        String waterName = sc.nextLine();
        water.setName(waterName);

        System.out.println("Qual o genêro dele?");
        String waterGenre = sc.nextLine();
        water.setGenre(waterGenre);

        System.out.println("Qual é a altura dele?");
        String waterHeight = sc.nextLine();
        water.setHeight(waterHeight);

        System.out.println("Qual é a sua principal caracteristica?");
        String waterDescribe = sc.nextLine();
        water.setDescribe(waterDescribe);

        /* ===== apresetation water pokemon */
        System.out.println(water.apresetation(thunderName));

        sc.close();
    }
}
