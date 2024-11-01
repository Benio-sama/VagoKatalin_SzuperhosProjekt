package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos {
    public Vasember() {
        super(150, true);
    }

    @Override
    public boolean megmentiAVilagot() {
        if (getSzuperero() > 1000) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void kutyutKeszit() {
        Random random = new Random();
        setSzuperero(getSzuperero() + random.nextDouble(0,10));
    }

    @Override
    public String toString() {
        return "Vasember: " + super.toString();
    }
}
