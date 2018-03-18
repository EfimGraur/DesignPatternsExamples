package Structural.Adapter.EnumAdapterTest;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter2 implements Iterator{

    Enumeration enumm;

    public EnumerationAdapter2(Enumeration enumm) {
        this.enumm = enumm;
    }

    @Override
    public boolean hasNext() {
        System.out.println("11111");
        return enumm.hasMoreElements();
    }

    @Override
    public Object next() {
        System.out.println("2222222");
        return enumm.nextElement();
    }

    @Override
    public void remove() {
            throw new UnsupportedOperationException();
    }
}
