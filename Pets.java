package project2_petstore;
import java.util.*;

/**
 *
 * @author Mariah
 */

/**
 * This is an abstract class that implements two interfaces
 * Comparable which allows objects to be compared to one another
 * PetStoreSpecification which contains two methods that you will find in the interface
 */

public abstract class Pets implements Comparable<Pets>, PetStoreSpecification {
    
    private String name;
    private String sex;
    private double age;
    protected double price;
    private String species;
    protected static ArrayList<Pets> adoptable= new ArrayList<Pets>();
    protected ArrayList<Pets> inventory= new ArrayList<Pets>();


    /**
     * This constructor takes four parameters, each to provide a characteristic of the pet 
     * @param name- name
     * @param sex- sex
     * @param age- age
     * @param price- price
     * @param species- species
     */
    
    public Pets(String name, String sex, double age, double price, String species){
        this.name= name;
        this.sex= sex;
        this.age= age;
        this.price= price;
        this.species= species;
    }


    public Pets() {
    }

/**
 * Gets the name of the Pets object 
 * @return a String that represents the name of the Pets object
 */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the Pets object
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the sex of the Pets object
     * @return a String that represents the sex of the Pets object
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the sex of the Pets object
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Gets the age of the Pets object
     * @return a double that represents the age of the Pets object
     */
    public double getAge() {
        return age;
    }

    /**
     * Sets the age of the Pets object
     * @param age
     */
    public void setAge(double age) {
        this.age = age;
    }
    
    /**
     * Gets the price of the Pets object
     * @return a double that represents the price of the Pets object
     */
    public double getPrice(){
        return price;
    }
    
    /**
     * Sets the price of the Pets object
     * @param price
     */
    public void setPrice(double price){
        this.price= price;
    }
    
    public String getSpecies(){
        return species;
    }
    
    public void setSepcies(String species){
        this.species= species;
    }
    
    /**
     * Prints the name
     */
    public void display(){
        System.out.println(this.name);
    }  

    /**
     * compareTo() overrides the method in Comparable, takes instance variables specific to this class to compare to one another
     * the comparison is between the price contained in each object
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
     * adoptionDrive() adds objects to an ArrayList that represents the pets currently in stock
     * after adding the new pet object, it iterates through the ArrayList and prints out every pet in stock
     * @param inventory
     */
    public static void adoptionDrive(ArrayList<Pets> inventory){        
        for(Pets i: adoptable){
            inventory.add(i);
        }
        System.out.println("Here are the pets that are availabe for adoption: ");
        for(Pets j: inventory){
            System.out.println("Name: " + j.getName()+" Sex: " + j.getSex() + " Age: " + j.getAge() + " Price: " + j.getPrice());
        }
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