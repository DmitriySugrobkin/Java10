import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void add3Films() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");

        String[] expected = {"Movie1", "Movie2", "Movie3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneFilms() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Movie1");

        String[] expected = {"Movie1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addZeroFilms() {
        FilmsManager manager = new FilmsManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLast3FilmsWithLimit() {
        FilmsManager manager = new FilmsManager(3);

        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");
        manager.addFilm("Movie4");
        manager.addFilm("Movie5");

        String[] expected = {"Movie5", "Movie4", "Movie3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLast1Films() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Movie1");


        String[] expected = {"Movie1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastFilms() {
        FilmsManager manager = new FilmsManager(7);

        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");
        manager.addFilm("Movie4");
        manager.addFilm("Movie5");

        String[] expected = {"Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
