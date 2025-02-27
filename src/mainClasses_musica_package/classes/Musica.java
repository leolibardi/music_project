package mainClasses_musica_package.classes;

public class Musica extends Audio {
    private String artist;
    private String album;
    private String genre;
    private int releaseYear;


    public Musica (String titulo, String artist, String album, String genre, int releaseYear, int duracao){
        this.setTitulo(titulo);
        this.setArtist(artist);
        this.setAlbum(album);
        this.setGenre(genre);
        this.setReleaseYear(releaseYear);
        this.setDuracao(duracao);
    }


    public void  showStats(){
        System.out.println("Titulo: " + getTitulo() + ", \nArtista: " + getArtist() + ", \nAlbum: " + getAlbum() + ", \nGênero: " + getGenre() + ", \nAno de lançamento: " + releaseYear + ", \nDuração: " + getDuracao()/60+" minutos.\n\n" );
    }


    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
