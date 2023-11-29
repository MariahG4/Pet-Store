package project2_petstore;

/**
 *
 * @author Mariah
 */

 /**
  * This class is an extension of the Pets class   
  */
public class Cat extends Pets{
    

public Cat(){
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
    public Cat(String name, String sex, double age, double price, String species){
    super(name, sex, age, price, species);    

        
    }

}
