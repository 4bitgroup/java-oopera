package main.java.ru.yandex.practicum.theatre;

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
        int countActorsForReplace = 0;
        Actor actorList = null;
        for (Actor a: listOfActors) {
            if (a.getSurname().equals(currentActorSurname)) {
                actorList = a;
                countActorsForReplace++;
            }
        }
        if (countActorsForReplace == 0) {
            System.out.println("Актер не найден!");
        } else if (countActorsForReplace > 1) {
            System.out.println("Найдено более одного актера с такой фамилией");
        } else {
            listOfActors.remove(actorList);
            listOfActors.add(actor);
            System.out.println("Актер заменен на: " + actor);
        }
    }
}
