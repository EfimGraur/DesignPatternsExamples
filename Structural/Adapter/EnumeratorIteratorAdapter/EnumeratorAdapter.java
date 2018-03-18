package Structural.Adapter.EnumeratorIteratorAdapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumeratorAdapter implements Iterator {

    Enumeration enumm;

    public EnumeratorAdapter(Enumeration enumm) {
        this.enumm = enumm;
    }

    @Override
    public boolean hasNext() {
        System.out.println("I am delegationg this request to Enumerator");
        return enumm.hasMoreElements();
    }

    @Override
    public Object next() {
        System.out.println("222");
        return enumm.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
