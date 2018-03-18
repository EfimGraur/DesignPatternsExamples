package Structural.Adapter.EnumAdapterTest;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationAdapterTest  {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>(Arrays.asList("Hello","John","Travolta"));
        Iterator<String> i = new EnumerationAdapter2(v.elements());

        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
