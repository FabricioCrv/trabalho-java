public abstract class Personagem implements Inventario {
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

    public abstract void atacar(String alvo);
    public abstract void atacar(String habilidade, String alvo) throws ManaInsuficienteException;
    public abstract void comprarItem(int custoItem) throws DinheiroInsuficienteException;

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", vida=" + vida +
                ", arma='" + arma + '\'' +
                ", dinheiro=" + dinheiro +
                ", item='" + item + '\'' +
                '}';
    }
}
