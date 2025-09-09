public class Node <T> {

    // Valor Recebido dentro do nó
    private T value;

    // Ponteiro que irá apontar para o proximo nó
    private Node<T> next;

    public Node(){}

    public Node(T value){
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    
}
