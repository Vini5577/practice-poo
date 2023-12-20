import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();
        student.setName(name);

        System.out.println("Digite sua idade: ");
        int age = sc.nextInt();
        student.setAge(age);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota da N" + (i + 1));
            Double note = sc.nextDouble();
            student.setNotes(note);
        }

        student.calculoMedia();

        System.out.println("STATUS DO ALUNO");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Média: " + student.Resultado());

        sc.close();
    }
}
