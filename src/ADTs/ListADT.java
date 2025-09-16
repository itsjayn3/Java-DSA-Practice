package ADTs;

public interface ListADT<T> {
    //void add(T item);
  //  void add(int index, T item);
    T get(int index);
    void remove(T item);
    void set(int index, T item);
    int size();
    boolean isEmpty();
    boolean contains(T item);
    void print();
}
