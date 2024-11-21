public class Ladrao extends Inimigo{
    public Ladrao(String nome, int pontoVida, int dinheiro) {
        super(nome, pontoVida, dinheiro);
    }

    @Override
    public void atacar(String alvo) {
        System.out.println("Ladrão está atacando " + alvo);
    }

    @Override
    public void atacar(String habilidade, String alvo) {
        System.out.println("Ladrão usou " + habilidade + " contra " + alvo);
    }

    public void roubarDinheiro(Inimigo alvo){
        System.out.println("Roubando dinheiro de " + alvo);
    }

    @Override
    public String toString() {
        return "Ladrao{" +
                "nome='" + nome + '\'' +
                ", pontoVida=" + pontoVida +
                ", dinheiro=" + dinheiro +
                '}';
    }
}
