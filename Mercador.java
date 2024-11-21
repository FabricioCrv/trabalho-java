public class Mercador extends Npc implements Loja{
    public Mercador(String nome, boolean eImportante) {
        super(nome, eImportante);
    }

    @Override
    public void comprar() throws DinheiroInsuficienteException {

    }

    @Override
    public void vender() {

    }

    @Override
    public void mostrarEstoque() {
        System.out.println("Boas vindas a minha loja! O que voce quer comprar?");
        System.out.println("1- Poção de cura, 25 ouro");
        System.out.println("2- Espada, 125 ouro");
        System.out.println("3- Frostmourne, 9999 ouro");
    }

    @Override
    public String toString() {
        return "Mercador{" +
                "nome='" + nome + '\'' +
                ", eImportante=" + eImportante +
                '}';
    }
}
