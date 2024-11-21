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
    public void atacar(String alvo){
        System.out.println("Atacando " + alvo + " com " + arma);

    }

    @Override
    public void atacar(String habilidade, String alvo) {
        System.out.println("Atacando usando a habilidade: " + habilidade);
    }

    @Override
    public void usarItem(Inventario item) {
        System.out.println("Você usou o item: " + item);
        inventario.remove(item);
    }

    @Override
    public void jogarItemFora(Inventario item) {
        System.out.println("Você jogou fora: " + item);
        inventario.remove(item);
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
        return "Guerreiro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", vida=" + vida +
                ", arma='" + arma + '\'' +
                ", dinheiro=" + dinheiro +
                ", item='" + item + '\'' +
                '}';
    }


}
