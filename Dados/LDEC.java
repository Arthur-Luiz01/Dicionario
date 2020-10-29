package Dados;
import Diciona.*;
public class LDEC <T extends Comparable <T>>{
    private LDENode<T> inicio;
    private LDENode<T> fim;
    private int qtd;

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
    public void inserir (T indice, Termo termo) {
        LDENode<Termo> novo = new LDENode<Termo> (termo);
        LDENode<T> aux,procurar;
        if (isEmpty()) {
            LDENode<T> novoIndice = new LDENode<T>(indice);
            System.out.println("Vazio, inseriu");
            this.inicio = novoIndice;
            this.fim = novoIndice;
            this.qtd = 1;
            this.inicio.setAnt(this.fim);
            this.fim.setProx(this.inicio);
            LDEC<Termo> termosAtuais = ((Dicionario)novoIndice.getInfo()).getTermos();
            termosAtuais.inserirTermo((Termo)termo);
        } else {
            System.out.println("Fazendo busca");
            procurar = this.buscaSimples(indice);
            System.out.println("busca completa");
            if(procurar != null) {
                LDEC<Termo> termosAtuais = ((Dicionario)procurar.getInfo()).getTermos();
                 termosAtuais.inserirTermo((Termo)termo);
             } else {
                LDENode<T> novoIndice = new LDENode<T>(indice);
                if (indice.compareTo(this.inicio.getInfo()) < 0) {
                    System.out.println("Primeiro if");
                    novoIndice.setProx(this.inicio);
                    this.inicio.setAnt(novoIndice);
                    this.inicio = novoIndice;
                    this.fim.setProx(this.inicio);
                    this.qtd++;
                 } else {
                aux = this.inicio;
                while (aux != null) {
                    if (indice.compareTo(aux.getInfo()) < 0) {
                        System.out.println("outra coisa");
                        novoIndice.setProx(aux);
                        novoIndice.setAnt(aux.getAnt());
                        aux.getAnt().setProx(novoIndice);
                        aux.setAnt(novoIndice);
                        aux = novoIndice;
                        this.qtd++;
                        break;
                     }
  
                    if (aux == this.fim) {
                        System.out.println("Esse é o if de baixo");
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
            System.out.println("Vazio, inseriu");
            this.inicio = novo;
            this.fim = novo;
            this.qtd = 1;
            this.inicio.setAnt(this.fim);
            this.fim.setProx(this.inicio);
        } else {
            System.out.println("Fazendo busca");
            procurar = this.buscaSimples(obj);
            System.out.println("busca completa");
            if(procurar != null) {
                System.out.println("Objeto Repetido!");
            } else {
                if (obj.compareTo(this.inicio.getInfo()) < 0) {
                    System.out.println("Primeiro if");
                    novo.setProx(this.inicio);
                    this.inicio.setAnt(novo);
                    this.inicio = novo;
                    this.fim.setProx(this.inicio);
                    this.qtd++;
                 } else {
                aux = this.inicio;
                while (aux != null) {
                    if (obj.compareTo(aux.getInfo()) < 0) {
                        System.out.println("outra coisa");
                        novo.setProx(aux);
                        novo.setAnt(aux.getAnt());
                        aux.getAnt().setProx(novo);
                        aux.setAnt(novo);
                        aux = novo;
                        this.qtd++;
                        break;
                     }
  
                    if (aux == this.fim) {
                        System.out.println("Esse é o if de baixo");
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
}
