import java.io.File;
import java.util.Map;

public class Guerreiro extends Personagem implements Combate{

    public Guerreiro(String nome, String raca,int vida, String arma, int dinheiro) {
        super(nome, raca,vida, arma, dinheiro);
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
    public void atacar(String alvo){
        System.out.println("Atacando " + alvo + " com " + arma);

    }

    @Override
    public void atacar(String habilidade, String alvo) {
        System.out.println("Atacando usando a habilidade: " + habilidade);
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
    public void mostrarInventario() {
        for(Map.Entry<Integer, String> item : inventario.entrySet() ){
            System.out.println(item.getKey() + "-" + item.getValue());
        }
    }

    @Override
    public String toString() {
        return "Guerreiro{" +
                "nome='" + nome + '\'' +
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
