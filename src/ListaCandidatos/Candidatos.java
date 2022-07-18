package ListaCandidatos;
import java.util.ArrayList;
import java.util.Scanner;

public class Candidatos {

    private String numeroMatricula;
    private float nota;

    Scanner input = new Scanner(System.in);

    ArrayList<Candidatos> listaCandidatos = new ArrayList<>();

    public Candidatos(String numeroMatricula, float nota) {
        this.numeroMatricula = numeroMatricula;
        this.nota = nota;
    }

    public Candidatos(){}

    public void adicionar(){

        System.out.println("Qual o número de matrícula do candidato: ");
        String matricula = input.next();

        System.out.println("Qual a nota do candidato: ");
        float nota = input.nextFloat();

        System.out.println("Você adicionou um novo candidato! O candidato tem como número de matrícula: " + matricula + " e nota: " + nota);

        Candidatos novoCandidato = new Candidatos(matricula, nota);
        listaCandidatos.add(novoCandidato);
    }

    public void exibir (){

        for (int i = 0; i < listaCandidatos.size(); i++){
            System.out.println("Número de matrícula: " + listaCandidatos.get(i).getNumeroMatricula() + " nota: " + listaCandidatos.get(i).getNota());
        }
    }

    public void excluir(){

        System.out.println("Qual a matrícula você quer excluir? ");
        exibir();
        String excluirCandidato = input.next();

        for (int i = 0; i < listaCandidatos.size(); i++){
            if (listaCandidatos.get(i).getNumeroMatricula().equals(excluirCandidato)){
                listaCandidatos.remove(i);
                System.out.println("Foi removido com sucesso!");
            }
        }
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
