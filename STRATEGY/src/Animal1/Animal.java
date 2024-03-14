package Animal1;

public class Animal {
    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;

    //AICI SE FACE STRATEGY DESIGN PATTERN

    //folosim interfata pe post de variabila:
    //variabila va fi o subclasa a interfetei Flys

    //Animal nu ii pasa daca zboara sau nu, stie doar ca face una din ele
    //iar acel comportament se gasesc in subclasele interfetei

    //Se face COMPOZITIE: in loc sa facem mostenire de clase
    //atribuim in clasa Animal alte clase--> de tip has a

    public Flys flyingType;

    //Animal trimite mai departe responsabilitatea de a zbura, catre flyingType
    public String tryToFly(){
        return flyingType.fly();
    }

    //pentru a schimba dinamic tipul de zbor al animalului
    public void setFlyingType(Flys flyingType) {
        this.flyingType = flyingType;
    }

    public void setName(String newName){ name = newName; }
    public String getName(){ return name; }

    public void setHeight(double newHeight){ height = newHeight; }
    public double getHeight(){ return height; }

    public void setWeight(int newWeight){
        if (newWeight > 0){
            weight = newWeight;
        } else {
            System.out.println("Weight must be bigger than 0");
        }
    }
    public double getWeight(){ return weight; }

    public void setFavFood(String newFavFood){ favFood = newFavFood; }
    public String getFavFood(){ return favFood; }

    public void setSpeed(double newSpeed){ speed = newSpeed; }
    public double getSpeed(){ return speed; }

    public void setSound(String newSound){ sound = newSound; }
    public String getSound(){ return sound; }

}
