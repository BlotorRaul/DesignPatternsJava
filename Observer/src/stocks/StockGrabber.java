package stocks;

import java.util.ArrayList;

// Uses the stocks.Subject interface to update all Observers

public class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){

        // Creates an ArrayList to hold all observers

        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver) {

        // Adds a new observer to the ArrayList

        observers.add(newObserver);

    }

    public void unregister(Observer deleteObserver) {

        // Get the index of the observer to delete

        int observerIndex = observers.indexOf(deleteObserver);

        // Print out message (Have to increment index to match)

        System.out.println("stocks.Observer " + (observerIndex+1) + " deleted");

        // Removes observer from the ArrayList

        observers.remove(observerIndex);

    }

    public void notifyObserver() {

        // Cycle through all observers and notifies them of
        // price changes

        //aici,in subject, doar notificam ca apare ceva, iare implementarea  se face in observer

        for(Observer observer : observers){
            //definim ce sa se apeleze , ce sa se implementeze in observer(in fiecare din ele)

            observer.update(ibmPrice, aaplPrice, googPrice);
            //pot fi alte functii din observer

        }
    }

    // Change prices for all stocks and notifies observers of changes

    public void setIBMPrice(double newIBMPrice){

        this.ibmPrice = newIBMPrice;

        notifyObserver();

    }

    public void setAAPLPrice(double newAAPLPrice){

        this.aaplPrice = newAAPLPrice;

        notifyObserver();

    }

    public void setGOOGPrice(double newGOOGPrice){

        this.googPrice = newGOOGPrice;

        notifyObserver();

    }

}