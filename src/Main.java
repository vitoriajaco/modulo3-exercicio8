import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean p = true;
        Scanner scan = new Scanner(System.in);
        Produtos produtos = new Produtos();


        while (p==true){
            System.out.println("O que você deseja? ");
            System.out.println("Digite 1 - adicionar produto");
            System.out.println("Digite 2 - exibir lista produtos ");
            System.out.println("Digite 3 - Excluir produto");
            System.out.println("Digite 4 - Sair");

            int numeroEscolhido = scan.nextInt();

            switch (numeroEscolhido){
                case 1:
                    produtos.adicionar();
                    break;

                case 2:
                    produtos.exibir();
                    break;

                case 3:
                    produtos.remover();
                    break;

                case 4:
                    p = false;
                    break;

                default:
                    System.out.println("Escolha invalida");
            }

        }

//        ArrayList<Produtos> produtos = new ArrayList<>();


//
//        Produtos produto1 = new Produtos("TV",850);
//        Produtos produto2 = new Produtos("Air Fryer", 350);
//        Produtos produto3 = new Produtos("Cama", 650);
//
//        produtos.add(produto1);
//        produtos.add(produto2);
//        produtos.add(produto3);
//
//
//        for (Produtos p: produtos) {
//            System.out.println("O nome do produto é : " +  p.getNomeProduto() + " | O preço é R$ " + p.getPreco());
//        }







        Scanner input = new Scanner(System.in);







    }
}
