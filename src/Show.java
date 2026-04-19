import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Данный актер существует: " + actor);
            return;
        }
        listOfActors.add(actor);
        System.out.println(actor + " добавлен в спектакль " + title);
    }

    public void printListActors() {
        System.out.println("Спектакль: " + title);
        System.out.println("Список актеров:");
        for (Actor actor: listOfActors) {
            System.out.println(actor);
        }
    }

    public void replaceActor(Actor actor, String currentActorSurname) {
        for (Actor a: listOfActors) {
            if (a.getSurname().equals(currentActorSurname)) {
                listOfActors.remove(a);
                listOfActors.add(actor);
                System.out.println("Актер заменен на: " + actor);
                return;
            }
        }
        System.out.println("Актер не найден!");
    }
}
