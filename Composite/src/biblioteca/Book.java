package biblioteca;

// Clasa Concretă Book reprezintă obiectele individuale (cărțile)
class Book implements Component {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Carte: " + title);
    }
}