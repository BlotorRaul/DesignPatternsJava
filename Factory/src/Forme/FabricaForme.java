package Forme;

// Factory-ul
class FabricaForme {
    public Forma creazaForma(String tipForma) {
        if (tipForma.equalsIgnoreCase("Cerc")) {
            return new Cerc();
        } else if (tipForma.equalsIgnoreCase("Dreptunghi")) {
            return new Dreptunghi();
        }
        return null;
    }
}