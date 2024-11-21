public class DinheiroInsuficienteException extends Exception{
    public String getMessage(){
        return "Você não tem ouro o suficiente!";
    }
}
