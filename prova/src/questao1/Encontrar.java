package questao1;

public class Encontrar {

    public static void main(String[] args) {
        Usuario user1 = new Usuario("Misael", "misael@gmail.com", "senha do misael");
        AchadoPerdido achadoPerdido = new AchadoPerdido("Livro","Livro de informática","Sem foto", "Objeto para leitura","Na faculdade","05/10/2023","Perdido");
        achadoPerdido.buscarTitulo("Livro");
        achadoPerdido.visualizarDetalhes();
    }
}
