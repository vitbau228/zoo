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
public class Zoo {
    private final ArrayList<Room> roomList = new ArrayList<>();
    public void addRoom(Room room) {
        this.roomList.add(room);
    }
    
    public Room getRoom(int roomNo) {
        for(int i= 0;i<roomList.size();i++) {
            if(roomList.get(i).getRoomNo()== roomNo) {
                return roomList.get(i);
            }
                
            
        }
        return null;
    }
    
    public void deleteRoom(int roomNo) {
        for(int i = 0; i< roomList.size();i++) {
            if(roomList.get(i).getRoomNo() == roomNo ) {
                roomList.remove(i);
                break;
            }
        }
    }
    
   
    private void displayAllRoom() {
        for(int i = 0; i <roomList.size();i++) {
            System.out.println("Ma room : "+ roomList.get(i).getRoomNo()+ "  -  ");
        }
    }
    public void addAnimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon room can them dong vat");
        displayAllRoom();
        int roomNo = Integer.parseInt(sc.nextLine());
        System.out.println("Hay chon loai dong vat can them");
        System.out.println("1: loai ho");
        System.out.println("2: loai cho");
        System.out.println("3: loai meo");
       
        Animal animal = null;
        int choose;
        do{
            choose = Integer.parseInt(sc.nextLine());            
            switch (choose) {
                case 1:
                    animal = new Tiger();
                    break;
                 case 2:
                    animal = new Dog();
                    break;             
                case 3:
                    animal = new Cat();
                    break;
                default:
                    System.out.println("vui long nhap tu 1 den 3");
            }
            
        
        
            
         }while(choose >= 4);
         animal.input();
         Room room = this.getRoom(roomNo);
         if(room != null) {
             room.addAnimal(animal);
         }else {
             System.out.println("Hien tai chua tao room nao , vui long khoi tao room truoc");
         }
         
//         test getRoom2
//            for(int i= 0;i<roomList.size();i++) {
//            if(roomList.get(i).getRoomNo()== roomNo) {
//               roomList.get(i).addAnimal(animal);
//            }
//                
//            
//            }
        
       
    }
    
    public void deleteAnimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten dong vat can xoa");
        String AnimalName = sc.nextLine();
        
        roomList.forEach(room -> room.deleteAnimal(AnimalName));
    }

    public void showAllInfo() {
        for(Room room: roomList) {
            room.display();
        }
    }
    
}
