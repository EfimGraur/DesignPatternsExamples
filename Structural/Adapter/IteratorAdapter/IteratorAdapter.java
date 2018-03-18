package Structural.Adapter.IteratorAdapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter implements Enumeration {
    Iterator iterator;

    public IteratorAdapter(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        System.out.println("Delegate hasMoreElements to iterator.hasNext()");
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        System.out.println("calling interator next()");
        return iterator.next();
    }
}
