package mainClasses_musica_package.main;
import mainClasses_musica_package.classes.Musica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int numeroPlaylist;

        Scanner leitor = new Scanner(System.in);

        ArrayList<Musica> listOfMusics = new ArrayList<>();

        Musica music = new Musica("Bring Me To Life", "Evanescence", "Fallen", "Rock", 2003, 240);
        Musica music2 = new Musica("Rock You Like A Hurricane", "Scorpions", "Love At First String", "Rock", 1984, 253);
        Musica music3 = new Musica("Knockin' On Heaven's Door", "Guns 'N Roses", "Use Your Illusion II", "Rock", 1991, 336 );
        Musica music4 = new Musica("Californication", "Red Hot Chilli Peppers", "Californication", "Funk Rock", 1999, 322);

        listOfMusics.add(music);
        listOfMusics.add(music2);
        listOfMusics.add(music3);
        listOfMusics.add(music4);


        System.out.println("\nNúmero de Músicas disponíveis: " + listOfMusics.size());
        System.out.println("\nPlaylist:");
        for (int i = 0; i < listOfMusics.size(); i++) {
            System.out.println(i + ": " + listOfMusics.get(i).getTitulo());
        }


        do{
            System.out.println("\nQual delas deseja ouvir? Digite o número correspondente, \nCaso opte por sair digite -1: ");
            numeroPlaylist = leitor.nextInt();
            if (numeroPlaylist == 0){
                System.out.println("Você escolheu: " + listOfMusics.get(0).getTitulo());
                System.out.println("Informações sobre a música: ");
                music.showStats();
                music.reproduzir();
                int curtir;
                System.out.println("Você gostou? Então curta digitando 1, caso não, digite qualquer coisa para sair::");
                curtir = leitor.nextInt();
                    if (curtir == 1) {
                        music.curtir(true);
                    }
            }

            else if (numeroPlaylist == 1){
                System.out.println("Você escolheu: " + listOfMusics.get(1).getTitulo());
                System.out.println("Informações sobre a música: ");
                music2.showStats();
                music2.reproduzir();
                int curtir;
                System.out.println("Você gostou? Então curta digitando 1, caso não, digite qualquer coisa para sair::");
                curtir = leitor.nextInt();
                if (curtir == 1) {
                    music2.curtir(true);
                }
            }

            else if (numeroPlaylist == 2){
                System.out.println("Você escolheu: " + listOfMusics.get(2).getTitulo());
                System.out.println("Informações sobre a música: ");
                music3.showStats();
                music3.reproduzir();
                int curtir;
                System.out.println("Você gostou? Então curta digitando 1, caso não, digite qualquer coisa para sair::");
                curtir = leitor.nextInt();
                if (curtir == 1) {
                    music3.curtir(true);
                }
            }

            else if (numeroPlaylist == 3){
                System.out.println("Você escolheu: " + listOfMusics.get(3).getTitulo());
                System.out.println("Informações sobre a música: ");
                music4.showStats();
                music4.reproduzir();
                int curtir;
                System.out.println("Você gostou? Então curta digitando 1, caso não, digite qualquer coisa para sair:");
                curtir = leitor.nextInt();
                if (curtir == 1) {
                    music4.curtir(true);
                }
            }

            else {
                System.out.println("Essa música não existe na playlist ainda.");
            }
        } while (numeroPlaylist != -1);





        }


}
