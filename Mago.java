import java.util.Map;

public class Mago extends Personagem implements Combate{
    protected int mana;


    public Mago(String nome, String raca, int vida, String arma, int dinheiro, int mana, String feitico) {
        super(nome, raca, vida, arma, dinheiro);
        this.mana = mana;
    }

    @Override
    public void iniciarCombate() {
        System.out.println("Combate Iniciado!");
    }

    @Override
    public void finalizarCombate() {
        System.out.println("Finalizou combate!");
    }

    @Override
    public void atacar(String alvo) {
        System.out.println("Atacando " + alvo +" com Magia!");
    }

    @Override
    public void atacar(String habilidade,String alvo) throws ManaInsuficienteException{
        int custoMana = 0;
        if (habilidade == "Meteoro"){
            custoMana = 100;
        }
        if (custoMana > this.mana){
            throw new ManaInsuficienteException();
        }
        System.out.println("Atacando o alvo com o feitiço: " + habilidade);
    }

    @Override
    public void mostrarInventario() {
        for(Map.Entry<Integer, String> item : inventario.entrySet() ){
            System.out.println(item.getKey() + "-" + item.getValue());
        }
    }

    @Override
    public void comprarItem(int custoItem) throws DinheiroInsuficienteException {
        if (custoItem > this.dinheiro){
            throw new DinheiroInsuficienteException();
        } else {
            dinheiro -= custoItem;
        }
    }

    @Override
    public String toString() {
        return "Mago{" +
                "mana=" + mana +
                ", nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", vida=" + vida +
                ", arma='" + arma + '\'' +
                ", dinheiro=" + dinheiro +
                '}';
    }

    @Override
    public void primeiraProfissao(String profissao) {
        System.out.println("Sua profissão primaria é " + profissao);
    }

    @Override
    public void segundaProfissao(String profissao) {
        System.out.println("Sua profissão secundaria é " + profissao);
    }
}

