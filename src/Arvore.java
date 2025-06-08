public class Arvore {

    private Elemento ele; // chave
    private Arvore dir;
    private Arvore esq;
    private int bal; //Balanceamento

    public Arvore(){
        this.ele = null;
        this.esq = null;
        this.dir = null;
        this.bal = 0;
    }


}