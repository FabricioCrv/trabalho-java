public abstract class Personagem {
    protected String nome;
    protected String raca;
    protected int vida;
    protected String arma;
    protected int dinheiro;
    protected String item;

    public Personagem(String nome, String raca, int vida, String arma, int dinheiro, String item) {
        this.nome = nome;
        this.raca = raca;
        this.vida = vida;
        this.arma = arma;
        this.dinheiro = dinheiro;
        this.item = item;
    }

    public abstract void atacar(Personagem alvo);
    public abstract void usarItem();
    public abstract void comprarItem(int custoItem) throws DinheiroInsuficienteException;
}
