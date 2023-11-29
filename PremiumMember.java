/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2_petstore;
import java.util.ArrayList;

/**
 *
 * @author Mariah
 */
public class PremiumMember {
    private String name;
    private int memberID;    
    private ArrayList<Dog> dogsOwned = new ArrayList();
    private ArrayList<Cat> catsOwned = new ArrayList();
    private ArrayList<Exotic> exoticsOwned = new ArrayList();
    private boolean duesPaid;
    private double amountSpent = 0;

    public PremiumMember(String name, int memberID, boolean duesPaid) {
        this.name = name;
        this.memberID = memberID;
        this.duesPaid = duesPaid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public ArrayList<Dog> getDogsOwned() {
        return dogsOwned;
    }

    public void setDogsOwned(ArrayList<Dog> dogsOwned) {
        this.dogsOwned = dogsOwned;
    }

    public ArrayList<Cat> getCatsOwned() {
        return catsOwned;
    }

    public void setCatsOwned(ArrayList<Cat> catsOwned) {
        this.catsOwned = catsOwned;
    }

    public ArrayList<Exotic> getExoticsOwned() {
        return exoticsOwned;
    }

    public void setExoticsOwned(ArrayList<Exotic> exoticsOwned) {
        this.exoticsOwned = exoticsOwned;
    }

    public boolean isDuesPaid() {
        return duesPaid;
    }

    public void setDuesPaid(boolean duesPaid) {
        this.duesPaid = duesPaid;
    }

    public double getAmountSpent() {
        return amountSpent;
    }

    public void setAmountSpent(double amountSpent) {
        this.amountSpent = amountSpent;
    }
    
    public void addDog(Dog dog) {
         dogsOwned.add(dog);
    }
    public void addCat(Cat cat) {
         catsOwned.add(cat);
    }
    public void addExotic(Exotic exotic) {
         exoticsOwned.add(exotic);
    }
    
}
