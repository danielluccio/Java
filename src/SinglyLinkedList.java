public class SinglyLinkedList <T> implements Lista<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size;
    @Override
    public void add(T element) {
        Node<T> auxNode = new Node<>(element);

        if (head == null){
            head = tail = auxNode;
        }
        else{
            head.setNext(auxNode);
            tail = auxNode;
        }
        
    }
    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public boolean contains(T element) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public T get(int index) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public int indexOf(T element) {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public boolean remove(T element) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }


    
}