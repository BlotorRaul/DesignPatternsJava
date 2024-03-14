package Forme;

public class Main {
    public static void main(String[] args) {
        FabricaForme fabrica = new FabricaForme();

        // Crearea unui cerc
        Forma cerc = fabrica.creazaForma("Cerc");
        cerc.deseneaza();

        // Crearea unui dreptunghi
        Forma dreptunghi = fabrica.creazaForma("Dreptunghi");
        dreptunghi.deseneaza();
    }
}