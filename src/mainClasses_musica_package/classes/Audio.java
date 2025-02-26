package mainClasses_musica_package.classes;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes = 0;
    private int curtidas = 0;
    private String classificacao;


    public int curtir(boolean curtir){
        return curtidas++;
    }

    public void reproduzir(){
        totalDeReproducoes++;
        System.out.println("Reproduzindo...");
        System.out.println("Total de reproduções: " + totalDeReproducoes);

    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
