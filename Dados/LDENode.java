package Dados;
class LDENode <T extends Comparable <T>>{
    private LDENode<T> ant;
    private T info;
    private LDENode<T> prox;
    
    LDENode (T obj) {
        this.info = obj;
    }    
    void setInfo (T obj){
        this.info = obj;
    }    
    T getInfo () {
        return this.info;
    }
    void setProx (LDENode<T> prox){
        this.prox = prox;
    }    
    LDENode<T> getProx () {
        return this.prox;
    }    
    void setAnt (LDENode<T> ant){
        this.ant = ant;
    }    
    LDENode<T> getAnt () {
        return this.ant;
    }    
}