package interfacerectangletest;

import java.awt.Rectangle;
import java.util.ArrayList;

public class InterfaceRectangleTest {

    public static void main(String[] args) {

        ArrayList<Object> numbers = new ArrayList<>();
        Rectangle r = new Rectangle(8, 3);
        Filter f = new RectangleFilter();

        numbers.add(r);
        ArrayList<Object> result = CollectionHelper.collectAll(numbers, f);

        for (Object o : result) {
            System.out.println(o);
        }
    }
}
