package biblioteca;

public class Main {
    public static void main(String[] args) {
        // Construim ierarhia bibliotecii
        Shelf biblioteca = new Shelf();
        Shelf raftAventura = new Shelf();
        Shelf raftFantasy = new Shelf();

        biblioteca.adaugaComponent(new Book("Harry Potter"));
        biblioteca.adaugaComponent(new Book("Game of Thrones"));

        raftAventura.adaugaComponent(new Book("Robinson Crusoe"));
        raftAventura.adaugaComponent(new Book("Journey to the Center of the Earth"));

        raftFantasy.adaugaComponent(new Book("The Hobbit"));
        raftFantasy.adaugaComponent(new Book("The Lord of the Rings"));

        biblioteca.adaugaComponent(raftAventura);
        biblioteca.adaugaComponent(raftFantasy);

        // Afisam detaliile bibliotecii
        biblioteca.afisareDetalii();
    }
}