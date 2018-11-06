
package encap;


public class Plane implements Seats{
    private int wheels;
    private int windows;
    private int engines;
    private int seating;

    public Plane(int seats) {
        this.seating = seats;
    }

    Plane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getWheels() {
        return wheels;
    }

    public int getWindows() {
        return windows;
    }

    public int getEngines() {
        return engines;
    }
    Plane(int wheels, int engines, int windows){
        this.engines = engines;
        this.wheels = wheels;
        this.windows = windows;
    }

    @Override
    public int getSeats() {
        return seating;
    }
}
