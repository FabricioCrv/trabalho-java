public class Guerreiro extends Personagem implements Combate{

    public Guerreiro(String nome, String raca,int vida, String arma, int dinheiro, String item) {
        super(nome, raca,vida, arma, dinheiro, item);
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
    public void atacar(Personagem alvo){
        System.out.println("Atacando " + alvo + " com " + arma);

    }

    @Override
    public void usarItem() {

    }


    @Override
    public void comprarItem(int custoItem) throws DinheiroInsuficienteException {
        if (custoItem > this.dinheiro){
            throw new DinheiroInsuficienteException();
        } else {
            dinheiro -= custoItem;
        }
    }
}
