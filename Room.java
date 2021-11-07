/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hello VIỆT
 */
public class Room {
    private int roomNo;
    private ArrayList<Animal> animalList= new ArrayList<>();
    
    public void addAnimal(Animal animal) {
        this.animalList.add(animal);
    }
    
    public void deleteAnimal(String animalName) {
        for(int i = 0;i<animalList.size();i++) {
            if(animalList.get(i).getName().equals(animalName)){
//                xoa phan tu ra khoi mang;
                animalList.remove(animalList.get(i));
//                xoa mot con duy nhat;
                break;
            } 
        }
    }

    public Room() {
    }

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }
    

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(ArrayList<Animal> animalList) {
        this.animalList = animalList;
    }

    public void display() {
        animalList.forEach(animal -> {
            animal.display();
        });
    }
  
    
    
}
