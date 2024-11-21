public class Comandante extends Npc{
    public Comandante(String nome, boolean eImportante) {
        super(nome, eImportante);
    }

    public void darMissao(){
        System.out.println("Há um grupo de ladrões aterrorisando nosso vilarejo! Você deve ir ao covil deles e neutraliza-los!");
    }

    @Override
    public String toString() {
        return "Comandante{" +
                "nome='" + nome + '\'' +
                ", eImportante=" + eImportante +
                '}';
    }
}
