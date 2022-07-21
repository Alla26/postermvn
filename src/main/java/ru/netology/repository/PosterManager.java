package ru.netology.repository;

import ru.netology.domain.Film;

public class PosterManager {

    private Film[] posters = new Film[0];

    public Film[] getPosters() {
        return posters;
    }

    public void save(Film poster) {
        Film[] tmp = new Film[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public Film[] findAll() {
        Film[] all = getPosters();
        Film[] list = new Film[all.length];
        for (int i = 0; i < list.length; i++) {
            list[i] = all[i];
        }
        return list;

    }

    public Film[] findLast() {
        Film[] all = getPosters();
        Film[] reversed = new Film[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    public Film[] findLastTen() {
        int quantity = 10;
        Film[] reversed = findLast();
        Film[] abbreviated = new Film[quantity];
        for (int i = 0; i < quantity; i++) {
            abbreviated[i] = reversed[i];
        }
        return abbreviated;

    }

   /* public Film[] findLasstTen() {
        int quantity = 10;
        Film[] all = getPosters();
        Film[] reversed = new Film[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        Film[] abbreviated = new Film[quantity];
        for (int i = 0; i < quantity; i++) {
            abbreviated[i] = reversed[i];
        }
        return abbreviated;

    }*/

    public Film[] findLastRandom(int quantity) {
        Film[] reversed = findLast();
        Film[] abbreviatedRandom = new Film[quantity];
        for (int i = 0; i < quantity; i++) {
            abbreviatedRandom[i] = reversed[i];
        }
        return abbreviatedRandom;
    }


}
