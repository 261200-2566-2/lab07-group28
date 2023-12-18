import java.util.Iterator;

public class Lab07 {
    public static void main(String[] args) {
        Hash_Set<Integer> H = new Hash_Set<>();
        Hash_Set<Integer> h = new Hash_Set<>();
        // add, print
        H.add(1);
        H.add(2);
        H.add(3);
        H.add(3); // Duplicate add in Set.
        H.printSet();

        h.add(4);
        h.add(5);
        h.add(6);
        h.printSet();

//        // isEmpty, size
//        System.out.println("Empty: " + H.isEmpty() + "\nSize: " + H.size()); // H Set
//        System.out.println("Empty: " + h.isEmpty() + "\nSize: " + h.size()); // h Set
//
//        // containAll
//        System.out.println("H is contain all of h: " + H.containsAll(h));
//        System.out.println("h is contain all of H: " + h.containsAll(H));

        // addAll
        H.addAll(h);
        System.out.println("H is contain all of h: " + H.containsAll(h));
        H.printSet();

        // removeAll
        H.removeAll(h);
        System.out.println("H is contain all of h: " + H.containsAll(h));
        H.printSet();

        // retainAll
        H.addAll(h);
        H.printSet();
        H.retainAll(h);
        H.printSet();

        //clear
        H.clear();
        H.printSet();
    }
}