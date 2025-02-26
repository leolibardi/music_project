package mainClasses_musica_package.main;

import mainClasses_musica_package.classes.Musica;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        Musica music = new Musica("Bring Me To Life", "Evanescence", "Fallen", "Rock", 2003, 240);
        music.showStats();
        music.reproduzir();


        Musica music2 = new Musica("Rock You Like A Hurricane", "Scorpions", "Love At First String", "Rock", 1984, 253);
        music2.showStats();
        music2.reproduzir();


        ArrayList<Musica> listOfMusics = new ArrayList<>();
        listOfMusics.add(music);
        listOfMusics.add(music2);

        System.out.println("\nTamanho da Lista: " + listOfMusics.size());

        for (int i = 0; i < listOfMusics.size(); i++) {
            System.out.println("\nMusica: " + listOfMusics.get(i).getTitulo());
        }


        }
    }
