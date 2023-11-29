/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package project2_petstore;
import java.util.ArrayList;

/**
 *
 * @author Mariah
 */
public interface PetStoreSpecification {
    
    /**
     * Update inventory by adding all the pets from the ArrayList
     * @param pets ArrayList of pets that will be adopted 
     */
    
    public void adoptionDrive(ArrayList<Object>pets);
    
    /**
     * Calculate and return the amount in dollars for current inventory of pets that are in stock
     */
    
    public double inventoryValue();
}
