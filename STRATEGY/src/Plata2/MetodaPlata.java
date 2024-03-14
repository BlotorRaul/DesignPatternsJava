package Plata2;

public interface MetodaPlata {
    double calculeazaCostTransport(double distanta);
}

class PlataCard implements MetodaPlata {
    public double calculeazaCostTransport(double distanta) {
        return distanta * 0.1;
    }
}

class PlataCash implements MetodaPlata{
    public double calculeazaCostTransport(double distanta) {
        return distanta * 0.8;
    }
}
