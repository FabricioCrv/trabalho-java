import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class Inimigo {
    protected String nome;
    protected int pontoVida;
    protected int dinheiro;

    public Inimigo(String nome, int pontoVida, int dinheiro) {
        this.nome = nome;
        this.pontoVida = pontoVida;
        this.dinheiro = dinheiro;
    }
    ArrayList<String> possiveisItens = new ArrayList<>();


    public abstract void atacar(String alvo);
    public abstract void atacar(String habilidade, String alvo);

    @Override
    public String toString() {
        return "Inimigo{" +
                "nome='" + nome + '\'' +
                ", pontoVida=" + pontoVida +
                ", dinheiro=" + dinheiro +
                '}';
    }
}
