package com.udacity.jdnd.course3.critter.user.data;

import com.udacity.jdnd.course3.critter.pet.Pet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Customer extends User {

    private String phoneNumber;

    @Column(length = 500)
    private String notes;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Pet> pets;

    public Customer() {
    }

    public Customer(String phoneNumber, String notes, List<Pet> pets) {
        this.phoneNumber = phoneNumber;
        this.notes = notes;
        this.pets = pets;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
