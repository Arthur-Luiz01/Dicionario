package Dados;
import Diciona.*;
import java.util.*;
public class LDEC <T extends Comparable <T>>{
    private LDENode<T> inicio;
    private LDENode<T> fim;
    private int qtd;
    Scanner in = new Scanner (System.in);
    public boolean isEmpty () {
        if (this.inicio == null) {
            return true;
        }
        else {
            return false;
        }
    }
    public LDENode<T> buscaSimples(T obj) { 
        LDENode<T> aux = this.inicio;
        while (aux != null) {
            if (aux.getInfo().compareTo(obj) == 0) {
                return aux;
            }if (aux == this.fim) {
                break;
            }
            aux = aux.getProx();
        }
        return null;
    }     
    public String exibirTodos () {
        LDENode<T> aux;
        aux = this.inicio;
        String soma = "";
        for (int i = 0; i != this.qtd; i++) {
            soma += aux.getInfo() + " \n";
            aux = aux.getProx();
        }
        return soma;
    }
    public void Definicao(T termo) {
        LDENode <T> aux;
        aux = buscaSimples(termo);
        if (aux == null) {
            System.out.println("Objeto não encontrado");
        }
        else System.out.println(aux.getInfo());
    }
    public T buscaObjeto(T obj) {
        LDENode<T> aux = this.inicio;
        while (aux != null) {
            if (aux.getInfo().compareTo(obj) == 0) {
                return aux.getInfo();
            }
            aux = aux.getProx();
        }
        return null;
    }
    public boolean removerr (Termo obj) {
        if (this.inicio == null) {
            return false;
        }
        if (this.inicio.getInfo().equals(obj)){
            this.inicio = this.inicio.getProx();
            if(this.inicio != null){
                this.inicio.setAnt(null);
            }
            return true;
        }
        LDENode<T> aux = this.inicio;
        while(aux != null && !aux.getInfo().equals(obj)){
            aux = aux.getProx();
        }
        if (aux == null) return false;
        aux.setAnt(aux.getProx());
        if(aux.getProx() != null) {
            aux.setProx(aux.getAnt());
        }
        qtd--;
        return true;
    }
    public void inserir (T indice, Termo termo) {
        LDENode<T> aux,procurar;
        if (isEmpty()) {
            LDENode<T> novoIndice = new LDENode<T>(indice);
            this.inicio = novoIndice;
            this.fim = novoIndice;
            this.qtd = 1;
            this.inicio.setAnt(this.fim);
            this.fim.setProx(this.inicio);
            LDEC<Termo> termosAtuais = ((Dicionario)novoIndice.getInfo()).getTermos();
            termosAtuais.inserirTermo((Termo)termo);
        } else {
            procurar = this.buscaSimples(indice);
            if(procurar != null) {
                LDEC<Termo> termosAtuais = ((Dicionario)procurar.getInfo()).getTermos();
                 termosAtuais.inserirTermo((Termo)termo);
             } else {
                LDENode<T> novoIndice = new LDENode<T>(indice);
                if (indice.compareTo(this.inicio.getInfo()) < 0) {
                    novoIndice.setProx(this.inicio);
                    this.inicio.setAnt(novoIndice);
                    this.inicio = novoIndice;
                    this.fim.setProx(this.inicio);
                    this.qtd++;
                 } else {
                aux = this.inicio;
                while (aux != null) {
                    if (indice.compareTo(aux.getInfo()) < 0) {
                        novoIndice.setProx(aux);
                        novoIndice.setAnt(aux.getAnt());
                        aux.getAnt().setProx(novoIndice);
                        aux.setAnt(novoIndice);
                        aux = novoIndice;
                        this.qtd++;
                        break;
                     }
  
                    if (aux == this.fim) {
                        novoIndice.setAnt(this.fim);
                        this.fim.setProx(novoIndice);
                        this.fim = novoIndice;
                        this.qtd++;
                        break;
                    }
                    aux = aux.getProx();
                }
                }
                LDEC<Termo> termosAtuais = ((Dicionario)novoIndice.getInfo()).getTermos();
                termosAtuais.inserirTermo((Termo)termo);
            }
         }
    }
    public void inserirTermo (T obj) {
        LDENode<T> novo = new LDENode<T> (obj);
        LDENode<T> aux,procurar;
        if (isEmpty()) {
            this.inicio = novo;
            this.fim = novo;
            this.qtd = 1;
            this.inicio.setAnt(this.fim);
            this.fim.setProx(this.inicio);
        } else {
            procurar = this.buscaSimples(obj);
            if(procurar != null) {
                System.out.println("Objeto Repetido!");
            } else {
                if (obj.compareTo(this.inicio.getInfo()) < 0) {
                    novo.setProx(this.inicio);
                    this.inicio.setAnt(novo);
                    this.inicio = novo;
                    this.fim.setProx(this.inicio);
                    this.qtd++;
                 } else {
                aux = this.inicio;
                while (aux != null) {
                    if (obj.compareTo(aux.getInfo()) < 0) {
                        novo.setProx(aux);
                        novo.setAnt(aux.getAnt());
                        aux.getAnt().setProx(novo);
                        aux.setAnt(novo);
                        aux = novo;
                        this.qtd++;
                        break;
                     }
  
                    if (aux == this.fim) {
                        novo.setAnt(this.fim);
                        this.fim.setProx(novo);
                        this.fim = novo;
                        this.qtd++;
                        break;
                    }
                    aux = aux.getProx();
                }
                }
            }
        }
    }
    public void remover(T indice, Termo termo) {
        LDENode<T> novoIndice, procurar, aux;
        novoIndice = this.buscaSimples(indice);
        procurar = this.buscaSimples(indice);
        if(isEmpty() == true) {
            System.out.println("Não existe Indice para esse termo");
        } else if (procurar != null) {
            LDEC<Termo> termosAtuais = ((Dicionario)procurar.getInfo()).getTermos();
            termosAtuais.buscaSimples(termo);
            aux = this.inicio;
            while(aux != null) {
                if (indice.compareTo(aux.getInfo()) == 0){
                    System.out.println("Esse " +aux.getInfo());
                }
                aux = aux.getProx();
            }
        }
    }
    public void exibirPorIndice (T indice) {
        LDENode<T> procurar;
        procurar = this.buscaSimples(indice);
        if (procurar == null) {
            System.out.println("Não existe Indice com essa letra");
        } else if(procurar != null) {
            LDEC<Termo> termosAtuais = ((Dicionario)procurar.getInfo()).getTermos();
            System.out.println("Termos com esse indice:\n" +termosAtuais.exibirTodos());
        }
    }
    public void exibirDefinição (T indice, Termo termo) {
        LDENode<T> procurar;
        procurar = this.buscaSimples(indice);
        if (procurar == null) {
            System.out.println("Não existe esse termo");
        } else if (procurar != null) {
            LDEC<Termo> termosAtuais = ((Dicionario)procurar.getInfo()).getTermos();
            termosAtuais.Definicao(termo);
        }
    }
    public void alterarDefinição (T indice, Termo termo) {
        LDENode<T> procurar;
        procurar = this.buscaSimples(indice);
        if(procurar == null){
            System.out.println("Não existe esse termo");
        } else if (procurar != null) {
            LDEC<Termo> termosAtuais = ((Dicionario)procurar.getInfo()).getTermos();
            System.out.println("Informe a nova descrição");
            String aux = in.nextLine();
            termo.setDefinicao(aux);
            termosAtuais.Definicao(termo);
        }
    }
}

