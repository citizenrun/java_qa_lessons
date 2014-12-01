package net.validcat.money;

public class ZimbabveHryvnia extends Money {
    int parZimbabve[] = { 1, 2, 3, 5, 10, 100, 500, 1000, 5000 };
    
    ZimbabveHryvnia(int val) {
        super(val);
    }

    int[] getPar() {
        return parZimbabve;
    }
    
    public String toString() {
        return "Зимбабвийская гривня номинал " + getValue();
    }

}