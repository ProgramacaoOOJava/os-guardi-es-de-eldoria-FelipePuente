public class Guerreiro extends Personagem {

    private int forca;

    public Guerreiro(String nome, int nivel, int forca) {
        super(nome, nivel);    // Chama o construtor da classe Personagem
        this.forca = forca;

    }
    // Este método utiliza o método da classe pai para construir sua descrição
    public String exibirDescricaoCompleta() {
        // Reutiliza getDescricaoBase() e adiciona a informação específica
        return getDescricaoBase() + " | Força: " + forca;
    }
}