import java.util.ArrayList;

public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Либретто: " + librettoText);
    }

    @Override
    public void printListActors() {
        System.out.println("Спектакль: " + title);
        printLibretto();
        System.out.println("Список актеров:");
        for (Actor actor: listOfActors) {
            System.out.println(actor);
        }
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }
}
