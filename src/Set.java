public interface Set<E> {
    void add(E element);
    void remove(E element);
    boolean contains(E element);
    int size();
    boolean isEmpty();
    void clear();
    void printSet();
    boolean containsAll(Hash_Set<? extends E> elements);
    void addAll(Hash_Set<? extends E> elements);
    void removeAll(Hash_Set<? extends E> elements);
    void retainAll(Hash_Set<? extends E> elements);

}
