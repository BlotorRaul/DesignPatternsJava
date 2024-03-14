package Animal1;

//prin aceasta interfata, nu afecteaza clasa Animal
//rezolva duplicate cod
//METODA DECOUPLING: separarea componentelor unui program pentru a reduce dependentele intre ele.
public interface Flys {
    String fly();
}

//folosim aceasta clasa daca Animal poate zbura
class ItFlys implements Flys{
    public String fly() {
        return "Flying High";
    }
}

//folosim aceasta clasa daca Animal nu poate zbura
class CantFly implements Flys{

    public String fly() {
        return "I can't fly";
    }
}
