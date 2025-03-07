// Animal.java
// lR 3/6/25

package lailaRodriguez.myZoo.com;

public class Animal {

    private String animalName;
    private String species;
    private int age;

    // Static attribute belonging to Animal class

    public static int numOfAnimals = 0;

    // Constructors belonging to Animal Class

    public Animal(String name, String aSpecies, int anAge){
        System.out.println("\n A new Animal object was created.\n");

        // Initial values for the class attributes.
        animalName =  name;
        species = aSpecies;
        age = anAge;
        numOfAnimals++;
    }

    public Animal(){
        System.out.println("\n A new Animal object was created.\n");
        numOfAnimals++;
    }

    // Getters and Setters for each attribute
    public String getName(){
        return animalName;
    }

    public void setName(String name){
        this.animalName = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getSpecies(){
        return species;
    }

    public void setSpecies(String species){
        this.species = species;
    }


}
