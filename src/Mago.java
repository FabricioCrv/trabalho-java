public class Mago extends Personagem implements Combate{
    protected int mana;
    protected String feitico;

    public Mago(String nome, String raca, int vida, String arma, int dinheiro, String item, int mana, String feitico) {
        super(nome, raca, vida, arma, dinheiro, item);
        this.mana = mana;
        this.feitico = feitico;
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
    public void atacar(Personagem alvo) {
        System.out.println("Atacando " + alvo +" com Magia!");
    }

    @Override
    public void usarItem() {
        System.out.println("Usando " + item);
    }

    @Override
    public void comprarItem(int custoItem) throws DinheiroInsuficienteException {
        if (custoItem > this.dinheiro){
            throw new DinheiroInsuficienteException();
        } else {
            dinheiro -= custoItem;
        }
    }

    public void usarFeitico(int custoMana) throws ManaInsuficienteException{
        if(custoMana > this.mana){
            throw new ManaInsuficienteException();
        } else {
            System.out.println("Usando feitiço: " + feitico);
            mana -= custoMana;
        }

    }
}
