public class Ladrao extends Inimigo{
    public Ladrao(String nome, int danoCausado, int pontoVida, int dinheiro) {
        super(nome, danoCausado, pontoVida, dinheiro);
    }

    @Override
    public void atacar(Inimigo alvo) {
        System.out.println("Atacando " + alvo);
    }

    public void roubarDinheiro(Inimigo alvo){
        System.out.println("Roubando dinheiro de " + alvo);
    }

}
