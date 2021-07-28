package mapSort;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator<Integer> {

    Map<Integer, TestObject> base;
    public ValueComparator(Map<Integer, TestObject> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with equals.
    public int compare(Integer a, Integer b) {
        return (base.get(a).getPosition()).compareTo(base.get(b).getPosition());
    }

}
