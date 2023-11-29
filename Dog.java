package project2_petstore;

import java.util.ArrayList;
import static project2_petstore.Pets.adoptable;

/**
 *
 * @author Mariah
 */

 /**
  * This class is an extension of the Pets class   
  */
public class Dog extends Pets{

public Dog(){
    super();
}

/**
 * This constructor takes five parameters, each to provide a characteristic of the pet
 * @param name- name 
 * @param sex- sex
 * @param age- age
 * @param price- price
 * @param species- species
 */
public Dog(String name, String sex, double age, double price, String species){
    super(name, sex, age, price, species);    

}

 public static void adoptionDrive(ArrayList<Pets> inventory){        
        for(Pets i: adoptable){
            inventory.add(i);
        }
        System.out.println("Here are the pets that are availabe for adoption: ");
        for(Pets j: inventory){
            System.out.println("Name: " + j.getName()+" Sex: " + j.getSex() + " Age: " + j.getAge() + " Price: " + j.getPrice());
        }
    }
    

}
