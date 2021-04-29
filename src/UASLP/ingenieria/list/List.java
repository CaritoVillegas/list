package UASLP.ingenieria.list;

public interface List<T> {
    void add(T data);
    T get(int index);
    void delate(int index);

    int getSize();

    Iterator<T> getIterator();

    //void insert(T data, Position position, Iterator<T> it);
    Iterator<T>  getReverseIterator();

}
