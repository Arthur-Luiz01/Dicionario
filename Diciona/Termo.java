package Diciona;
public class Termo implements Comparable <Termo> {
    private String termo;
    private String definicao;

    public Termo (String termo) {
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
     public int compareTo(Termo d){
         return this.termo.compareTo(d.getTermo());
     }
}
