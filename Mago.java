public class Mago extends Personagem implements Combate{
    protected int mana;


    public Mago(String nome, String raca, int vida, String arma, int dinheiro, String item, int mana, String feitico) {
        super(nome, raca, vida, arma, dinheiro, item);
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
        if (this.mana == 0){
            throw new ManaInsuficienteException();
        }
        System.out.println("Atacando o alvo com o feitiço: " + habilidade);
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
        return "Mago{" +
                "mana=" + mana +
                ", nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", vida=" + vida +
                ", arma='" + arma + '\'' +
                ", dinheiro=" + dinheiro +
                ", item='" + item + '\'' +
                '}';
    }
}

