import java.util.ArrayList;

public interface Inventario {
    ArrayList<String> inventario = new ArrayList<>();

    void usarItem(Inventario item);
    void jogarItemFora(Inventario item);
}
