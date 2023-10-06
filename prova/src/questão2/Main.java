package questão2;

public class Main {
    public static void main(String[] args) {
        DistribuicaoAlimento da = new DistribuicaoAlimento("Criança Esperança","Projeto Social para Criança","Brasil","05/10/2023","06/10/2023","Biscoito",500);
        TrabalhoVoluntario tv = new TrabalhoVoluntario("Criança Esperança","Projeto Social para Criança","Brasil","05/10/2023","06/10/2023","Monitor",8);

        System.out.println("\nDistribuição de alimento\n" + da.imprimeProjeto());
        System.out.println("\nTrabalho voluntario\n" + tv.imprimeProjeto());
    }
}