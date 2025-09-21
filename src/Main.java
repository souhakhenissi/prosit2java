//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Lions","un lion",5,true);
        Zoo myZoo = new Zoo("myZoo","Tunis",10);
        Animal Tiger = new Animal("Tigers","un tiger",5,true);
        Animal panda = new Animal("Pandas","un panda",4,true);
        Animal bear= new Animal("Bears","un bear",3,true);
        //myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(panda);
        //System.out.println(myZoo.toString());
        //instruction 5 , 3)
        /*lion.family="Lions";
        lion.name="un lion";
        lion.age=5;
        lion.isMammal=true;
        myZoo.animals[0]=lion;
        myZoo.name="myZoo";
        myZoo.city="Tunis";
        myZoo.nbrCages=10;*/
    }
}