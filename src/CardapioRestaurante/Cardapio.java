package CardapioRestaurante;

import Produtos.Produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cardapio {
    private String nomePrato;
    private List<String> ingredientes = new ArrayList<>();

    public Cardapio(){}

    public Cardapio(String nomePrato, List<String> ingredientes) {
        this.nomePrato = nomePrato;
        this.ingredientes = ingredientes;
    }

    ArrayList<Produtos>listaDeIngredientes = new ArrayList<>();
        Scanner input = new Scanner(System.in);

    ArrayList<Cardapio> pratos = new ArrayList<Cardapio>();

    public void adicionar(){
        System.out.println("Qual prato deseja adicionar? ");
        String nomePratoinput = input.next();

        System.out.println("Qual ingrediente deseja adicionar? ");
        String nomeIngrediente = input.next();

        System.out.println("Você adicionou um novo prato!" + nomePratoinput +
               "| Solicitando este ingrediente: " + nomeIngrediente);

        Cardapio novoPrato = new Cardapio(nomePratoinput, ingredientes);
        pratos.add(novoPrato);

    }
    //falta terminar com o get ingredientes
    public void exibir(){
        for (int i=0; i<pratos.size(); i++){
            System.out.println("Seu prato é: " + pratos.get(i).getNomePrato());

        }
    }
    public void removerPrato(){
        System.out.println("Qual prato você deseja remover?");
        exibir();
        String excluirPrato = input.next();

        for (int i=0; i<pratos.size(); i++){
            if (pratos.get(i).getNomePrato().equals(excluirPrato)) {
                pratos.remove(i);
                System.out.println("O prato foi removido!");
            }
        }
    }

    public void adicionarNovoPrato(){
        System.out.println("Deseja adicionar um novo prato? 1- Sim e 2 - Não");
        int resposta = input.nextInt();
        if (resposta==1){
            System.out.println("Você adicionou um novo prato");
            Cardapio novoPrato = new Cardapio (getNomePrato() , getIngredientes());
            pratos.add(novoPrato);
            exibir();
        } else {
            exibir();
            System.out.println("Deseja remover um produto? 3- Sim e 4 - Não");
            int resposta2 = input.nextInt();
            if (resposta2 == 3) {
                removerPrato();
            } else {
                System.out.println("Aqui está sua lista de pratos atualizada: ");
                exibir();
            }
        }
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Cardapio{" +
                "nomePrato='" + nomePrato + '\'' +
                ", ingredientes=" + ingredientes +
                ", listaDeIngredientes=" + listaDeIngredientes +
                '}';
    }
}
