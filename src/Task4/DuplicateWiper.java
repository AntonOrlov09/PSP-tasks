package Task4;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class DuplicateWiper<T> {
    public void removeDuplicate(Collection<T> collection) {
        Set<T> set = new HashSet<>(collection);
        collection.clear();
        collection.addAll(set);
    }
}
