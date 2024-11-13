public abstract class Inimigo {
    protected String nome;
    protected int pontoVida;
    protected int dinheiro;

    public Inimigo(String nome, int danoCausado, int pontoVida, int dinheiro) {
        this.nome = nome;
        this.pontoVida = pontoVida;
        this.dinheiro = dinheiro;
    }

    public abstract void atacar(Inimigo alvo);
}
