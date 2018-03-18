package Structural.Adapter.EnumeratorIteratorAdapter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumeratorAdapterTest {
    public static void main(String[] args) {

        Vector<String> v = new Vector<String>(Arrays.asList("Hello","John","Travolta"));
        Iterator<?> iterator = new EnumeratorAdapter(v.elements());

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
