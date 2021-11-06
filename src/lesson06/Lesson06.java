package lesson06;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ngochongdo on 10/22/2021
 */
public class Lesson06 {
    public static void main(String[] args) {
        new Lesson06().exercise01();
        new Lesson06().exercise02();
    }

    void exercise01() {
        List<Animal> animalList = new ArrayList<>();

        Animal horse = new Animal("Horse", 75);
        animalList.add(horse);
        Animal tiger = new Animal("Tiger", 100);
        animalList.add(tiger);
        Animal dog = new Animal("Dog", 60);
        animalList.add(dog);

        // Find max speed value
        int maxSpeedValue = -1;

        for (int i = 0; i < animalList.size(); i++) {
            if (maxSpeedValue < animalList.get(i).getSpeed()) {
                maxSpeedValue = animalList.get(i).getSpeed();
            }
        }
        // Find all index of animal has a same max speed
        List<Integer> animalWinIndexList = new ArrayList<>();

        for (int i = 0; i < animalList.size(); i++) {
            if (maxSpeedValue == animalList.get(i).getSpeed()) {
                animalWinIndexList.add(animalList.indexOf(animalList.get(i)));
            }
        }
        // Show all result
        System.out.println("--------- Out put Exercise01 below ---------");

        // Show all animals and speeds corresponding
        System.out.println("==> Show all animals and speeds corresponding");
        for (int i = 0; i < animalList.size(); i++) {
            System.out.print("--- " + animalList.get(i).getName() + ": ");
            System.out.print(animalList.get(i).getSpeed() + " km/h");
            System.out.println();
        }

        // Show win animal
        for (Integer i: animalWinIndexList) {
            System.out.println("==> Winner is "+animalList.get(i).getName()+" , with speed: "+animalList.get(i).getSpeed()+" km/h");
        }

    }


    void exercise02() {
        List<NewAnimal> newAnimalList=new ArrayList<>();

        NewAnimal.Builder builder=new NewAnimal.Builder();

        NewAnimal horse=builder.setName("Horse").setSpeed(75).setFlyAble(false).build();
        newAnimalList.add(horse);


        NewAnimal tiger=builder.setName("Tiger").setSpeed(100).setFlyAble(false).build();
        newAnimalList.add(tiger);

        NewAnimal dog=builder.setName("Dog").setSpeed(60).setFlyAble(false).build();
        newAnimalList.add(dog);

        NewAnimal eagle=builder.setName("Eagle").setSpeed(120).setFlyAble(true).build();
        newAnimalList.add(eagle);

        NewAnimal falcon=builder.setName("Falcon").setSpeed(150).setFlyAble(true).build();
        newAnimalList.add(falcon);

        // Find max speed value
        int maxSpeedValue = -1;

        for (int i = 0; i < newAnimalList.size(); i++) {
            if(!newAnimalList.get(i).isFlyAble()) {
                if (maxSpeedValue < newAnimalList.get(i).getSpeed()) {
                    maxSpeedValue = newAnimalList.get(i).getSpeed();
                }
            }
        }

        // Find all index of animal has a same max speed
        List<Integer> newAnimalWinIndexList = new ArrayList<>();

        for (int i = 0; i < newAnimalList.size(); i++) {
            if (maxSpeedValue == newAnimalList.get(i).getSpeed() && !newAnimalList.get(i).isFlyAble()) {
                newAnimalWinIndexList.add(newAnimalList.indexOf(newAnimalList.get(i)));
            }
        }

        // Show all result
        System.out.println("--------- Out put Exercise02 below ---------");

        // Show all animals and speeds corresponding
        System.out.println("==> Show all animals and speeds corresponding");
        for (int i = 0; i < newAnimalList.size(); i++) {
            System.out.print("--- " + newAnimalList.get(i).getName() + ": ");
            System.out.print(newAnimalList.get(i).getSpeed() + " km/h ");
            System.out.print("and flyAble is "+newAnimalList.get(i).isFlyAble());
            System.out.println();
        }

        // Show win animal
        for (Integer i: newAnimalWinIndexList) {
            System.out.println("==> Winner is "+newAnimalList.get(i).getName()+" , with speed: "+newAnimalList.get(i).getSpeed()+" km/h and flyAble is "+newAnimalList.get(i).isFlyAble());
        }

    }
}
