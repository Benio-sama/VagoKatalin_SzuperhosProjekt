package hu.petrik.szuperhosprojekt;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }

    @Override
    public boolean legyoziE(Szuperhos sz) {
        if (sz instanceof Bosszuallo) {
            Bosszuallo masik = (Bosszuallo) sz;
            if (masik.vanEGyengesege && this.szuperero > masik.szuperero) {
                return true;
            }
            return false;
        } else if (sz instanceof Batman) {
            if (this.szuperero >= sz.mekkoraAzEreje() * 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        String seged;
        if (vanEGyengesege) {
            seged = "van gyengesége";
        } else {
            seged = "nincs gyengesége";
        }
        return "Szupererő: " + String.format("%.0f", getSzuperero()) + "; " + seged;
    }
}
