import java.util.HashMap;
public class Hash_Set<E> implements Set<E>{
    private final HashMap<E, Boolean> M;

    public Hash_Set(){
        M = new HashMap<>();
    }
    @Override
    public void add(E element) {
        if(M.containsKey(element)){
            System.out.println("Duplicate input.");
        }else{
            M.put(element, true);
            System.out.println(element + " is added");
        }
    }

    @Override
    public void remove(E element) {
        if(M.containsKey(element)){
            M.remove(element);
            System.out.println(element + " is removed.");
        }else{
            System.out.println("No element in this Set.");
        }

    }

    @Override
    public boolean contains(E element) {
        if(M.containsKey(element)){
            System.out.println(element + " is in Set.");
            return true;
        }else {
            System.out.println(element + " isn't in Set.");
            return false;
        }
    }

    @Override
    public int size() {
        return M.size();
    }

    @Override
    public boolean isEmpty() {
        return M.isEmpty();
    }

    @Override
    public void clear() {
        M.clear();
        System.out.println("Set is cleared.");
    }

    @Override
    public void printSet() {
        if(M.isEmpty()){
            System.out.println("Set is Empty.");
        }else{
            System.out.print("Set: ");
            for(E element: M.keySet()){
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    @Override
    public boolean containsAll(Hash_Set<? extends E> elements) {
        for(E element: elements.M.keySet()){
            if(!this.contains(element)){
                return false;
            }
        }
        return true;
    }

    @Override
    public void addAll(Hash_Set<? extends E> elements) {
        for(E element: elements.M.keySet()){
            this.add(element);
        }
    }

    @Override
    public void removeAll(Hash_Set<? extends E> elements) {
        for(E element: elements.M.keySet()){
            this.remove(element);
        }
    }

    @Override
    public void retainAll(Hash_Set<? extends E> elements) {
        this.M.keySet().retainAll(elements.M.keySet());
    }

}
