package main;

import entities.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Lions","un lion",5,true);
        Zoo myZoo = new Zoo("myZoo","Tunis");
        Animal Tiger = new Animal("Tigers","un tiger",5,true);
        Animal panda = new Animal("Pandas","un panda",4,true);
        Animal bear= new Animal("Bears","un bear",3,true);
        //myZoo.displayZoo();
        //System.out.println(myZoo);
        //System.out.println(panda);
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

        myZoo.addAnimal(lion);
        myZoo.addAnimal(Tiger);
        myZoo.addAnimal(bear);

        //myZoo.afficheAnimal();

        myZoo.addAnimal(panda);
        myZoo.addAnimal(panda);
        myZoo.removeAnimal(panda);

        myZoo.searchAnimal(lion);
/************************************************************************************/
//prosit 5
        //Aquatic a1= new Aquatic("Balaenopteridae", "Blue Whale", 25, true, "Sea");
        Terrestrial t1= new Terrestrial("Elephantidae", "Elephant", 15, true, 4);
        Dolphin d1= new Dolphin("Delphinidae", "Dolphin", 6, true, "Ocean", 25.5f);
        Pengouin p1= new Pengouin("Spheniscidae", "Penguin", 4, false, "Antarctica", 30.2f);

        //System.out.println(a1);
        System.out.println(t1);
        System.out.println(d1);
        System.out.println(p1);

        //a1.swim();
        d1.swim();
        p1.swim();

        //prosit 6
        //myZoo.addAquaticAnimal(a1);
        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(p1);

        myZoo.aquaticSwim();

        System.out.println("Max penguin depth: " + myZoo.maxPenguinSwimmingDepth() + " meters");

        myZoo.displayNumberOfAquaticsByType();

        Dolphin d2 = new Dolphin("Delphinidae", "Blue", 7, true, "Sea", 30f);
        System.out.println("d2 equals d3 ? " + d1.equals(d2));

    }

}