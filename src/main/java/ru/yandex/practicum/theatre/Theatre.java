package main.java.ru.yandex.practicum.theatre;

public class Theatre {
    public static void main(String[] args) {
        Actor firstActor = new Actor("Виктор", "Андреев", Gender.MALE, 167);
        Actor secondActor = new Actor("Евгений", "Морозов", Gender.MALE, 182);
        Actor thirdActor = new Actor("Екатерина", "Лебедева", Gender.FEMALE, 175);

        Director firstDirector = new Director("Алексей", "Соколов", Gender.MALE, 11);
        Director secondDirector = new Director("Николай", "Громов", Gender.MALE, 16);

        Person composer = new Person("Павел", "Крылов", Gender.MALE);
        Person choreographer = new Person("Юлия", "Васильева", Gender.FEMALE);

        Show dramaticShow = new Show("Тени старого дома", 80, firstDirector);
        Show operaShow = new Opera("Пламя и лёд", 70, secondDirector, composer, "Трагическая история любви принца и простой девушки, разделённых долгом и судьбой.", 4);
        Show balletShow = new Ballet("Сон лунного сада", 70, secondDirector, composer, "Лирическая история о волшебном саде, который оживает ночью.", choreographer);

        dramaticShow.addActor(firstActor);
        operaShow.addActor(secondActor);
        balletShow.addActor(thirdActor);

        dramaticShow.printListActors();
        operaShow.printListActors();
        balletShow.printListActors();

        dramaticShow.replaceActor(secondActor, "Андреев");
        dramaticShow.printListActors();
    }
}
