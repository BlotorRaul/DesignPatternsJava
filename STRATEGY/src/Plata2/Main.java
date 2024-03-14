package Plata2;

public class Main {
    public static void main(String[] args) {
        double distance = 100;

        CalculCostTransport calculCard = new CalculCostTransport(new PlataCard());
        double costCard = calculCard.calculeazaCost(distance);
        System.out.println("Costul transportului pentru plata cu cardul: "+ costCard +" lei.");

        calculCard.setMetodaPlata(new PlataCash());
        System.out.println("Costul transportului pentru plata cash: "+ calculCard.calculeazaCost(distance) +" lei.");
    }
}
