public interface Lista <T> {
    
    int size();

    T get(int index);

    void add(T element);

    boolean remove(T element);

    boolean contains(T element);

    int indexOf(T element);

    void clear();



}
