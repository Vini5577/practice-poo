import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int age;
    private List<Double> notes = new ArrayList<Double>();
    private Double media;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0)
            throw new RuntimeException("A idade deve ser maior que 0");
        this.age = age;
    }

    public void setNotes(Double notes) {
        this.notes.add(notes);
    }

    public List<Double> getNotes() {
        return notes;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Double getMedia() {
        return this.media;
    }

    public void calculoMedia() {
        double soma = 0;
        double mediaCalculada = 0;

        for (int i = 0; i < getNotes().size(); i++) {
            soma += getNotes().get(i);
            System.out.println(getNotes().get(i));
        }

        mediaCalculada = soma / 3;
        setMedia(mediaCalculada);
    }

    public String Resultado() {
        System.out.println(getMedia());
        return getMedia() >= 7 ? "APROVADO" : "REPROVADO";
    }

}
