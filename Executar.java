import Diciona.Dicionario;
import Diciona.Termo;
import Dados.*;

public class Executar {
    public static void main(String[] args) {
        LDEC<Dicionario> listinha = new LDEC<Dicionario>();
        Termo termo = new Termo("Batata");
        String termin = termo.getTermo().toLowerCase();
        char letra = termin.charAt(0);
        Dicionario indice = new Dicionario(letra);
        listinha.inserir(indice, termo);
        termo = new Termo("Bola");
        termin = termo.getTermo().toLowerCase();
        letra = termin.charAt(0);
        indice = new Dicionario(letra);
        listinha.inserir(indice, termo);
        termo = new Termo("Baaaaaa");
        termin = termo.getTermo().toLowerCase();
        letra = termin.charAt(0);
        indice = new Dicionario(letra);
        listinha.inserir(indice, termo);
        termo = new Termo("AAr");
        termin = termo.getTermo().toLowerCase();
        letra = termin.charAt(0);
        indice = new Dicionario(letra);
        listinha.inserir(indice, termo);
        listinha.inserir(indice, termo);
        termo = new Termo("Arthur");
        termin = termo.getTermo().toLowerCase();
        letra = termin.charAt(0);
        indice = new Dicionario(letra);
        listinha.inserir(indice, termo);
        listinha.inserir(indice, termo);
        termo = new Termo("Zebra");
        termin = termo.getTermo().toLowerCase();
        letra = termin.charAt(0);
        indice = new Dicionario(letra);
        listinha.inserir(indice, termo);
        listinha.inserir(indice, termo);termo = new Termo("Canoa");
        termin = termo.getTermo().toLowerCase();
        letra = termin.charAt(0);
        indice = new Dicionario(letra);
        listinha.inserir(indice, termo);
        listinha.inserir(indice, termo);
        termo = new Termo("Marcos");
        termin = termo.getTermo().toLowerCase();
        letra = termin.charAt(0);
        indice = new Dicionario(letra);
        listinha.inserir(indice, termo);
        termo = new Termo("Matheus");
        termin = termo.getTermo().toLowerCase();
        letra = termin.charAt(0);
        indice = new Dicionario(letra);
        listinha.inserir(indice, termo);
        listinha.exibirPorIndice(indice);
        listinha.exibirDefinição(termo);
        //listinha.remover(indice, termo);
        System.out.println(listinha.exibirTodos());
    }
    
}
