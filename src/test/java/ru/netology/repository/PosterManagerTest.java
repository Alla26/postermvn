package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;


public class PosterManagerTest {

    Film poster1 = new Film("Матрица", 1999);
    Film poster2 = new Film("Пианист", 2002);
    Film poster3 = new Film("Бойцовский клуб", 1999);
    Film poster4 = new Film("Нефть", 2007);
    Film poster5 = new Film("Превосходство", 2014);
    Film poster6 = new Film("Начало", 2010);
    Film poster7 = new Film("Игры разума", 2001);
    Film poster8 = new Film("Распутник", 2004);
    Film poster9 = new Film("Зеленая миля", 1999);
    Film poster10 = new Film("Декан Спенли", 2008);
    Film poster11 = new Film("Побег из Шоушенка", 1994);
    Film poster12 = new Film("Нежность", 2011);

    PosterManager repo = new PosterManager();
    /*PosterManager manager = new PosterManager(repo);*/


    @BeforeEach
    public void setup() {
        repo.save(poster1);
        repo.save(poster2);
        repo.save(poster3);
        repo.save(poster4);
        repo.save(poster5);
        repo.save(poster6);
        repo.save(poster7);
        repo.save(poster8);
        repo.save(poster9);
        repo.save(poster10);
        repo.save(poster11);
        repo.save(poster12);

    }

    @Test

    public void shouldReturnPosters() {
      /* repo.save(poster1);
        repo.save(poster2);
        repo.save(poster3);*/

        Film[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8, poster9, poster10, poster11, poster12};
        Film[] actual = repo.getPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldReversedAllPosters() {
       /* repo.save(poster1);
        repo.save(poster2);
        repo.save(poster3);*/

        Film[] expected = {poster12, poster11, poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2, poster1};
        Film[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldReturnAllPosters() {


        Film[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8, poster9, poster10, poster11, poster12};
        Film[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldReturnTenPosters() {


        Film[] expected = {poster12, poster11, poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3};
        Film[] actual = repo.findLastTen();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnRandomPosters() {


        Film[] expected = {poster12, poster11, poster10, poster9};
        Film[] actual = repo.findLastRandom(4);

        Assertions.assertArrayEquals(expected, actual);
    }


}
