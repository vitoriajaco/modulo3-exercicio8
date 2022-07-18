package CardapioRestaurante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean c = true;
        Scanner scan = new Scanner(System.in);
        Cardapio cardapios = new Cardapio();

        while (c == true) {

            System.out.println("O que você deseja? ");
            System.out.println("Digite 1 - adicionar prato");
            System.out.println("Digite 2 - exibir lista de pratos ");
            System.out.println("Digite 3 - Excluir prato");
            System.out.println("Digite 4 - Sair");

            int numeroEscolhido = scan.nextInt();

            switch (numeroEscolhido) {
                case 1:
                    cardapios.adicionar();
                    break;

                case 2:
                    cardapios.exibir();
                    break;

                case 3:
                    cardapios.removerPrato();
                    break;

                case 4:
                    c = false;
                    break;

                default:
                    System.out.println("Escolha invalida");

            }
        }
    }
}