import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Varian","humano",100,"Espada",100);
        guerreiro.inventario.put(0, "poção de cura");
        guerreiro.inventario.put(1, "bombas");

        Mago mago = new Mago("Jaina", "humano", 70,"Cajado",100,100,"bola de fogo");
        mago.inventario.put(0, "poção de cura");
        mago.inventario.put(3, "poção de mana");

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
                if(selecao == 1){
                    System.out.println("Voce escolheu a classe guerreiro e seu nome é " +guerreiro.nome);
                    guerreiro.primeiraProfissao("Ferreiro");
                    guerreiro.segundaProfissao("Mineração");
                    comandante.darMissao();
                    System.out.println("Antes de partir, voce deseja visitar o mercador? 1-sim; 2-nao");
                    boolean condition_2 = false;
                    int selecao2 = prompt.nextInt();
                    if(selecao2 == 1){
                        mercador.mostrarEstoque();
                        try {
                            int selecao_mercado = prompt.nextInt();
                            if(selecao_mercado == 1){
                                guerreiro.comprarItem(25);
                                guerreiro.inventario.put(0, "Poção de cura");
                            }
                            else if(selecao_mercado == 2){
                                guerreiro.comprarItem(125);
                                guerreiro.inventario.put(4, "Espada");
                            }
                            else if(selecao_mercado == 3){
                                guerreiro.comprarItem(9999);
                                guerreiro.inventario.put(5, "Frostmourne");
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
                                Random random = new Random();
                                int random_item = random.nextInt(3);
                                System.out.println("O ladrão foi derrotado! Voce saqueou: " + defias.dinheiro + " peças de ouro e um " + defias.possiveisItens.get(random_item));
                                guerreiro.finalizarCombate();
                            }
                        } else if (selecao_combate == 2){
                            System.out.println("Que item voce deseja usar?");
                            guerreiro.mostrarInventario();
                            int selecao_item = prompt.nextInt();
                            System.out.println("Voce usou: " + guerreiro.inventario.get(selecao_item));
                        }
                    }
                }else if(selecao == 2){
                    System.out.println("Voce escolheu a classe Mago e seu nome é " + mago.nome);
                    mago.primeiraProfissao("Encantamento");
                    mago.segundaProfissao("Alfaiataria");
                    comandante.darMissao();
                    System.out.println("Antes de partir, voce deseja visitar o mercador? 1-sim; 2-nao");
                    int selecao2 = prompt.nextInt();
                    if(selecao2 == 1){
                        mercador.mostrarEstoque();
                        try {
                            int selecao_mercado = prompt.nextInt();
                            if(selecao_mercado == 1){
                                mago.comprarItem(25);
                                mago.inventario.put(0, "Poção de cura");
                            }
                            else if(selecao_mercado == 2){
                                mago.comprarItem(125);
                                mago.inventario.put(4, "Espada");
                            }
                            else if(selecao_mercado == 3){
                                mago.comprarItem(9999);
                                mago.inventario.put(5, "Frostmourne");
                            }
                        }catch(DinheiroInsuficienteException e){
                            System.out.println(e.getMessage());
                            condition = true;
                        }
                    } else {
                        System.out.println("Voce chegou no esconderijo dos ladrões Defias e um deles sentiu sua presença!");
                        mago.iniciarCombate();
                        System.out.println("O que voce deseja fazer? 1-Atacar 2-Usar um item");
                        int selecao_combate = prompt.nextInt();
                        if(selecao_combate == 1){
                            mago.atacar("Defias");
                            System.out.println("Voce causou 25 pontos de dano!");
                            defias.pontoVida -= 25;
                            defias.atacar("Jaina");
                            mago.vida -= 20;
                            System.out.println("O que voce deseja fazer? 1-Atacar 2-Usar um item");
                            int selecao_combate2 = prompt.nextInt();
                            if(selecao_combate2 == 1){
                                try{
                                    mago.atacar("Meteoro", "Defias");
                                    defias.pontoVida -= 50;
                                    Random random = new Random();
                                    int random_item = random.nextInt(3);
                                    System.out.println("O ladrão foi derrotado! Voce saqueou: " + defias.dinheiro + " peças de ouro e um " + defias.possiveisItens.get(random_item));
                                }catch (ManaInsuficienteException e){
                                    System.out.println(e.getMessage());
                                    condition = true;
                                }
                            } else if (selecao_combate2 == 2){
                                System.out.println("Que item voce deseja usar?");
                                mago.mostrarInventario();
                                int selecao_item = prompt.nextInt();
                                System.out.println("Voce usou: " + mago.inventario.get(selecao_item));
                            }
                        }
                    }
                }
        }while (condition);

    }
}