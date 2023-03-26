package ru.netology.movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test

    public void shouldAddMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Movie I");
        manager.addMovie("Movie II");
        manager.addMovie("Movie III");
        manager.addMovie("Movie IV");
        manager.addMovie("Movie V");
        manager.addMovie("Movie VI");
        manager.addMovie("Movie VII");

        String[] expected = {"Movie I", "Movie II", "Movie III", "Movie IV", "Movie V", "Movie VI", "Movie VII"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void noMovieAdded() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOnlyOneMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Movie I");

        String[] expected = {"Movie I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindFiveLastMovieReverse() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Movie I");
        manager.addMovie("Movie II");
        manager.addMovie("Movie III");
        manager.addMovie("Movie IV");
        manager.addMovie("Movie V");

        String[] expected = {"Movie V", "Movie IV", "Movie III", "Movie II", "Movie I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindMinLastMovieReverse() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Movie I");
        manager.addMovie("Movie II");
        manager.addMovie("Movie III");

        String[] expected = {"Movie III", "Movie II", "Movie I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindMaxLastMovieReverse() {
        MovieManager manager = new MovieManager(7);

        manager.addMovie("Movie I");
        manager.addMovie("Movie II");
        manager.addMovie("Movie III");
        manager.addMovie("Movie IV");
        manager.addMovie("Movie V");
        manager.addMovie("Movie VI");
        manager.addMovie("Movie VII");

        String[] expected = {"Movie VII", "Movie VI", "Movie V", "Movie IV", "Movie III", "Movie II", "Movie I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void shouldFindLastLimitMoviesReverse() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie("Movie I");
        manager.addMovie("Movie II");
        manager.addMovie("Movie III");
        manager.addMovie("Movie IV");
        manager.addMovie("Movie V");

        String[] expected = {"Movie V", "Movie IV", "Movie III", "Movie II", "Movie I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastUnderLimitMoviesReverse() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie("Movie I");
        manager.addMovie("Movie II");
        manager.addMovie("Movie III");
        manager.addMovie("Movie IV");

        String[] expected = {"Movie IV", "Movie III", "Movie II", "Movie I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastInLimitMoviesReverse() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie("Movie I");
        manager.addMovie("Movie II");
        manager.addMovie("Movie III");
        manager.addMovie("Movie IV");
        manager.addMovie("Movie V");
        manager.addMovie("Movie VI");

        String[] expected = {"Movie VI", "Movie V", "Movie IV", "Movie III", "Movie II"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
