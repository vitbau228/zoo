/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.Scanner;

/**
 *
 * @author Hello VIỆT
 */
public class ManagerZoo {
    private final  Zoo zoo = new Zoo();
    private final  Scanner sc = new Scanner(System.in);
     void inputRoom() {
        
        System.out.println("Nhap so luong room can them");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i<n;i++) {
            Room room = new Room();
            System.out.println("Nhap roomNo");
            room.setRoomNo( Integer.parseInt(sc.nextLine()));
            zoo.addRoom(room);
        }    
    }
    
    void deleteRoom() {
        System.out.println("Nhap ma phong can xoa");
        int roomNo = Integer.parseInt(sc.nextLine());
        zoo.deleteRoom(roomNo);
    }
    
      void addAnimal() {
        zoo.addAnimal();
    }
    
     void deleteAnimal() {
        zoo.deleteAnimal();
    }
     void showFUllInfo() {
        zoo.showAllInfo();
    
    }
     void showMenu() {
        System.out.println("1: Them room");
        System.out.println("2: xoa room");
        System.out.println("3: Them dong vat");
        System.out.println("4: xoa dong vat");
        System.out.println("5: Xem tat ca thong tin");
        System.out.println("6: Thoat");
        System.out.println("-------------------------------------");
    }
   

}
