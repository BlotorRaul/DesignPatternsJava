package Plata2;

public class CalculCostTransport {
    private MetodaPlata metodaPlata;

    public CalculCostTransport(MetodaPlata metodaPlata)
    {
        this.metodaPlata = metodaPlata;
    }

    public void setMetodaPlata(MetodaPlata metodaPlata)
    {
        this.metodaPlata=metodaPlata;
    }

    public double calculeazaCost(double distanta)
    {
        return metodaPlata.calculeazaCostTransport(distanta);
    }
}
