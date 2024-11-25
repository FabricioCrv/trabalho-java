import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Personagem {
    protected String nome;
    protected String raca;
    protected int vida;
    protected String arma;
    protected int dinheiro;

    Map<Integer,String> inventario = new HashMap<>();

    public Personagem(String nome, String raca, int vida, String arma, int dinheiro) {
        this.nome = nome;
        this.raca = raca;
        this.vida = vida;
        this.arma = arma;
        this.dinheiro = dinheiro;
    }



    public abstract void atacar(String alvo);
    public abstract void atacar(String habilidade, String alvo) throws ManaInsuficienteException;
    public abstract void comprarItem(int custoItem) throws DinheiroInsuficienteException;
    public abstract void mostrarInventario();
    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", vida=" + vida +
                ", arma='" + arma + '\'' +
                ", dinheiro=" + dinheiro +
                '}';
    }
}
