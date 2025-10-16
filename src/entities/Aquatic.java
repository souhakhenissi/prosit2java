package entities;


 non-sealed public abstract class Aquatic extends Animal{
    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }

     public abstract void swim();
        //System.out.println("This aquatic animal is swimming.");


    @Override
     public boolean equals(Object o) {
        if (this == o) return true;
        if (null == o) return false;
        if (o.getClass() == Aquatic.class){
            Aquatic aquatic=(Aquatic) o;
            return getAge() == aquatic.getAge() && getName().equals(aquatic.getName()) && habitat.equals(aquatic.habitat);
        }
        return false;
    }
 }
