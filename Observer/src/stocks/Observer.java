package stocks;// The Observers update method is called when the stocks.Subject changes

public interface Observer {

    public void update(double ibmPrice, double aaplPrice, double googPrice);

}