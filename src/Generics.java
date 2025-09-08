public class Generics<T> {
    
    private T element;

    public Generics(){
        super();
    }

    public Generics(T element){
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element){
        this.element = element;
    }
}
