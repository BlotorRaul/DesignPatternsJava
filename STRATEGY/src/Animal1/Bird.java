package Animal1;

import Animal1.Animal;

public class Bird extends Animal {
    public Bird(){
        super();
        setSound("Tweet");
        //am setat interfata Flys polimorfical
        //seteaza comportamentul ca find un Animal care zboara
        flyingType = new ItFlys();
    }
}
