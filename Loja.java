public interface Loja {
    void comprar() throws DinheiroInsuficienteException;
    void vender();
    void mostrarEstoque();
}
