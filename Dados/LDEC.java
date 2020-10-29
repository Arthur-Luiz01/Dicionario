package Dados;
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
            if (aux.getInfo().equals(obj) == true) {
                return aux;
            }if (aux == this.fim) {
                break;
            }
            aux = aux.getProx();
        }
        return null;
    }     
    public void exibirTodos () {
        LDENode<T> aux;
        aux = this.inicio;
        for (int i = 0; i != this.qtd; i++) {
            System.out.println(aux.getInfo() + " ");
            aux = aux.getProx();
        }
    }
    public void inserir (T obj) {
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
