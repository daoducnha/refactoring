package chap_8.self_encapsulate_field;

public class IntRange {
    private int low;
    private int high;

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    boolean include(int arg) {
        return arg > getLow() && arg < getHigh();
    }

    void grow(int factor) {
        setHigh(getHigh() * factor);
    }

    IntRange(int low, int high) {
        initialize(low, high);
    }

    private void initialize(int low, int high) {
        this.low = low;
        this.high = high;
    }
}

class CappedRange extends IntRange {
    private int cap;

    CappedRange(int low, int high, int cap) {
        super(low, high);
        this.cap = cap;
    }

    public int getCap() {
        return cap;
    }

    @Override
    public int getHigh() {
        return Math.min(super.getHigh(), getCap());
    }
}