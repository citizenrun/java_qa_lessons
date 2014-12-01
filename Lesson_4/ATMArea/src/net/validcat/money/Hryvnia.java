package net.validcat.money;

public class Hryvnia extends Money {
    int par[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500 }; // номиналы гривны

   public  Hryvnia(int val) {
        super(val);
    }

    public int[] getPar() {
        return par;
    }
    
    public String toString() {
        return "”краинска€ гривн€ номинал " + getValue();
    }
}