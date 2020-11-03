package CadastroDicionario;
import Dados.*;
import Diciona.*;
import java.util.*;
public class CadastroDicionario {
    Scanner in = new Scanner (System.in);
    private LDEC <Dicionario> dicionario;
    private Termo termo;
    private String termin;
    private char letra;
    private Dicionario indice, resultado;
    public CadastroDicionario () {
        dicionario = new LDEC <Dicionario>();
    }
    public void Cadastrar () {
        System.out.println("Informe o termo a cadastrar");
        System.out.println("E após, sua definição");
        termo = new Termo(in.next(), in.nextLine());
        termin = termo.getTermo().toUpperCase();
        letra = termin.charAt(0);
        indice = new Dicionario (letra);
        dicionario.inserir(indice, termo);
    }
    public void Remover () {}
    public void exibirDefi () {
        System.out.println("Informe o termo que procura a definição");
        termo = new Termo (in.nextLine(),"");
        termin = termo.getTermo().toUpperCase();
        letra = termin.charAt(0);
        indice = new Dicionario (letra);
        dicionario.exibirDefinição(indice, termo);
    }
    public void Editar () {
        System.out.println("Informe o termo que deseja alterar");
        termo = new Termo (in.nextLine(),"");
        termin = termo.getTermo().toUpperCase();
        letra = termin.charAt(0);
        indice = new Dicionario (letra);
        dicionario.alterarDefinição(indice, termo);
        
    }
    public void ExibirTodos () {
        dicionario.exibirTodos();
    }
    public void ExibirIndice () {
        System.out.println("Informe o indice no qual procura os termos");
        termin = in.nextLine().toLowerCase();
        letra = termin.charAt(0);
        indice = new Dicionario(letra);
        dicionario.exibirPorIndice(indice);
    }

    
}
