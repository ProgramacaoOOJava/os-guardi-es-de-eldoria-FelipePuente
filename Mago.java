public class Mago extends Personagem {
    private int inteligencia;
    public Mago(String nome, int nivel, int inteligencia) {
        super(nome, nivel); // Chama o construtor da classe Personagem
        this.inteligencia = inteligencia;
    }
    // Este método também reutiliza o método da classe pai
    public String exibirDescricaoCompleta() {
        return getDescricaoBase() + " | Inteligência: " + inteligencia;
    }
}
public class Arena {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Arthus", 10, 85);
        Mago mago = new Mago("Elenara", 12, 95);

        // Exibe as informações completas de cada herói
        System.out.println(guerreiro.exibirDescricaoCompleta());
        System.out.println(mago.exibirDescricaoCompleta());
    }
}