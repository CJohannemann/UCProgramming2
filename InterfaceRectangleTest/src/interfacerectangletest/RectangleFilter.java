
package interfacerectangletest;

import java.awt.Rectangle;


public class RectangleFilter implements Filter{

    @Override
    public boolean accept(Object x) {
        Rectangle r = (Rectangle) x;
        return r.height * 2 + r.width > 10;
    }
}
