public class Node<T> {
    
    // Armazena um valor generico
    private T entrada;
    // Armazena o nó que está ao seu lado ! (Um endereço de memória)
    private Node<T> next;

    public Node(){
        super();
    }

    public Node(T entrada){
        this.entrada = entrada;
    }

    public T getEntrada() {
        return entrada;
    }

    public void setEntrada(T entrada) {
        this.entrada = entrada;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    

}
