public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;

    // instruction 6 , 1)
    public Zoo(String name,String city,int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    // instruction 8
    public void displayZoo(){
        System.out.println("Zoo Name: "+name);
        System.out.println("Zoo City: "+city);
        System.out.println("Le nombre de cages est "+nbrCages);
    }

    public String toString(){
        return "Zoo name: "+name+" city: "+city+" nbr cages: "+nbrCages;

    }

}
