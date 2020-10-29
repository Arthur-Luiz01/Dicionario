package Diciona;
import Dados.*;
public class Dicionario implements Comparable <Dicionario> {
    private char indice;
    LDEC<Termo> termos = new LDEC<Termo>();
    public Dicionario(char indice){
        this.indice = indice;
    }
    public char getIndice(){
        return this.indice;
    }
    public LDEC<Termo> getTermos() {
        return this.termos;
    }
    public String toString () {
        return this.indice + ": \n" + this.termos.exibirTodos();
    }
    @Override
     public int compareTo(Dicionario i){
        if (this.indice == i.getIndice()) {
            return 0;
        } else if (this.indice > i.getIndice()){
            return 1;
        } else return -1;
    }
}
