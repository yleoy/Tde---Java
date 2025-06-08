public class Arvore {

    private Elemento ele; // chave
    private Arvore dir;
    private Arvore esq;
    private int bal; // Balanceamento

    public Arvore() {
        this.ele = null;
        this.esq = null;
        this.dir = null;
        this.bal = 0;
    }

    public Arvore(Elemento elem) {
        this.ele = elem;
        this.dir = null;
        this.esq = null;
        this.bal = 0;
    }

    public Arvore remover(Elemento elem) {
        if (this.ele.getValor() == elem.getValor()) {
            if (this.dir == null && this.esq == null) {
                return null;
            } else {
                if (this.esq != null && this.dir == null) {
                    return this.esq;
                } else if (this.dir != null && this.esq == null) {
                    return this.dir;
                } else {
                    Arvore aux = this.esq;
                    while (aux.dir != null){
                        aux = aux.dir;
                    }
                    this.ele = aux.getElemento();
                    aux.setElemento(elem);
                    this.esq = esq.remover(elem);
                }
            }
        }
        else if (elem.getValor() < this.ele.getValor()){
            this.dir = this.dir.remover(elem);
        }
        return this;
    }

    public boolean isEmpty(){
        return (this.ele == null);
    }

    public void ImprimirPreOrdem(){
        if(!isEmpty()){
            System.out.println(this.ele.getValor() + "");
            if(this.esq != null){
                this.esq.ImprimirPreOrdem();
            }
            if (this.dir != null){
                this.dir.ImprimirPreOrdem();
            }
        }
    }

    public void imprimirInOrdem(){
        if(!isEmpty()){
            if(this.esq != null){
                this.esq.imprimirInOrdem();
            }
            System.out.println(this.ele.getValor() + " ");
            if (this.dir != null){
                this.dir.imprimirInOrdem();
            }
        }
    }
    public void ImprimirPosOrdem(){
        if (!isEmpty()){
            if(this.dir != null){
                this.dir.ImprimirPosOrdem();
            }
            if (this.esq != null){
                this.esq.ImprimirPosOrdem();
            }
            System.out.println(this.ele.getValor() + " ");
        }
    }

    public Arvore inserir (Elemento novo){
        if(isEmpty()){
            this.ele = novo;
        } else{
            Arvore novaArvore = new Arvore(novo);
            if(novo.getValor() < this.ele.getValor()){
                if(this.esq == null){
                    this.esq = novaArvore;
                }else{
                    this.esq = this.esq.inserir(novo);
                }
            } 
            else if(novo.getValor() > this.ele.getValor()){
                if(this.dir == null){
                    this.dir = novaArvore;
                } else{
                    this.dir = this.dir.inserir(novo);
                }
            }
        }
        return this;
    }

    public int calcularAltura(){`
    }
}
