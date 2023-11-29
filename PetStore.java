package project2_petstore;
import java.util.*;

 
/**
 * This class extends Pets since Pets is abstract and objects cannot be instantiated 
 * this class allows us to create objects so that methods from the interface that was implemented in Pets can be used
 */
public abstract class PetStoreExtention extends Pets{

    private String species;
    private String storeName;
    private double price;
    ArrayList<Pets> inventory= new ArrayList<Pets>();

    public PetStoreExtention(){
    }

    /**
     * This constructor takes an ArrayList as an argument
     * @param stock
     */
    public PetStoreExtention(ArrayList<Pets> stock){
    inventory= stock;    }
    /**
     * This constructor takes one parameter, a String that provides the name of the store
     * @param storeName- storeName
     */
    public PetStoreExtention(String storeName){
        this.storeName= storeName;
    }

    /**
     * Gets the name of the store 
     * @return a String that represents the name of the store
     */
    public String getStoreName(){
        return storeName;
    }

    /**
     * Gets the species of the Pets object
     * @return a String that represents the species of the Pets object
     */
    public String getSpecies(){
        return species;
    }

    /**
     * compareTo() overrides the method in Comparable
     * the comparison is between the price contained in each object
     * @return returns the price
     */
    public int compareTo(Pets other){
        double thisPet= this.price;
        double thatPet= other.getPrice();
        
        if(thisPet>thatPet){
            System.out.println("This is the higher price: ");
        }
        else if(thisPet<thatPet){
                System.out.println("This is the lower price: ");
                }
                else{
                        System.out.println("There are the same price: ");
                        }return (int)price;
                        
    }

    /**
     * inventoryValue() initiates a double, goes through the ArrayList of inventory and sums the prices to provide the total price
     * @return a double representing the total of the objects in the ArrayList
     */
    public double inventoryValue(){
        double total= 0.0;
        for(Pets i: inventory){
            total += i.getPrice();
        }return total;
    }   

}
