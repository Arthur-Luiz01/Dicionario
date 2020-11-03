import Diciona.Dicionario;
import Diciona.Termo;
import Dados.*;
import CadastroDicionario.CadastroDicionario;
import java.util.*;

public class Executar {
    public static void main(String[] args) {
        LDEC<Dicionario> listinha = new LDEC<Dicionario>();
        Termo termo = new Termo("Batata", "");
        String termin = termo.getTermo().toLowerCase();
        char letra = termin.charAt(0);
        Dicionario indice = new Dicionario(letra);
        listinha.inserir(indice, termo);
        termo = new Termo("Carro","");
        termin = termo.getTermo().toLowerCase();
        letra = termin.charAt(0);
        indice = new Dicionario(letra);
        listinha.inserir(indice, termo);
        termo = new Termo("Matheus","");
        termin = termo.getTermo().toLowerCase();
        letra = termin.charAt(0);
        indice = new Dicionario(letra);
        listinha.inserir(indice, termo);
        termo = new Termo("Canoa","");
        termin = termo.getTermo().toLowerCase();
        letra = termin.charAt(0);
        indice = new Dicionario(letra);
        listinha.inserir(indice, termo);
        System.out.println(listinha.exibirTodos());
        listinha.alterarDefinição(indice, termo);
        System.out.println("Exibindo com alteração"+listinha.exibirTodos());

        // Scanner in = new Scanner (System.in);
        // CadastroDicionario dicionario = new CadastroDicionario();
        // int op;
        // do {
        //     menu();
        //     System.out.println("Informe a opção: ");
        //     op = in.nextInt(); in.nextLine();
        //     switch (op) {
        //         case 1: dicionario.Cadastrar();
        //                 break;
        //         case 2: dicionario.Remover();
        //                 break;
        //         case 3: dicionario.Editar();
        //                 break;
        //         case 4: dicionario.ExibirTodos();
        //                 break;
        //         case 5: dicionario.ExibirIndice();
        //                 break;
        //         default: System.out.println("Opção inválida!");
        //     }
        // } while (op != 0);   
    }
    public static void menu () {
        System.out.println("1 - Cadastrar novo termo no dicionario");
        System.out.println("2 - Remover termo do dicionario");
        System.out.println("3 - Editar termo do dicionario");
        System.out.println("4 - Exibir todos os termos do dicionario");
        System.out.println("5 - Exibir todos os termos de um determinado indice do dicionario");
        System.out.println("0 - Sair do programa");
    }
    
}
