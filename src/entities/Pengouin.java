package entities;

public class Pengouin extends Aquatic{
    protected float swimmingDepth;

    public Pengouin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal,habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth: " + swimmingDepth + " meters";
    }

    //prosit 6
    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}
