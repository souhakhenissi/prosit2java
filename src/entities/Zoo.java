package entities;

public class Zoo {
    private Animal[] animals = new Animal[25];
    private String name;
    private String city;
    public static final int NBR_CAGES = 25;
    private Aquatic[] aquaticAnimals = new Aquatic[10];

    // instruction 6 , 1)
    public Zoo(String name,String city)/*,int nbrCages*/ {
        this.name = name;
        this.city = city;
        //this.nbrCages = nbrCages;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name==""){
            System.out.println("le nom d'un zoo ne doit pas être vide");
        }
        this.name = name;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    // instruction 8
    public void displayZoo(){
        System.out.println("entities.Zoo Name: "+name);
        System.out.println("entities.Zoo City: "+city);
        //System.out.println("Le nombre de cages est "+nbrCages);
    }

    public String toString(){
        return "entities.Zoo name: "+name+" city: "+city;//+" nbr cages: "+nbrCages;

    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            return false;
        } else {
            for(int i=0;i<animals.length;i++){
                if(animals[i]!=null && (animals[i]==animal)){
                    return false;
            }
        }
        for(int j=0;j<animals.length;j++){
            if(animals[j]==null){
                animals[j]=animal;
                return true;
            }
        }
        }
        return false;
    }

    public void afficheAnimal(){
        for(int i=0;i<animals.length;i++){
            if(animals[i]!=null){
                System.out.println(animals[i]);
            }
        }
    }

    public int searchAnimal(Animal animal){
        int trouve=-1;
        for(int i=0;i<animals.length;i++){
            if(animal==animals[i]){
                trouve=i;
                System.out.println(trouve);
            }
        }
        return trouve;
    }

    public boolean removeAnimal(Animal animal){
        for(int i=0;i<animals.length;i++){
            if(animal==animals[i]){
                animals[i]=null;
                System.out.println("l'animal d'indice "+i+" a été supprimé");
            }
        }
        return true;
    }

    public boolean isZooFull(){
        int nb =0;
        for(int i=0;i<animals.length;i++){
            if(animals[i]!=null){
                nb++;
            }
        }
        if(nb==NBR_CAGES){
            return true;
        }
        return false;
    }

    public Zoo comparerZoo(Zoo z1,Zoo z2){
        int c1=0;
        int c2=0;
        for(int i=0;i<z1.animals.length;i++){
            if(animals[i]!=null){
                c1++;
                }
            }
        for(int j=0;j<z2.animals.length;j++){
            if(animals[j]!=null){
                c2++;
            }
        }
        if(c1>c2){
            return z1;
        }
        return z2;
    }

    // prosit 6
    public void addAquaticAnimal(Aquatic aquatic) {
        for(int i=0;i<aquaticAnimals.length;i++){
            if(aquaticAnimals[i]==null){
                aquaticAnimals[i]=aquatic;
            }
        }
    }

    public void aquaticSwim() {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth(){
        float max = 0;
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] instanceof Pengouin) {
                Pengouin p = (Pengouin) aquaticAnimals[i];
                if (p.swimmingDepth > max) {
                    max = p.swimmingDepth;
                }
            }
        }
        return max;
    }

    public void displayNumberOfAquaticsByType(){
        int nbdolphin=0;
        int nbpengouin=0;
        for(int i=0;i<aquaticAnimals.length;i++){
            if(aquaticAnimals[i] instanceof Dolphin){
                nbdolphin++;
            }
            if(aquaticAnimals[i] instanceof Pengouin){
                nbpengouin++;
            }
        }
        System.out.println("NBDolphin "+nbdolphin);
        System.out.println("NBPengouin "+nbpengouin);

    }
}
