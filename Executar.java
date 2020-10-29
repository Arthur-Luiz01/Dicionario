import Diciona.Dicionario;
import Dados.*;

public class Executar {
    public static void main(String[] args) {
        LDEC<Dicionario> listinha = new LDEC<Dicionario>();
        Dicionario termo = new Dicionario("Batata");
        listinha.inserir(termo);
        termo = new Dicionario("Arthur");
        listinha.inserir(termo);
        termo = new Dicionario("Atata");
        listinha.inserir(termo);
        termo = new Dicionario("Darco");
        listinha.inserir(termo);
        termo = new Dicionario("Carco");
        listinha.inserir(termo);
        termo = new Dicionario("Zenaide");
        listinha.inserir(termo);
        termo = new Dicionario("AA");
        listinha.inserir(termo);
        listinha.exibirTodos();

    }
    
}
