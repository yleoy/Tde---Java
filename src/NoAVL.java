public class NoAVL<T extends Comparable<T>> {
    T dado;
    NoAVL<T> esquerdo;
    NoAVL<T> direito;
    int altura;

    public NoAVL(T dado) {
        this.dado = dado;
        this.altura = 1; // altura inicial é 1 quando o nó é criado
    }

    // Getters e Setters (opcional)
    public T getDado() {
        return dado;
    }

    public NoAVL<T> getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(NoAVL<T> esquerdo) {
        this.esquerdo = esquerdo;
    }

    public NoAVL<T> getDireito() {
        return direito;
    }

    public void setDireito(NoAVL<T> direito) {
        this.direito = direito;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
