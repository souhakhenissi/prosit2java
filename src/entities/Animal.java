package entities;

sealed public class Animal permits Aquatic,Terrestrial{
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // instruction 6 , 1)
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("L'animal ne peut pas avoir un age négatif ");
        }
        this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }
    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public String toString(){
        return "entities.Animal family: "+family+" name: "+name+" age: "+age+" isMammal: "+isMammal;
    }
}
