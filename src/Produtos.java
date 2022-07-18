
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Produtos {
    private String nomeProduto;
    private double preco;

    public Produtos () {}

    ArrayList<Produtos> listaProdutos = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    public void adicionar(){
        System.out.println("Qual produto deseja adicionar? ");
        String produto = input.next();

        System.out.println("Qual o valor?");
        double valor = input.nextDouble();

        System.out.println("Você adicionou um povo produto! " + "| Produto: " + produto
        + " com o preço de R$ " + valor);

        Produtos novoProduto = new Produtos(produto, valor);
        listaProdutos.add(novoProduto);
    }

    public void exibir(){
        for (int i = 0; i<listaProdutos.size(); i++) {
            System.out.println("Produto: " + listaProdutos.get(i).getNomeProduto()
            + " |  Preço: R$" + listaProdutos.get(i).getPreco());
        }
    }

    public void remover(){
        System.out.println("Qual produto você quer excluir? ");
        exibir();
        String excluirProduto = input.next();

        for (int i=0; i< listaProdutos.size(); i++){
            if (listaProdutos.get(i).getNomeProduto().equals(excluirProduto)){
                listaProdutos.remove(i);
                System.out.println("Seu produto foi removido com sucesso!");
            }
        }

    }

    public void adicionarNovoProduto() {
        System.out.println("Deseja adicionar um novo produto? 1- Sim e 2 - Não");
        int resposta = input.nextInt();
        if (resposta == 1) {
            System.out.println("Você adicionou um novo produto!");
            Produtos novoProduto = new Produtos(getNomeProduto(), getPreco());
            listaProdutos.add(novoProduto);
            exibir();
        } else{
            exibir();
            System.out.println("Deseja remover um produto? 3 - Sim e 4 - Não");
            int resposta2 = input.nextInt();
             if (resposta2 == 3){
                 remover();
             } else {
                 System.out.println("Aqui está a lista de produtos finalizada");
                 exibir();
             }

            }
        }

    public Produtos(String nomeProduto, double preco) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", preco=" + preco +
                '}';
    }
}


