public class Personagem {
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    //Método base que retorna a informação comum a todos os personagens
    public String getDescricaoBase() {
        return "Nome: " + nome + " | Nível: " + nivel;
    }    

    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
    }
}

