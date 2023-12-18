import java.util.Collection;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Hash_Set<E> implements Set<E>{
    private final HashMap<E, Boolean> M;
    public Hash_Set(){
        M = new HashMap<>();
    }

    public boolean add(E element) {
        if(M.containsKey(element)){
            System.out.println("Duplicate input.");
            return false;
        }else{
            M.put(element, true);
            System.out.println(element + " is added");
            return true;
        }
    }

    @Override
    public boolean remove(Object element) {
        if(M.containsKey(element)){
            M.remove(element);
            System.out.println(element + " is removed.");
        }else{
            System.out.println("No element in this Set.");
        }

        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.M.keySet().containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean editted = false;
        for(E element : c){
            this.add(element);
        }
        editted = true;
        return editted;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.M.keySet().retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.M.keySet().removeAll(c);
    }

    @Override
    public boolean contains(Object element) {
        if(M.containsKey(element)){
            System.out.println(element + " is in Set.");
            return true;
        }else {
            System.out.println(element + " isn't in Set.");
            return false;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return this.M.keySet().iterator();
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

    public void printSet() {
        if(M.isEmpty()){
            System.out.println("Set is Empty.");
        }else{
            System.out.print("Set: ");
            System.out.println(M.keySet());
        }
        System.out.println();
    }

    @Override
    public int hashCode() {
        int hashCode = 0;
        for (E element : M.keySet()) {
            hashCode += (element == null ? 0 : element.hashCode());
        }
        return hashCode;
    }
    @Override
    public Object[] toArray() {
        return this.M.keySet().toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.M.keySet().toArray(a);
    }



}
