package Animal1;

import Animal1.Animal;

public class Dog extends Animal {
    public Dog(){
        super();
        setSound("Bark");

        //am setat interfata Flys polimorfical
        //seteaza comportamentul ca find un Animal care nu zboara
        flyingType = new CantFly();
    }

    public void digHole(){
        System.out.println("Dug a hole");
    }
}
