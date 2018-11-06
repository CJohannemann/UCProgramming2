package interfaces;

public class ShortWordFilter implements Filter{

    @Override
    public boolean accept(Object x) {
        String s = x.toString();
        return s.length() < 5;
    }
}
