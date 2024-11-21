public abstract class Npc {
    protected String nome;
    protected boolean eImportante;

    public Npc(String nome, boolean eImportante) {
        this.nome = nome;
        this.eImportante = eImportante;
    }

    @Override
    public String toString() {
        return "Npc{" +
                "nome='" + nome + '\'' +
                ", eImportante=" + eImportante +
                '}';
    }
}
