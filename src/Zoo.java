public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    public static final int NBR_CAGES = 25;

    // instruction 6 , 1)
    public Zoo(String name,String city)/*,int nbrCages*/ {
        this.name = name;
        this.city = city;
        //this.nbrCages = nbrCages;
    }

    // instruction 8
    public void displayZoo(){
        System.out.println("Zoo Name: "+name);
        System.out.println("Zoo City: "+city);
        //System.out.println("Le nombre de cages est "+nbrCages);
    }

    public String toString(){
        return "Zoo name: "+name+" city: "+city;//+" nbr cages: "+nbrCages;

    }

    public boolean addAnimal(Animal animal){
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
}
