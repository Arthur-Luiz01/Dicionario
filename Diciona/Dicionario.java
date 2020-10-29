package Diciona;
public class Dicionario implements Comparable <Dicionario> {
    private String termo;
    private String definicao;

    public Dicionario (String termo) {
        this.termo = termo;
    }
    public void setTermo (String termo) {
        this.termo = termo;
    }
    public String getTermo () {
        return this.termo;
    }
    public void setDefinicao (String definicao) {
        this.definicao = definicao;
    }
    public String getDefinicao () {
        return this.definicao;
    }
    public String toString() {
        return "Termo: " + this.termo + "\n Definicao: " + this.definicao;
    }
    @Override
     public int compareTo(Dicionario d){
         return this.termo.compareTo(d.getTermo());
     }
}
