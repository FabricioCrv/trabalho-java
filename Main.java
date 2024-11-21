import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Varian","humano",100,"Espada",100,"poção de cura");
        Mago mago = new Mago("Jaina", "humano", 70,"Cajado",100,"poção de mana",100,"bola de fogo");
        Ladrao defias = new Ladrao("Defias",100,50);
        defias.possiveisItens.add("Espada");
        defias.possiveisItens.add("Dinheiro");
        defias.possiveisItens.add("Tecido");
        Comandante comandante = new Comandante("Comandante Johnson",true);
        Mercador mercador = new Mercador("Comerciante Lemmy", true);

        boolean condition = false;

        Scanner prompt = new Scanner(System.in);
        do{
            System.out.println("Selecione seu personagem (1-Guerreiro; 2-Mago)");
            int selecao = prompt.nextInt();
            try {
                if(selecao == 1){
                    System.out.println("Voce escolheu a classe guerreiro e seu nome é " +guerreiro.nome);
                    comandante.darMissao();
                    System.out.println("Antes de partir, voce deseja visitar o mercador? 1-sim; 2-nao");
                    int selecao2 = prompt.nextInt();
                    if(selecao2 == 1){
                        mercador.mostrarEstoque();
                        try {
                            int selecao_mercado = prompt.nextInt();
                            if(selecao_mercado == 1){
                                guerreiro.comprarItem(25);
                                guerreiro.inventario.add("Poção de cura");
                            }
                            else if(selecao_mercado == 2){
                                guerreiro.comprarItem(125);
                                guerreiro.inventario.add("Espada");
                            }
                            else if(selecao_mercado == 3){
                                guerreiro.comprarItem(9999);
                                guerreiro.inventario.add("Frostmourne");
                            }
                        }catch(DinheiroInsuficienteException e){
                            System.out.println(e.getMessage());
                            condition = true;
                        }
                    } else{
                        System.out.println("Voce chegou no esconderijo dos ladrões Defias e um deles sentiu sua presença!");
                        guerreiro.iniciarCombate();
                        System.out.println("O que voce deseja fazer? 1-Atacar 2-Usar um item");
                        int selecao_combate = prompt.nextInt();
                        if(selecao_combate == 1){
                            guerreiro.atacar("Defias");
                            System.out.println("Voce causou 50 pontos de dano!");
                            defias.pontoVida -= 50;
                            defias.atacar("Varian");
                            guerreiro.vida -= 20;
                            System.out.println("O que voce deseja fazer? 1-Atacar 2-Usar um item");
                            int selecao_combate2 = prompt.nextInt();
                            if(selecao_combate2 == 1){
                                guerreiro.atacar("Golpe mortal", "Defias");
                                defias.pontoVida -= 50;
                                System.out.println("O ladrão foi derrotado! Voce saqueou: " + defias.dinheiro + " peças de ouro e um " + defias.possiveisItens);
                            }
                        }
                    }
                }
            }catch (InputMismatchException e){
                prompt.nextLine();
                condition = true;
                System.out.println("Opção invalida!");
                //como faz pra fazer essa exceção disparar
            }
        }while (condition);

    }
}