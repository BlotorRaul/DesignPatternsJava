package biblioteca;

import java.util.ArrayList;
import java.util.List;

// Clasa Concretă Shelf reprezintă un raft care poate conține cărți sau alte rafturi
class Shelf implements Component {
    private List<Component> components = new ArrayList<>();

    public void adaugaComponent(Component component) {
        components.add(component);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Raft:");
        for (Component component : components) {
            component.afisareDetalii();
        }
    }
}