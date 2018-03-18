package Structural.Adapter.IteratorAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class TestIteratorAdapter {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>(Arrays.asList("Hello","Uma","Turman"));
        Enumeration<?> enumm = new IteratorAdapter(l.iterator());
        while(enumm.hasMoreElements()){
            System.out.println(enumm.nextElement());
        }
    }
}
